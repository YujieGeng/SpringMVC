package com.yujie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description
 * @author:yujie
 * @Created on 2020/6/17
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){

        model.addAttribute("msg","hello spring mvc");

        return "hello";
    }
}
