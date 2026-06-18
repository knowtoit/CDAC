package com.demo.model;

public class User implements UserInfo {
    private String username;
    private String address;
    private String mobile;
    private String email;

    public User(String username, String address, String mobile, String email) {
        this.username = username;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }

    public String getUsername() { return username; }
    public String getAddress() { return address; }
    public String getMobile() { return mobile; }
    public String getEmail() { return email; }

    public String toString() {
        return username + " " + address + " " + mobile + " " + email;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}