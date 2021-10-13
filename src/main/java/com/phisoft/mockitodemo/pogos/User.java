package com.phisoft.mockitodemo.pogos;

import java.util.Objects;

public class User {


    private int Id;
    private String name;
    private String mail;
    private String phone;
    private String gender;

    public User() {
    }

    public User(int id, String name, String mail, String phone, String gender) {
        Id = id;
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.gender = gender;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
