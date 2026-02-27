package com.cloudthat;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        User u1 = (User) ctx.getBean(User.class);
        u1.setUserName("vishwas");
        u1.setEmailId("vishwas@cloudthat.com");

        System.out.println("User name:" + u1.getUserName());
        System.out.println("User email id: "+ u1.getEmailId());
        System.out.println("User email id: "+ u1.getPhoneNumber());

        User u2 = (User) ctx.getBean("user");

        System.out.println("User name:" + u2.getUserName());
        System.out.println("User email id: "+ u2.getEmailId());

        u2.setEmailId("vishwas@cloudthat.com");
        System.out.println("User2 email id: "+ u2.getEmailId());
        System.out.println("User1 email id: "+ u1.getEmailId());

    }
}