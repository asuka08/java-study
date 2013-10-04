package com.verysb.aop.impl;

import com.verysb.aop.Person;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-10-4
 * Time: 下午3:48
 * To change this template use File | Settings | File Templates.
 */
@Component("chinese")
public class Chinese implements Person {

    @Override
    public String sayHello(String name) {
        return name + " Hello, Spring AOP";
    }

    @Override
    public void eat(String food) {
        System.out.println("i'm eating " + food);
    }
}
