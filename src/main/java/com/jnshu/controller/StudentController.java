package com.jnshu.controller;

import com.jnshu.pojo.Student;
import com.jnshu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student" , method = RequestMethod.GET)
    public ModelAndView getStudent() {
        Student student = studentService.selStuByName("秦丽丽");
        ModelAndView modelAndView = new ModelAndView("selectStuByName");
        modelAndView.addObject("stu", student);
        return modelAndView;
    }

    @GetMapping("/abc")
    @ResponseBody
    public String aaa() {
        return "aaa";
    }
}

