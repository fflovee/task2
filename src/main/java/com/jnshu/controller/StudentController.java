package com.jnshu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jnshu.pojo.Student;
import com.jnshu.service.StudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    private Logger log = LogManager.getLogger(StudentController.class);

    /*分页查询*/
//    @ResponseBody
    @RequestMapping(value = "/student/page/{page}" , method = RequestMethod.GET)
    public ModelAndView selStuList(@PathVariable(value = "page") Integer page) {
        PageHelper.startPage(page,10);//分页插件，pageSize设置每页条数
        List<Student> list = studentService.getStudent();//获取Student list集合
        PageInfo<Student> pageInfo = new PageInfo<>(list);//分页集
        ModelAndView mav = new ModelAndView("liststu");//返回视图层
        mav.addObject("pageInfo",pageInfo.getList());
        mav.addObject("code",1203);
//        mav.setView(new MappingJackson2JsonView());
        return mav;
    }

/*    *//*分页查询*//*
    @ResponseBody
    @RequestMapping("/stude.tliststu")
    public ModelAndView selStuList(Page page) {
        ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),10);//分页插件，pageSize设置每页条数
        List<Student> pageinfo = studentService.getStudent();//获取Student list集合
        int total = (int) new PageInfo<>().getTotal();
        page.caculateLast(total);
        mav.addObject("list", pageinfo);
        mav.setViewName("liststu");
//        mav.setView(new MappingJackson2JsonView());
        return mav;
    }*/

    /*删除信息*/
    @RequestMapping(value = "/student/del/{id}" , method = RequestMethod.DELETE)
    public String delStudent(@PathVariable Integer id) {
        studentService.delStuById(id);
        log.info("=====删除学员信息成功=====");
//       ModelAndView mav = new ModelAndView("success");
        return "redirect:/student/page/1000";
    }

    /*添加成员*/
    @RequestMapping(value = "/student/addstu" , method = RequestMethod.GET)
    public String addPage() {
        log.info("跳转添加页面");
        return "addstu";
    }

    @RequestMapping(value = "/student/add" , method = RequestMethod.POST)
    public ModelAndView addStu(Student student) {
        ModelAndView mav = new ModelAndView("success");
        log.info("+++++++++++++++++++++++++++++++++");
        studentService.insStu(student);
        log.info("===========学员添加成功===========");
        return mav;
    }

    /*根据id查信息，并跳转到更新界面*/
    @RequestMapping(value = "/student/update/{id}" , method = RequestMethod.POST)
    public ModelAndView updateStu(@PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView("update");
        Student student= studentService.selStuById(id);
        mav.addObject("stu",student);
//        mav.setView(new MappingJackson2JsonView());
        return mav;
    }

    /*实际做更新的操作*/
    @RequestMapping(value = "/student/update" , method = RequestMethod.POST)
    public ModelAndView updatePage(Student student) {
        log.info(student);
        ModelAndView mav = new ModelAndView("success");
        studentService.upStuById(student);
        log.info("============学员信息更新成功============");
        mav.addObject("code", 1203);
        return mav;
    }

}
