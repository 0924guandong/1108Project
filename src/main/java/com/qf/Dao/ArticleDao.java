package com.qf.Dao;

import com.qf.domain.Article;
import com.qf.domain.Motif;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArticleDao {

    //查询列表
    List<Article> findAll();

    //增加文章内容
    void saveById(Article article);

    //通过用户id修改查看次数
    void lookCount(Integer id);

    Article findId(Integer id);

    //查询
    List<Article> findLike(String headline);

    //查询旅游篇记录数
    Integer findType();
    Integer findType2();

    //只查询旅游篇文章记录
    List<Article> findTravel();

    //搜索旅游篇内容查询
    List<Article> TravelLike(String content);

    //只查询生活篇文章记录
    List<Article> findLive();

    //搜索生活篇内容查询
    List<Article> LiveLike(String content);

    //最新内容查询
    List<Article> findNew();

    //最早内容查询
    List<Article> findEarly();

    //观看次数最多查询
    List<Article> findMost();

    //作者名查询
    List<Article> findWriter(String name);



}
