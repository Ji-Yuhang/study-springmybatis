package com.jiyuhang.listenr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Mylistener implements ServletContextListener {
    private ClassPathXmlApplicationContext context;
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        this.context = new ClassPathXmlApplicationContext("classpath:com/jiyuhang/spring.xml");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        this.context.close();
    }
}
