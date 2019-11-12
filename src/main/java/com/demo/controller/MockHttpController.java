package com.demo.controller;

import Utils.JsonUtil;
import com.demo.param.MockResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class MockHttpController {
  @RequestMapping("/getResponse")
  public MockResponse getResponse(){
    MockResponse res = new MockResponse();
    res.setCode("501");
    res.setDesc("服务器内部错误");
    return res;
  }

  @RequestMapping("/crm/goodscouponservice/query_pickup_goods_info")
  public String get(){
    String filePath = "C:\\workspace\\ideaGit\\test\\src\\main\\resources\\debugfile\\debug.json";
    String str = JsonUtil.readJsonFile(new File(filePath));
    return str;
  }
}
