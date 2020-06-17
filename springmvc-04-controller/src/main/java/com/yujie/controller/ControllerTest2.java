package com.yujie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description
 * @author:yujie
 * @Created on 2020/6/17
 */
@Controller //这个类会被spring接管,
public class ControllerTest2 {

    //下面的方法会自动走视图解析器
    @RequestMapping("/t2")
    public String test1(Model model){
        model.addAttribute("msg", "test2");
        return "test"; //WEB-INF/jsp/test.jsp
    }


    //下面的方法会自动走视图解析器
    @RequestMapping("/t3")
    public String test2(Model model){
        model.addAttribute("msg", "test3");
        return "test"; //WEB-INF/jsp/test.jsp
    }
}
