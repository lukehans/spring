package com.luke.cooking.model;

import org.springframework.data.annotation.Id;

import java.util.Calendar;

public class User {

    @Id
    private String id;

    private String username;

    private String password;

    private Calendar created = Calendar.getInstance();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
