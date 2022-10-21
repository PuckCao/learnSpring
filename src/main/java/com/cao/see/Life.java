package com.cao.see;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Puck Cao
 * @date 2022/10/21 10:24 AM
 */
@Component
public class Life {
    private static final Logger logger = LoggerFactory.getLogger(Life.class);


    public Life() {
        logger.info("构造");
    }

    @Autowired
    public void auto(@Value("hhh") String h){
        logger.info("注入{}",h);
    }

    @PostConstruct
    public void init(){
        logger.info("初始化");
    }

    @PreDestroy
    public void destory(){
        logger.info("销毁");
    }
}
