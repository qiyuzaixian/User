package com.user.common;

import com.user.domain.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;


public class ResourceImportRegistar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(User.class);
        builder.setAutowireMode(RootBeanDefinition.AUTOWIRE_BY_TYPE);
        registry.registerBeanDefinition("User",builder.getBeanDefinition());

    }
}
