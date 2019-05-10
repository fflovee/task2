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
import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    private Logger log = LogManager.getLogger(StudentController.class);

    @RequestMapping(value = "/")
    public String toHome() {
        return "/home";
    }

    /*分页查询*/
    @RequestMapping(value = "/student/page/{page}" , method = RequestMethod.GET)
    public ModelAndView selStuList(@PathVariable(value = "page") Integer page) {
        PageHelper.startPage(page,10);//分页插件，pageSize设置每页条数
        List<Student> list = studentService.getStudent();//获取Student list集合
        PageInfo<Student> pageInfo = new PageInfo<>(list);//分页集
        ModelAndView mav = new ModelAndView("liststu");//返回视图层
        mav.addObject("pageInfo",pageInfo.getList());
//        mav.setView(new MappingJackson2JsonView());
        return mav;
    }

/*    *//*删除信息*//*
    @RequestMapping(value = "student/delete/{id}", method = RequestMethod.DELETE)
    public String delStudent(@PathVariable Integer id) {
        studentService.delStuById(id);
        log.info("删除学员信息成功");
//        return "redirect:/student/page/1";
        return "redirect:/student/update";
    }*/

    /*删除信息*/
    @RequestMapping(value = "/student/delete/{id}" , method = RequestMethod.DELETE)
    public ModelAndView delStudent(@PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("success");
        studentService.delStuById(id);
        log.info("===================删除学员信息成功===================");
        return mav;
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
        return mav;
    }

    /*实际做更新的操作*/
    @RequestMapping(value = "/student/update" , method = RequestMethod.POST)
    public ModelAndView updatePage(Student student) {
        ModelAndView mav = new ModelAndView("success");
        studentService.upStuById(student);
        log.info("============学员信息更新成功============");
        return mav;
    }


/*    @RequestMapping(value = "/123id" , method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id) {
        System.out.println("++++++++++++++++++++++++");
        studentService.delStuById(id);
        System.out.println("delete success");
        log.info("delete success");
        return "student";
    }*/

/*    @RequestMapping(value ="page/{page}" ,method =RequestMethod.GET)
    @ResponseBody
    public PageInfo findAll (@PathVariable("page") Integer page) {
        PageHelper.startPage(page,5);
        List<Student> list = studentService.getStudent();
        PageInfo pageInfo = new PageInfo(list);
        log.info("查询到{}条信息" , list.size());
        return pageInfo;
    }*/
/*    public ModelAndView delStudentById(Integer id){
        ModelAndView mav = new ModelAndView();
        Student student = studentService.delStuById(id);
        mav.addObject("id" , student);
        mav.setView(new MappingJackson2JsonView());
        return mav;
    }*/



/*    public String getStudent(@RequestParam("id") Integer id , Model model) {
        Student student = studentService.selStuById(id);
        model.addAttribute("student" , student);
        return "studentItem";
    }*/



/*
    @RequestMapping(value = "/student" , method = RequestMethod.GET)
    public ModelAndView getStudent1(@PathVariable("username") String username) {
        Student student = studentService.selStuByName(username);
        ModelAndView modelAndView = new ModelAndView("selectStuByName");
        modelAndView.addObject("stu", student);
        return modelAndView;
    }
*/
/*    @RequestMapping("/selstu")
    public String getstudent2(String username){
        System.out.println(username);
        return username;
    }

    @RequestMapping(value = "/selstu/{username}")
    public void getStudent3(@RequestParam(value = "username") String un) {
        System.out.println(un);
    }*/

/*    @RequestMapping(value = "/student/{id}" , method = RequestMethod.GET)
    public ModelAndView getStudentById(@PathVariable("id") Integer id){

        Student student = studentService.selStuById(id);
        ModelAndView mav = new ModelAndView();
//      attributeName "需要放到model中的属性名称","对应的属性值，它是一个对象"
        mav.addObject("学生信息",student);
        mav.setView(new MappingJackson2JsonView());
        return mav;
    }*/

//    Model示例
/*    @RequestMapping(value = "/student/{id}" , method = RequestMethod.GET)
    public String getStudentBy1(@PathVariable("id") Integer id , Model model) {
        model.addAttribute(studentService.selStuById(id));
        return "/student2";
    }*/

    /*更新信息*//*

    @RequestMapping(value = "/student/update" , method = RequestMethod.POST)
    public String updateStu(){
        log.info("跳转更新页面");
        return "update";
    }
*/

    /*更新页面*//*
    @RequestMapping(value = "/student/update/{id}" , method = RequestMethod.POST)
    public ModelAndView updateStu1(@PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView("update");
        mav.addObject("id",id);
        return mav;
    }*/

    /*更新页面*/

/*    @RequestMapping(value = "/student/update/{id}" , method = RequestMethod.POST)
    public ModelAndView updatePage(@PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("id",id);
        return mav;
    }*/
}
