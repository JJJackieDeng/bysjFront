package com.jackiedeng.movie.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author jackie
 * @Email 15975403320@163.com
 * @Date 2020/3/25 18:18
 * @Description
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index.html");
    }

//    @RequestMapping("/")
//    public String test(){
//        return "222222222222222222222222";
//    }
}
