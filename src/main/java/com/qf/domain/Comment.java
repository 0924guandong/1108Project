package com.qf.domain;

import java.util.Date;

public class Comment {
    private Integer c_id;
    private Integer c_uid;
    private Integer c_aid;
    private String c_content;
    private String c_date;

    private User user;
    private Article article;

    @Override
    public String toString() {
        return "Comment{" +
                "c_id=" + c_id +
                ", c_uid=" + c_uid +
                ", c_aid=" + c_aid +
                ", c_content='" + c_content + '\'' +
                ", c_date='" + c_date + '\'' +
                ", user=" + user +
                ", article=" + article +
                '}';
    }

    public Comment() {
    }

    public Comment(Integer c_id, Integer c_uid, Integer c_aid, String c_content, String c_date, User user, Article article) {
        this.c_id = c_id;
        this.c_uid = c_uid;
        this.c_aid = c_aid;
        this.c_content = c_content;
        this.c_date = c_date;
        this.user = user;
        this.article = article;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public Integer getC_uid() {
        return c_uid;
    }

    public void setC_uid(Integer c_uid) {
        this.c_uid = c_uid;
    }

    public Integer getC_aid() {
        return c_aid;
    }

    public void setC_aid(Integer c_aid) {
        this.c_aid = c_aid;
    }

    public String getC_content() {
        return c_content;
    }

    public void setC_content(String c_content) {
        this.c_content = c_content;
    }

    public String getC_date() {
        return c_date;
    }

    public void setC_date(String c_date) {
        this.c_date = c_date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
