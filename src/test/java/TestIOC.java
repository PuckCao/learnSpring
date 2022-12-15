
import com.cao.see.webconfig;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author Puck Cao
 * @date 2022/12/8 2:44 PM
 */
public class TestIOC {

    @Test
    public void test() {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
//        ConfigurableApplicationContext context = SpringApplication.run(app2.class);
//        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }
//        ConfigurableApplicationContext context = SpringApplication.run(app2.class);
//        System.out.println(context);
        AnnotationConfigServletWebServerApplicationContext context = new AnnotationConfigServletWebServerApplicationContext(webconfig.class);
    }
}

