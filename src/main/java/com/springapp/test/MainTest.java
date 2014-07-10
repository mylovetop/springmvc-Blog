package com.springapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zdsoft on 14-7-7.
 */
public class MainTest {

    public static void main(String[] args){
        String DEFAULT_CONTEXT_FILE = "spring/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(DEFAULT_CONTEXT_FILE);
        TestService testService = (TestService)context.getBean("testService");



        System.out.println("1--第一次查找并创建cache");
        testService.getAllObject();

        System.out.println("2--在cache中查找");
        testService.getAllObject();

        System.out.println("3--remove cache");
        testService.updateObject(null);

        System.out.println("4--需要重新查找并创建cache");
        testService.getAllObject();
    }
}
