package com.ssm.test;

import com.ssm.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {

    @Test
    public void testSpring(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IAccountService accountService = (IAccountService)ac.getBean("accountService");
        accountService.findAll();
    }

    @Test
    public void testIAccountServiceSaveAccount(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:");
    }
}
