package com.qf.domain;


import lombok.Data;

@Data
public class Article {
//
//  `a_id` int(11) NOT NULL AUTO_INCREMENT,
//  `a_uid` int(11) NOT NULL,
//  `a_mid` int(11) NOT NULL,
//  `a_headline` varchar(255) NOT NULL,
//  `a_content` longtext NOT NULL,
//  `a_date` varchar(255) NOT NULL,
//  `a_lookCount` int(20) NOT NULL,
//  `a_flag` int(11) NOT NULL DEFAULT '0',

    private Integer id;
    private Integer uid;
    private Integer mid;
    private String headline;
    private String content;
    private String date;
    private Integer lookCount;
    private Integer flag;

    private User user;

    public Article() {
    }

    public Article(Integer id, Integer uid, Integer mid, String headline, String content, String date, Integer lookCount, Integer flag) {
        this.id = id;
        this.uid = uid;
        this.mid = mid;
        this.headline = headline;
        this.content = content;
        this.date = date;
        this.lookCount = lookCount;
        this.flag = flag;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getLookCount() {
        return lookCount;
    }

    public void setLookCount(Integer lookCount) {
        this.lookCount = lookCount;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
