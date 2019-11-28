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

    private Integer a_id;
    private Integer a_uid;
    private Integer a_mid;
    private String a_headline;
    private String a_content;
    private String a_date;
    private Integer a_lookCount;
    private Integer a_flag;

    private User user;
    private Motif motif;

    public Motif getMotif() {
        return motif;
    }

    public void setMotif(Motif motif) {
        this.motif = motif;
    }

    @Override
    public String toString() {
        return "Article{" +
                "a_id=" + a_id +
                ", a_uid=" + a_uid +
                ", a_mid=" + a_mid +
                ", a_headline='" + a_headline + '\'' +
                ", a_content='" + a_content + '\'' +
                ", a_date='" + a_date + '\'' +
                ", a_lookCount=" + a_lookCount +
                ", a_flag=" + a_flag +
                ", user=" + user +
                ", motif=" + motif +
                '}';
    }

    public Article() {
    }

    public Article(Integer a_id, Integer a_uid, Integer a_mid, String a_headline, String a_content, String a_date, Integer a_lookCount, Integer a_flag, User user) {
        this.a_id = a_id;
        this.a_uid = a_uid;
        this.a_mid = a_mid;
        this.a_headline = a_headline;
        this.a_content = a_content;
        this.a_date = a_date;
        this.a_lookCount = a_lookCount;
        this.a_flag = a_flag;
        this.user = user;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public Integer getA_uid() {
        return a_uid;
    }

    public void setA_uid(Integer a_uid) {
        this.a_uid = a_uid;
    }

    public Integer getA_mid() {
        return a_mid;
    }

    public void setA_mid(Integer a_mid) {
        this.a_mid = a_mid;
    }

    public String getA_headline() {
        return a_headline;
    }

    public void setA_headline(String a_headline) {
        this.a_headline = a_headline;
    }

    public String getA_content() {
        return a_content;
    }

    public void setA_content(String a_content) {
        this.a_content = a_content;
    }

    public String getA_date() {
        return a_date;
    }

    public void setA_date(String a_date) {
        this.a_date = a_date;
    }

    public Integer getA_lookCount() {
        return a_lookCount;
    }

    public void setA_lookCount(Integer a_lookCount) {
        this.a_lookCount = a_lookCount;
    }

    public Integer getA_flag() {
        return a_flag;
    }

    public void setA_flag(Integer a_flag) {
        this.a_flag = a_flag;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
