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

    private Integer id;
    private String username;
    private String password;
    private String name;
    private String sex;
    private String email;
    private Integer flag;
    private Integer isAdmin;
    private Integer score;
    private Integer isBanned;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", flag=" + flag +
                ", isAdmin=" + isAdmin +
                ", score=" + score +
                ", isBanned=" + isBanned +
                '}';
    }

    public User() {
    }

    public User(Integer id, String username, String password, String name, String sex, String email, Integer flag, Integer isAdmin, Integer score, Integer isBanned) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.flag = flag;
        this.isAdmin = isAdmin;
        this.score = score;
        this.isBanned = isBanned;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getIsBanned() {
        return isBanned;
    }

    public void setIsBanned(Integer isBanned) {
        this.isBanned = isBanned;
    }
}
