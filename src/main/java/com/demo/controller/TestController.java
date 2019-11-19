package com.demo.controller;

import com.demo.config.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

  //自定义配置测试

  @Autowired
  TestConfig testConfig;

  @Value("${test.url}")
  String url;

  @RequestMapping("/getConfig")
  public String getConfig(){
    //测试加载yml文件
    String str = testConfig.getUrl()+" - "+ testConfig.getName() +" - " + testConfig.getPassword();
    return str +"----"+ url;
  }
}
