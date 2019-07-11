package com.user.common;

import com.user.dao.UserDao;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MapperScanRegistar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(UserDao.class);
        GenericBeanDefinition definition = (GenericBeanDefinition) builder.getBeanDefinition();
        definition.getConstructorArgumentValues().addGenericArgumentValue(definition.getBeanClassName());
        definition.setBeanClass(MapperFactoryBean.class);
        registry.registerBeanDefinition("userDao",definition);
    }
}
