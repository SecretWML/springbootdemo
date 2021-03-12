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

  /**  鲜丰订单测试 */
  @RequestMapping("/selfList")
  public String queryList(){
    String filePath = "C:\\workspace\\ideaGit\\test\\src\\main\\resources\\debugfile\\xfDeliver\\queryList.json";
    String str = JsonUtil.readJsonFile(new File(filePath));
    return str;
  }

  @RequestMapping("/orderDetail")
  public String queryOrder(){
    String filePath = "C:\\workspace\\ideaGit\\test\\src\\main\\resources\\debugfile\\xfDeliver\\queryOrder.json";
    String str = JsonUtil.readJsonFile(new File(filePath));
    return str;
  }

  @RequestMapping("/writeOff")
  public String writeOff(){
    String filePath = "C:\\workspace\\ideaGit\\test\\src\\main\\resources\\debugfile\\xfDeliver\\writeOff.json";
    String str = JsonUtil.readJsonFile(new File(filePath));
    return str;
  }

  @RequestMapping("/refund")
  public String refund(){
    String filePath = "C:\\workspace\\ideaGit\\test\\src\\main\\resources\\debugfile\\xfDeliver\\refund.json";
    String str = JsonUtil.readJsonFile(new File(filePath));
    return str;
  }

  @RequestMapping("/reprint")
  public String reprint(){
    String filePath = "C:\\workspace\\ideaGit\\test\\src\\main\\resources\\debugfile\\xfDeliver\\reprint.json";
    String str = JsonUtil.readJsonFile(new File(filePath));
    return str;
  }


  /** ==========门店运营平台=================*/
  @RequestMapping("/sop/v1/mkhtest/message/download")
  public String queryAnnouncements(){
    String filePath = "E:\\workspace\\project\\ideaGit\\test\\src\\main\\resources\\debugfile\\sop\\query.json";
    String str = JsonUtil.readJsonFile(new File(filePath));
    return str;
  }

  @RequestMapping("/sop/v1/mkhtest/message/download/confirm")
  public String downloadConfirm()throws Exception{
    String filePath = "E:\\workspace\\project\\ideaGit\\test\\src\\main\\resources\\debugfile\\sop\\confirm.json";
    String str = JsonUtil.readJsonFile(new File(filePath));
    return str;
    //throw new Exception("TIME OUT");
    }

  @RequestMapping("/sop/v1/mkhtest/message/read")
  public String sendAnnouncementFeedback() throws Exception{
    String filePath = "E:\\workspace\\project\\ideaGit\\test\\src\\main\\resources\\debugfile\\sop\\send.json";
    String str = JsonUtil.readJsonFile(new File(filePath));
    return str;
    //throw new Exception("TIME OUT");
  }

  /** ==========toptoy会员=================*/

  private boolean isException(){
    String filePath = "E:\\workspace\\project\\ideaGit\\test\\src\\main\\resources\\debugfile\\toptoy\\exception.json";
    String exception = JsonUtil.readJsonFile(new File(filePath));
    return exception.contains("enable");
  }

  @RequestMapping("/member/get")
  public String getMemeberInfo() throws Exception{
    if(isException()){
      throw new Exception("TIME OUT");
    }else{
    String filePath = "E:\\workspace\\project\\ideaGit\\test\\src\\main\\resources\\debugfile\\toptoy\\getMember.json";
    String str = JsonUtil.readJsonFile(new File(filePath));
    return str;}

  }

  @RequestMapping("/order/syncOrder")
  public String syncOrder() throws Exception{
    if(isException()){
      throw new Exception("TIME OUT");
    }else{
    String filePath = "E:\\workspace\\project\\ideaGit\\test\\src\\main\\resources\\debugfile\\toptoy\\syncOrder.json";
    String str = JsonUtil.readJsonFile(new File(filePath));
    return str;}
  }

  @RequestMapping("/order/syncReverseOrder")
  public String syncReverseOrder() throws Exception{
    if(isException()){
      throw new Exception("TIME OUT");
    }else{
    String filePath = "E:\\workspace\\project\\ideaGit\\test\\src\\main\\resources\\debugfile\\toptoy\\syncReverseOrder.json";
    String str = JsonUtil.readJsonFile(new File(filePath));
    return str;}
  }

  @RequestMapping("/points/order/estimate")
  public String scoreEstimate() throws Exception{
    if(isException()){
      throw new Exception("TIME OUT");
    }else{
    String filePath = "E:\\workspace\\project\\ideaGit\\test\\src\\main\\resources\\debugfile\\toptoy\\scoreEstimate.json";
    String str = JsonUtil.readJsonFile(new File(filePath));
    return str;}
  }

  @RequestMapping("/points/calculate")
  public String scoreCalc() throws Exception{
    if(isException()){
      throw new Exception("TIME OUT");
    }else{
    String filePath = "E:\\workspace\\project\\ideaGit\\test\\src\\main\\resources\\debugfile\\toptoy\\scoreCalc.json";
    String str = JsonUtil.readJsonFile(new File(filePath));
    return str;}

  }

  @RequestMapping("/points/consume")
  public String scoreConsume() throws Exception{
    if(isException()){
      throw new Exception("TIME OUT");
    }else{
    String filePath = "E:\\workspace\\project\\ideaGit\\test\\src\\main\\resources\\debugfile\\toptoy\\scoreConsume.json";
    String str = JsonUtil.readJsonFile(new File(filePath));
    return str;}
  }

  @RequestMapping("/points/return")
  public String scoreReturn() throws Exception{
    if(isException()){
      throw new Exception("TIME OUT");
    }else{
    String filePath = "E:\\workspace\\project\\ideaGit\\test\\src\\main\\resources\\debugfile\\toptoy\\scoreReturn.json";
    String str = JsonUtil.readJsonFile(new File(filePath));
    return str;}
  }


  @RequestMapping("/coupon/decreaseCoupon")
  public String decreaseCoupon() throws Exception{
    if(isException()){
      throw new Exception("TIME OUT");
    }else{
      String filePath = "E:\\workspace\\project\\ideaGit\\test\\src\\main\\resources\\debugfile\\toptoy\\decreaseCoupon.json";
      String str = JsonUtil.readJsonFile(new File(filePath));
      return str;}
  }

  @RequestMapping("/coupon/returnCoupon")
  public String returnCoupon() throws Exception{
    if(isException()){
      throw new Exception("TIME OUT");
    }else{
      String filePath = "E:\\workspace\\project\\ideaGit\\test\\src\\main\\resources\\debugfile\\toptoy\\returnCoupon.json";
      String str = JsonUtil.readJsonFile(new File(filePath));
      return str;}
  }



}
