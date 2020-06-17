package com.yujie.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description
 * @author:yujie
 * @Created on 2020/6/17
 */
public class HelloController  implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();

        //封装对象，放在ModelAndVIew中
        mv.addObject("msg", "HelloSprinvMVC!");
        mv.setViewName("hello");
        return mv;
    }
}
