package com.cao.see.controller;

import com.cao.see.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Puck Cao
 * @date 2022/12/8 2:36 PM
 */
@Controller
@ResponseBody
public class PersonController {


    @Autowired
    private PersonService personService;


    @GetMapping("/test")
    public String test1(){
        return "test1";
    }
}
