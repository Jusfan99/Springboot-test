package com.jsf.test.springdemo;

import com.jsf.test.springdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * @author SifanJia <jiasifan03@kuaishou.com>
 * Created on ${2021}-${12}-${1}
 */

@RestController
public class DemoController {

//    @Autowired
//    private Person person;
//
//    @Value("${name}")
//    private String name;
//
//    @Autowired
//    private Environment environment;
//
//    @RequestMapping("/person")
//    public String person() {
//        return person.toString();
//    }
//
//    @RequestMapping("/test")
//    public String demo() {
//        return "demo test";
//    }
//
//    @RequestMapping("/name")
//    public String name() {
//        return name;
//    }
//
//    @RequestMapping("/env")
//    public String env() {
//        return environment.getProperty("person.name");
//    }

    private DemoService service;

    @Autowired
    public DemoController(DemoService service) {
        this.service = service;
    }

    @GetMapping(value = "/get")
    public String getTest(@RequestParam(value = "age", required = false, defaultValue = "23") Integer age) {
        if (Objects.equals(service.getAge(), age)) {
            return service.getName();
        } else {
            return service.toString();
        }
    }


    @PostMapping(value = "/post")
    public String postTest(@RequestBody Person person) {
        return person.toString();
    }

    @DeleteMapping(value = "/delete")
    public void deleteTest(@RequestParam Integer id) {
        return;
    }

    @PutMapping(value = "/put")
    public void putTest(@RequestParam Integer id) {
        return;
    }


}
