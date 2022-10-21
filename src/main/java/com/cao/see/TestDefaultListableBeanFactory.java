package com.cao.see;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigUtils;

import java.util.Arrays;

/**
 * @author Puck Cao
 * @date 2022/10/15 9:17 PM
 */
@Slf4j
public class TestDefaultListableBeanFactory {
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        //利用BeanDefinitionBuilder 传入要出初始化类的.class 实例化BeanDefinition的对象
        // (实际是GenericBeanDefinition，是BeanDefinition的实现类)，通过BeanDefinitionBuilder，建造者模式
        // 来设置beanDefinition属性(bean定义)，得到BeanDefinition对象
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(config.class).setScope("singleton").getBeanDefinition();
        //利用DefaultListableBeanFactory的registerBeanDefinition(继承重写自BeanDefinitionRegistry接口)，
        // 利用DefaultListableBeanFactory的registerBeanDefinition方法传入BeanDefinition对象在BeanFactory中注册Bean
        defaultListableBeanFactory.registerBeanDefinition("config",beanDefinition);

        //给BeanFactory增加解析注解的后处理器，将这几个后处理器加入bean工厂
        AnnotationConfigUtils.registerAnnotationConfigProcessors(defaultListableBeanFactory);

        System.out.println("-----------");
        //得到BeanFactory当中的后处理器PostProcessor
        for (BeanFactoryPostProcessor value : defaultListableBeanFactory.getBeansOfType(BeanFactoryPostProcessor.class).values()) {
            System.out.println(value);
        }
        System.out.println("qqqqqqqq");
        Arrays.stream(defaultListableBeanFactory.getBeanDefinitionNames()).forEach(System.out::println);
        //System.out.println(defaultListableBeanFactory.getBean("bean1"));
        System.out.println("++++++++++");
        defaultListableBeanFactory.getBeansOfType(BeanFactoryPostProcessor.class).values().stream().
                forEach(x -> {x.postProcessBeanFactory(defaultListableBeanFactory);});
        defaultListableBeanFactory.getBeansOfType(BeanPostProcessor.class).values().forEach(defaultListableBeanFactory::addBeanPostProcessor);
        defaultListableBeanFactory.getBeansOfType(BeanPostProcessor.class).values().stream().sorted(defaultListableBeanFactory.getDependencyComparator())
                .forEach(x -> {});
        System.out.println("**"+defaultListableBeanFactory.getBeanProvider(Bean1.class));
        System.out.println(defaultListableBeanFactory.isTypeMatch("bean1",Bean2.class));

    }
}
