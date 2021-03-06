package com.devhopeslabs.zmemos.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String id;

    private String name;

    private String email;

    private String username;

    private String password;

    public User() {
    }

    public User(String user_id, String name, String email, String username, String password) {
        this.id = user_id;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }


    public String getUser_id() {
        return id;
    }

    public void setUser_id(String user_id) {
        this.id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
