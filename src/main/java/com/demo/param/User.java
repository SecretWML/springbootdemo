package com.demo.param;

import java.util.ArrayList;
import java.util.List;

public class User {
  private int id;
  private String loginId;
  private String userName;
  private String email;
  private List<String> str = new ArrayList<>();

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLoginId() {
    return loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<String> getStr() {
    return str;
  }

  public void setStr(List<String> str) {
    this.str = str;
  }
}
