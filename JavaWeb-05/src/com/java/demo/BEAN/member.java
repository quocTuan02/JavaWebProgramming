package com.java.demo.BEAN;

import java.util.Date;

public class member {
    private int id;
    private String name;
    private String email;
    private String pasword;
    private int actived;
    private Date createdAt;
    private Date updateAt;

    public member() {
    }

    public member(int id, String name, String email, String pasword, int actived, Date createdAt, Date updateAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pasword = pasword;
        this.actived = actived;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public int getActived() {
        return actived;
    }

    public void setActived(int actived) {
        this.actived = actived;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
