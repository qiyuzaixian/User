package com.user.common;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MapperFactoryBean implements FactoryBean,InvocationHandler {

    Class clz;
    public MapperFactoryBean(Class clz){
        this.clz = clz;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("XXX");
        return method.invoke(this,args);
    }

    @Override
    public Object getObject() throws Exception {
        Class[] cls = new Class[]{clz};
        Object proxy=Proxy.newProxyInstance(this.getClass().getClassLoader(),cls,this);
        return proxy;
    }

    @Override
    public Class<?> getObjectType() {
        return clz;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
