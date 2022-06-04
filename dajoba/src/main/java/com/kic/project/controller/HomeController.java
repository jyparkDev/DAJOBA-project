package com.kic.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String main(){
        System.out.println("이슈 테스트");
        return "home";
    }
}
