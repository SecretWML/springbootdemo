package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


  @Autowired
  private RedisService redisService ;


  @RequestMapping(value = "/redisTest",method = RequestMethod.GET)
  public String demoTest(){
    boolean b = redisService.set("1","value22222");
    if(b){
      return "true";
    }else{
      return "false";
    }

  }

  @RequestMapping(value = "/redisTestGet",method = RequestMethod.GET)
  public String getValueTest(){
   return (String)redisService.get("1");

  }

}
