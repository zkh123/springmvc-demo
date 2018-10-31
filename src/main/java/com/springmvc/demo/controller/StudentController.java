package com.springmvc.demo.controller;

import com.springmvc.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * created by Administrator on 2018/11/1.
 */
@Controller
public class StudentController {

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public ModelAndView student(){
        return new ModelAndView("student","command",new Student());
//        return new ModelAndView("messageStudent","message",new Student());
    }

    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
//    public String addStudent(@ModelAttribute(value = "SpringWeb")Student student, ModelMap model){
    public String addStudent(Student student, ModelMap model){
        model.addAttribute("name",student.getName());
        model.addAttribute("age",student.getAge());
        model.addAttribute("id",student.getId());
        return "result";
    }
}
