package com.cao.see;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Puck Cao
 * @date 2022/10/4 7:31 PM
 */
@SpringBootApplication()
public class app2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
//        ConfigurableApplicationContext context = SpringApplication.run(app2.class);
//        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }
//        ConfigurableApplicationContext context = SpringApplication.run(app2.class);
//        System.out.println(context);
    }
}
