package com.springMVC.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class HelloController {


    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hao");
        return "success";
    }

    @RequestMapping(path = "/testRequestMapping")
    public String testRM(){
        System.out.println("testRequestMapping");
        return "success";
    }
}
