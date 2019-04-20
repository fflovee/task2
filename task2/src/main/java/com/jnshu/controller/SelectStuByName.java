package com.jnshu.controller;

import com.jnshu.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/student")//为控制器指定可以处理请求的URL
public class SelectStuByName {

    @Resource
    private StudentService studentService;
    private String stuName;
}
