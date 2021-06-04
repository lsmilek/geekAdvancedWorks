package com.works.homework2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName SpringDemoByAnnotation
 * @Description TODO
 * @Author yqr
 * @Date 2021/6/3 17:42
 */
public class SpringDemoByAnnotation {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        //通过@Component注解实现装配Bean
        MerInf merInf = (MerInf) applicationContext.getBean("merInf");
        System.out.println(merInf);
        PayController payController = (PayController) applicationContext.getBean("payController");
        payController.pay("1");
    }

}
