package com.user;

import com.user.common.CommonPostProcessor;
import com.user.config.UserConfig;
import com.user.dao.UserDao;
import com.user.domain.User;
import com.user.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

//@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);

        System.out.println(context.getBean(UserService.class));
        //System.out.println(context.getBean(User.class).getOrder());
    }

}
