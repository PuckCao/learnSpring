package com.cao.see;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Puck Cao
 * @date 2022/10/5 10:31 PM
 */
@Configuration
public class config {
    @Bean
    public Bean1 bean1(){
        return new Bean1();
    }
    @Bean
    public Bean2 bean2(){
        return new Bean2();
    }
}


@Data
class Bean1{
    private String name;

    @Autowired
    private Bean2 bean2;


}

@Data
class Bean2{
    private String name;

}

