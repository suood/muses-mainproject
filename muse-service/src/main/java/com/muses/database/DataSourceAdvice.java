package com.muses.database;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by mysgq1 on 15/6/23.
 */
public class DataSourceAdvice implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice {

    public void before(Method method, Object[] args, Object target) throws Throwable {
//        System.out.println(": " + target.getClass().getName() + "" + method.getName() + "");
//        if(method.getName().toLowerCase().startsWith("add")
//                || method.getName().startsWith("create")
//                || method.getName().startsWith("save")
//                || method.getName().startsWith("edit")
//                || method.getName().startsWith("insert")
//                || method.getName().startsWith("merge")
//                || method.getName().startsWith("update")
//                || method.getName().startsWith("delete")
//                || method.getName().startsWith("remove")){
//            System.out.println(": master");
//            DataSourceSwitcher.setMaster();
//        }
//        else  {
//            System.out.println(": slave");
//            DataSourceSwitcher.setSlave();
//        }
    }

    // service
    public void afterReturning(Object arg0, Method method, Object[] args, Object target) throws Throwable {
    }

    // Exception
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
//        DataSourceSwitcher.setSlave();
//        System.out.println(",: slave");
    }
}
