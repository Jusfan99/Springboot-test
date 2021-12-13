package com.jsf.test.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

/**
 * @author SifanJia <jiasifan03@kuaishou.com>
 * Created on ${2021}-${12}-${1}
 */
@Configuration
public class AppConfig {

    @Bean
    @SessionScope
    public Person initPerson() {
        Person person = new Person();
        person.setName("testScope");
        person.setAge(99);
        return person;
    }
}
