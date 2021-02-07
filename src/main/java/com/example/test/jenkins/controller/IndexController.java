package com.example.test.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/test")
    public String test(){
        return  String.valueOf(System.currentTimeMillis())+" jenkins build SCM";
    }
}
