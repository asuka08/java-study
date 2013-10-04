package com.verysb;

/*
import com.verysb.service.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
*/

import com.verysb.aop.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Person p = context.getBean("chinese", Person.class);

        System.out.println(p.sayHello("mike"));
        p.eat( "milk");

    }

    public void sayHello()
    {
        System.out.println("hello aspectj!");
    }

}
