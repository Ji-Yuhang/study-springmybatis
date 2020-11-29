package com.jiyuhang.test;

import com.jiyuhang.entity.User;
import com.jiyuhang.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.BadSqlGrammarException;

import javax.naming.Context;
import java.sql.SQLSyntaxErrorException;
import java.util.List;

public class TestUserService {
    private ClassPathXmlApplicationContext context;
    @Before
    public  void before(){
        this.context = new ClassPathXmlApplicationContext("classpath:com/jiyuhang/spring.xml");
//        this.context = new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void testSave(){
        UserService userService = (UserService) context.getBean("userService");
        userService.save(new User(Long.valueOf(13),"jiyuhang2", 29));
//        System.out.println("users isEmpty"+ users.isEmpty());
//        users.forEach(user-> System.out.println(user != null ? user.toString() : "Empty User Entity"));
    }

    @Test
    public void testUpdate(){
        UserService userService = (UserService) context.getBean("userService");
        userService.update(new User(Long.valueOf(1),"jiyuhang3", 30));
//        System.out.println("users isEmpty"+ users.isEmpty());
//        users.forEach(user-> System.out.println(user != null ? user.toString() : "Empty User Entity"));
    }

    @Test
    public void testFindAll(){
        UserService userService = (UserService) context.getBean("userService");
        List<User> users =  userService.findAll();
        if(users != null ){
            System.out.println("users isEmpty"+ users.isEmpty());
            users.forEach(user-> System.out.println(user != null ? user.toString() : "Empty User Entity"));
        } else {
            System.out.println("users is null");

        }

    }
    @Test
    public void testFindById(){
        UserService userService = (UserService) context.getBean("userService");
        try {
            User user2 = userService.findById(Long.valueOf(1));
            System.out.println("users id: 1 is "+ user2.toString());
        } catch ( BadSqlGrammarException e){
            System.out.println("----------BadSqlGrammarException ");
            System.out.println("sql: "+e.getSql());
            System.out.println(e.getSQLException());
            System.out.println(e.getRootCause());
//            e.getSql()
            System.out.println(e.toString());

        }


    }
    @Test
    public void testGetCount(){
        UserService userService = (UserService) context.getBean("userService");
        int count = userService.getCount();
        System.out.println("users count is "+ count);
    }

    @After
    public void after(){
        context.close();
    }
    public static void main(String[] args) {

//        UserService userService = (UserService) context.getBean("userService");
//        userService.setName("jiyuhang");
//        userService.save(new User(null, "jiyuhang", 28));
//        userService.findAll();
    }
}
