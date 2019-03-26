package com.example.etrading.FireBase.Models;

public class User {
    String Id;
    String Email;

    public User(String id, String email) {
        Id = id;
        Email = email;
    }

    public User() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
