package com.cloudthat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean(name = "user")
    public User user(){
        User u = new User();
        u.setUserName("Vishwas");
        u.setEmailId("vishwas@cloudthat.com");
        return u;
    }

    @Bean(name = "phoneNumber")
    public PhoneNumber phoneNumber(){
        return new PhoneNumber("+91","1234567890");
    }
}
