package com.cao.demo;


import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @author Puck Cao
 * @date 2022/10/4 7:31 PM
 */
@SpringBootApplication
public class app {
    public static void main(String[] args) throws Exception{
        ConfigurableApplicationContext applicationContext = SpringApplication.run(app.class, args);
        Field declaredField = DefaultSingletonBeanRegistry.class.getDeclaredField("singletonObjects");
        System.out.println(declaredField);
        declaredField.setAccessible(true);
        ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();
        Map<String,Object> objectMap = (Map<String,Object>)declaredField.get(beanFactory);
        System.out.println(applicationContext.getEnvironment());
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(config.class);

    }
}
