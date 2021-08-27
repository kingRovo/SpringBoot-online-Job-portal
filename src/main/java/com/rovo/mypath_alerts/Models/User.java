package com.rovo.mypath_alerts.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long UserId;
    private String name;
    private String mail;
    private String H_degree;
    public User(){

    }

    public Long getUserId() {

        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
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

    public String getH_degree() {
        return H_degree;
    }

    public void setH_degree(String h_degree) {
        H_degree = h_degree;
    }
}
