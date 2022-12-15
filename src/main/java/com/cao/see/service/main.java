package com.cao.see.service;

import com.cao.see.webconfig;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;

/**
 * @author Puck Cao
 * @date 2022/12/15 3:53 PM
 */
public class main {
    public static void main(String[] args) {
        AnnotationConfigServletWebServerApplicationContext context = new AnnotationConfigServletWebServerApplicationContext(webconfig.class);
    }
}
