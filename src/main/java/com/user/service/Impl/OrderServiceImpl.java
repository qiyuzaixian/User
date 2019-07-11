package com.user.service.Impl;

import com.user.service.OrderService;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    public UserService userService;
}
