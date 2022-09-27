package com.lab.findme.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HelloController {

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/main")
    public String hello(){
        return "main";

    }
    @GetMapping("/index")
    public String index(){
        return "index";

    }

}
