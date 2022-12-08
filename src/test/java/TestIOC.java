import com.cao.see.config;
import org.junit.Test;
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
        for (String s : context.getBeanNamesForType(Objects.class)) {
            System.out.println(s);
        }
    }
}

