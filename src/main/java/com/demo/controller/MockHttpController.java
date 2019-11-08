package com.demo.controller;

import com.demo.param.MockResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockHttpController {
  @RequestMapping("/getResponse")
  public MockResponse getResponse(){
    MockResponse res = new MockResponse();
    res.setCode("501");
    res.setDesc("服务器内部错误");
    return res;
  }

  @RequestMapping("/zjian.crm.customer.coupons.silence.use")
  public String get(){
    String str = "{\n" + "    \"code\": \"501\",\n" + "    \"desc\": \"服务器内部错误,请联系管理员\",\n"
      + "    \"data\": null\n" + "}";
    return str;
  }
}
