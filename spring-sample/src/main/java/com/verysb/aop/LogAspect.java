package com.verysb.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-10-4
 * Time: 上午10:39
 * To change this template use File | Settings | File Templates.
 */
@Aspect
public class LogAspect {

    @Before("execution(* com.verysb.aop.impl.*.*(..))")
    public void log()
    {
        System.out.println("write log...");
    }

    @AfterReturning(returning = "rvt", pointcut = "execution(* com.verysb.aop.impl.*.*(..))")
    public void log2(Object rvt)
    {
        System.out.println("after log" + rvt);
    }
}
