package com.herion.esskeetitmusic.entity;


public class User {

  private long userId;
  private String password;
  private String username;
  private long userSex;
  private String email;
  private String phone;
  private String sign;
  private String headUrl;
  private String registeTime;

  public User(long userId, String password, String username, long userSex, String email, String phone, String sign, String headUrl, String registeTime) {
    this.userId = userId;
    this.password = password;
    this.username = username;
    this.userSex = userSex;
    this.email = email;
    this.phone = phone;
    this.sign = sign;
    this.headUrl = headUrl;
    this.registeTime = registeTime;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public long getUserSex() {
    return userSex;
  }

  public void setUserSex(long userSex) {
    this.userSex = userSex;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getSign() {
    return sign;
  }

  public void setSign(String sign) {
    this.sign = sign;
  }


  public String getHeadUrl() {
    return headUrl;
  }

  public void setHeadUrl(String headUrl) {
    this.headUrl = headUrl;
  }


  public String getRegisteTime() {
    return registeTime;
  }

  public void setRegisteTime(String registeTime) {
    this.registeTime = registeTime;
  }

}
