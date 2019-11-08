package com.demo.param;

public class MockResponse {
  private String code; // 响应代码
  private String desc; // 响应描述
  private User data;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public User getData() {
    return data;
  }

  public void setData(User data) {
    this.data = data;
  }
}
