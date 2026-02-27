package com.cloudthat;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        UserDao udao = (UserDao) ctx.getBean(UserDao.class);

        udao.saveUser("vishwas","vishwas1@cloudthat.com","1234567890");
        System.out.println("User Saved: "+ udao.getUserById(2));

    }
}