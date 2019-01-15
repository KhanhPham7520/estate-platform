package com.nhatkhanh.estate.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "homeControllerOfWeb")
public class HomeController {


    @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("web/home");
        mav.addObject("attribute","Day la trang chu");
        return mav;
    }

}
