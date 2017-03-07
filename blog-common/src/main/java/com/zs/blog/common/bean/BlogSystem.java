package com.zs.blog.common.bean;

import java.util.Date;

/**
 * Created by zhangshuqing on 2017/2/23.
 */
public class BlogSystem {
    private String name;
    private Date date;
    private String desc;
    private String author;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
