package com.qf.domain;

public class Motif {

    private Integer m_id;
    private String m_name;

    private Article article;
    private User user;

    @Override
    public String toString() {
        return "Motif{" +
                "m_id=" + m_id +
                ", m_name='" + m_name + '\'' +
                ", article=" + article +
                ", user=" + user +
                '}';
    }

    public Motif() {
    }

    public Motif(Integer m_id, String m_name, Article article, User user) {
        this.m_id = m_id;
        this.m_name = m_name;
        this.article = article;
        this.user = user;
    }

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
