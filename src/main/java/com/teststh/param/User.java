package com.teststh.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable, Comparable<User> {
  private int id;
  private String loginId;
  private String userName;
  private String email;
  private List<String> str = new ArrayList<>();
  private int age;

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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public User(){

  }

  public User(int id, String userName, int age) {
    this.id = id;
    this.userName = userName;
    this.age = age;
  }

  public User(int id,String loginId,String userName,String email,List<String> str){
    this.id = id;
    this.loginId = loginId;
    this.userName = userName;
    this.email = email;
    this.str = str;
  }

  @Override
  public String toString() {
    StringBuilder sb= new StringBuilder();
    sb.append("id="+getId()+"\n");
    sb.append("loginId="+getLoginId()+"\n");
    sb.append("userName="+getUserName()+"\n");
    sb.append("email="+getEmail()+"\n");
    sb.append("str="+getStr().toString()+"\n");
    sb.append("age=" + getAge() + "\n");
    return sb.toString();
  }

  @Override
  public int compareTo(User o) {
    return 0;
  }
}
