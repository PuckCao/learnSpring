package com.cao.see.service;

import com.cao.see.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Puck Cao
 * @date 2022/12/8 2:37 PM
 */
@Service
public class PersonService {


    @Autowired
    private PersonDao personDao;
}
