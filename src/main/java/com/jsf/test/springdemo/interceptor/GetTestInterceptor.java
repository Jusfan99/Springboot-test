package com.jsf.test.springdemo.interceptor;

import com.jsf.test.springdemo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author SifanJia <jiasifan03@kuaishou.com>
 * Created on ${2021}-${12}-${1}
 */
public class GetTestInterceptor implements HandlerInterceptor {

    @Autowired
    Person initPerson;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        initPerson.setName(initPerson.getName() + ": init");
        return true;
    }
}
