package com.demo.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Friend implements FriendInfo {
    private int id;
    private String name;
    private String lastName;
    private String[] hobbies;
    private String mobileNo;
    private String email;
    private LocalDate birthDate;
    private String address;

    public Friend(int id, String name, String lastName, String[] hobbies, String mobileNo, String email, LocalDate birthDate, String address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.hobbies = hobbies;
        this.mobileNo = mobileNo;
        this.email = email;
        this.birthDate = birthDate;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean hasHobby(String hobby) {
        for (String value : hobbies) {
            if (value.equalsIgnoreCase(hobby)) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        System.out.println(id + " " + name + " " + lastName + ", hobbies=" + Arrays.toString(hobbies)
                + ", mobile=" + mobileNo + ", email=" + email + ", bdate=" + birthDate + ", address=" + address);
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String[] getHobbies() {
        return hobbies;
    }
    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}