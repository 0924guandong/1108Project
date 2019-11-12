package com.qf.Dao;

import com.qf.domain.Article;
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



}
