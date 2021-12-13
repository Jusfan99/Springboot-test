package com.jsf.test.springdemo.service;

import com.jsf.test.springdemo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author SifanJia <jiasifan03@kuaishou.com>
 * Created on ${2021}-${12}-${1}
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private Person initPerson;

    @Override
    public Integer getAge() {
        return 23;
    }

    @Override
    public String getName() {
        return initPerson.getName();
    }

    @Override
    public String toString() {
        return initPerson.toString();
    }
}
