package com.cao.see.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Puck Cao
 * @date 2022/12/13 11:41 AM
 */
@Component
public class OutBean {

    @Autowired
    private InBean inBean;
}
