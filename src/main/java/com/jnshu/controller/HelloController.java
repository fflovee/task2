package com.jnshu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HelloController {
    @RequestMapping(value = "/")
    public String getStudent(){
        return "index";
    }
}
