package com.works.homework2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @ClassName SpringXmlDemo
 * @Description 通过XML装配Bean
 * @Author yqr
 * @Date 2021/6/3 17:14
 */
public class SpringXmlDemo {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Order order = (Order) applicationContext.getBean("order");
        System.out.println(order.toString());

        OrderResult orderResult = (OrderResult) applicationContext.getBean("orderResult");
        System.out.println(orderResult.getOrderList().size());

        //通过@Component注解实现装配Bean
        MerInf merInf = (MerInf) applicationContext.getBean("merInf");
        System.out.println(merInf);
    }
}
