package com.user.domain;

import org.springframework.stereotype.Component;

public class User {
    public Order order;
    public void setOrder(Order order){
        this.order = order;
    }
    public Order getOrder(){
        System.out.println("------");
        return this.order;
    }
}
