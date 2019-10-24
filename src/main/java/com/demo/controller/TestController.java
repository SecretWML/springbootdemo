package com.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hello") -- 下面的请求就要变成/hello/test
public class TestController {

  @RequestMapping("/test")
  public String test1(){
    return "helloWorld";
  }

  @RequestMapping("/test{name}")
  public String test2(@PathVariable String name){
    return "hello"+ name;
  }

  @RequestMapping("/test3")
  public String test3(@RequestParam("param") String param){
    return "helloWorld3" + param;
  }
}
