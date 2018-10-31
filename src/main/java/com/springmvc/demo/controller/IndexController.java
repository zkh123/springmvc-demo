package com.springmvc.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * created by Administrator on 2018/11/1.
 */
@Controller
public class IndexController {

    private static Logger logger = Logger.getLogger(IndexController.class);

    /**
     *http://localhost:8080/toHome
     * @return
     */
    @RequestMapping(value = "/toHome")
    public String toHomePage(){
        return "home";
    }

    /**
     * http://localhost:8080/hello
     * @param model
     * @return
     */
    @RequestMapping(value = "/hello")
    public String printHello(ModelMap model){
        model.addAttribute("message","hello Spring MVC 测试");
        model.addAttribute("username","lijun");
        return "hello";
    }

    @RequestMapping(value = "/hello1")
    public String printHello1(Model model){
        model.addAttribute("message","hello Spring MVC 测试");
        model.addAttribute("username","lijun");
        return "hello";
    }

    /**
     * http://localhost:8080/hello2?username=黄&password=123
     * @param request
     * @return
     */
    @RequestMapping(value = "/hello2")
    public ModelAndView printHello(HttpServletRequest request){

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        logger.info("username : " + username + " ,password : " + password);

        Enumeration<String> enumeration = request.getParameterNames();
        StringBuffer sb = new StringBuffer();
        while (enumeration.hasMoreElements()){
            sb.append(request.getParameter(enumeration.nextElement()));
        }
        logger.info("请求参数为：" + sb.toString());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","hello Spring MVC 测试");
        modelAndView.addObject("username","lijun");
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    @RequestMapping(value = "/helloPost",method = RequestMethod.POST)
    public String printHelloPost(ModelMap model){
        model.addAttribute("message","hello Spring MVC 测试post");
        return "hello";
    }

}
