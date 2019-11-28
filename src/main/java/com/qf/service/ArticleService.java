package com.qf.service;

import com.qf.domain.Article;
import com.qf.domain.Motif;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ArticleService {

    List<Article> findAll();

    void saveById(Article article);

    void lookCount(Integer id);

    List<Article> findLike(String headline);

    Integer findType();

    Integer findType2();

    List<Article> findTravel();

    List<Article> TravelLike(String content);

    List<Article> findLive();

    List<Article> LiveLike(String content);

    List<Article> findNew();

    List<Article> findEarly();

    List<Article> findMost();

    List<Article> findWriter(String name);


}
