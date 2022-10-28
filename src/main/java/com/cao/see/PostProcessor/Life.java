package com.cao.see.PostProcessor;


import com.cao.see.Beans.Bean1;
import com.cao.see.Beans.Bean2;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Puck Cao
 * @date 2022/10/21 10:24 AM
 */
@Component
@Data
public class Life {

    @Autowired
    private Bean1 bean1;

    @Autowired
    private Bean2 bean2;
}
