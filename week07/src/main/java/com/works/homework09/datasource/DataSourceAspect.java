package com.works.homework09.datasource;
import com.works.homework09.entity.TProviderTransMap;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Aspect
@Configuration
@Order(-10)
public class DataSourceAspect {
	
	@Autowired
    DynamicDataSource dynamicDataSource;

	/**
     * 使用空方法定义切点表达式
     */
    @Pointcut("execution(* com.works.homework09.mapper.*.*(..))")
    public void declareJointPointExpression() {
    }

    @Before("declareJointPointExpression()")
    public void setDataSourceKey(JoinPoint point){


      if(point.getTarget() instanceof TProviderTransMap
    		  ){
          DatabaseContextHolder.setDatabaseType(DatabaseType.dataSourceOn);
          System.out.println("当前使用数据源:" + DatabaseType.dataSourceOn);
      }else{
          DatabaseContextHolder.setDatabaseType(DatabaseType.dataSourceOff);
          System.out.println("当前使用数据源:" + DatabaseType.dataSourceOff);
      }

    }
    
    @After("declareJointPointExpression()")
    public void removeDataSourceKey(JoinPoint point){
    	DatabaseContextHolder.CONTEXT_HOLDER.remove();
    }
}
