package com.cao.see.controller;

import com.cao.see.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Puck Cao
 * @date 2022/12/8 2:36 PM
 */
@Controller
public class PersonController {


    @Autowired
    private PersonService personService;
}
