package com.demo.controller;

import com.demo.IUrlConsts;
import com.demo.annotation.Upower;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAspectController {

    @Upower
    @RequestMapping("/upower")
    public void getResult(){
        System.out.println("upower annotation test!");
    }

    @RequestMapping(value = IUrlConsts.URL_SUBMIT)
    public void getTest(){
        System.out.println("test!");
    }
}
