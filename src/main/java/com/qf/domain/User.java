package com.qf.domain;

public class User {
//  `u_id` int(11) NOT NULL AUTO_INCREMENT,
//  `u_username` varchar(20) NOT NULL,
//  `u_password` varchar(20) NOT NULL,
//  `u_name` varchar(255) NOT NULL,
//  `u_sex` varchar(4) NOT NULL,
//  `u_email` varchar(20) NOT NULL,
//  `u_flag` int(2) NOT NULL DEFAULT '0',
//  `u_isAdmin` int(2) NOT NULL DEFAULT '0',
//  `u_score` int(255) NOT NULL,
//  `u_isBanned` int(1) NOT NULL DEFAULT '0',

    private Integer u_id;
    private String u_username;
    private String u_password;
    private String u_name;
    private String u_sex;
    private String u_email;
    private Integer u_flag;
    private Integer u_isAdmin;
    private Integer u_score;
    private Integer u_isBanned;

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_username='" + u_username + '\'' +
                ", u_password='" + u_password + '\'' +
                ", u_name='" + u_name + '\'' +
                ", u_sex='" + u_sex + '\'' +
                ", u_email='" + u_email + '\'' +
                ", u_flag=" + u_flag +
                ", u_isAdmin=" + u_isAdmin +
                ", u_score=" + u_score +
                ", u_isBanned=" + u_isBanned +
                '}';
    }

    public User() {
    }

    public User(Integer u_id, String u_username, String u_password, String u_name, String u_sex, String u_email, Integer u_flag, Integer u_isAdmin, Integer u_score, Integer u_isBanned) {
        this.u_id = u_id;
        this.u_username = u_username;
        this.u_password = u_password;
        this.u_name = u_name;
        this.u_sex = u_sex;
        this.u_email = u_email;
        this.u_flag = u_flag;
        this.u_isAdmin = u_isAdmin;
        this.u_score = u_score;
        this.u_isBanned = u_isBanned;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_username() {
        return u_username;
    }

    public void setU_username(String u_username) {
        this.u_username = u_username;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_sex() {
        return u_sex;
    }

    public void setU_sex(String u_sex) {
        this.u_sex = u_sex;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public Integer getU_flag() {
        return u_flag;
    }

    public void setU_flag(Integer u_flag) {
        this.u_flag = u_flag;
    }

    public Integer getU_isAdmin() {
        return u_isAdmin;
    }

    public void setU_isAdmin(Integer u_isAdmin) {
        this.u_isAdmin = u_isAdmin;
    }

    public Integer getU_score() {
        return u_score;
    }

    public void setU_score(Integer u_score) {
        this.u_score = u_score;
    }

    public Integer getU_isBanned() {
        return u_isBanned;
    }

    public void setU_isBanned(Integer u_isBanned) {
        this.u_isBanned = u_isBanned;
    }
}
