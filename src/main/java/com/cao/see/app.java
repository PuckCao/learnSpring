package com.cao.see;


import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @author Puck Cao
 * @date 2022/10/4 7:31 PM
 */
@SpringBootApplication
public class app {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(app.class, args);
        Object life = context.getBean("life");
        System.out.println(life);
        System.out.println(life.getClass());
        context.close();
    }
}
