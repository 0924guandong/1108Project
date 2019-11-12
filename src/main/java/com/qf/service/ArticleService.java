package com.qf.service;

import com.qf.domain.Article;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ArticleService {

    List<Article> findAll();

    void saveById(Article article);

    void lookCount(Integer id);

    List<Article> findLike(String headline);

    Integer findType();

    Integer findType2();
}
