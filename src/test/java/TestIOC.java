import com.cao.see.config;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Objects;

/**
 * @author Puck Cao
 * @date 2022/12/8 2:44 PM
 */
public class TestIOC {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
//        ConfigurableApplicationContext context = SpringApplication.run(app2.class);
//        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }
//        ConfigurableApplicationContext context = SpringApplication.run(app2.class);
//        System.out.println(context);
        System.out.println(context);
        for (String beanDefinitionName : context.getBeanFactory().getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("-----------");
        for (BeanFactoryPostProcessor beanFactoryPostProcessor : context.getBeanFactoryPostProcessors()) {
            System.out.println(beanFactoryPostProcessor);
        }
    }
}

