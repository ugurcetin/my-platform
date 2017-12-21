package com.myplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

    /**
     * Created by UGURCETIN on 21.12.2017.
     */
    @Controller
    public class HomeController {

    @RequestMapping("/")
    public String showHomePage(){
        return "Home/index";
    }

}
