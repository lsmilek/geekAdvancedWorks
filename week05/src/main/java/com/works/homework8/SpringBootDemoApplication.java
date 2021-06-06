package com.works.homework8;

import com.works.homework10.HikariDemo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.works.*"})
@MapperScan("com.works.homework10.mapper")
public class SpringBootDemoApplication {
    public static void main(String[] args){
        ConfigurableApplicationContext context =SpringApplication.run(SpringBootDemoApplication.class, args);

        School school = (School) context.getBean("school");
        school.ding();

        //获取不到mapper实例？？？？
        HikariDemo hikariDemo = (HikariDemo) context.getBean("hikariDemo");
        hikariDemo.insert();





    }
}
