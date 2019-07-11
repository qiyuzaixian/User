package com.user.config;

import com.user.annotation.EnableImportRegistar;
import com.user.annotation.EnableImportSelector;
import com.user.annotation.MapperScan;
import com.user.service.Impl.UserServiceImpl;
import com.user.service.Impl.UserServiceImpl1;
import com.user.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@ComponentScan(basePackages = "com.user")
//@EnableImportSelector
//@EnableImportRegistar
//@EnableTransactionManagement
//@MapperScan
public class UserConfig {

//    @Bean
//    public UserService userService(){
//
//        return new UserServiceImpl();
//    }
//    @Bean
//    public UserService userService1(){
//        userService();
//        return new UserServiceImpl1();
//    }

}
