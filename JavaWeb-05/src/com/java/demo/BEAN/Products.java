package com.java.demo.BEAN;

import java.util.Date;

public class Products {
    private int id;
    private String name;
    private String description;
    private int author;
    private String imager;
    private int actived;
    private Date createdAt;
    private Date updateAt;

    public Products() {
    }

    public Products(int id, String name, String description, int author, String imager, int actived, Date createdAt, Date updateAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.author = author;
        this.imager = imager;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public String getImager() {
        return imager;
    }

    public void setImager(String imager) {
        this.imager = imager;
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
