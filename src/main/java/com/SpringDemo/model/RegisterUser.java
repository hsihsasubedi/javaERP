package com.SpringDemo.model;


import com.SpringDemo.util.DemoConstants;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "registeruser")
@NoArgsConstructor
public class RegisterUser {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String name;
    private String usertype;

    public RegisterUser(Long id, String username, String password, String name, String usertype) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        return "RegisterUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", usertype='" + usertype + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

}