package com.qf.service.Impl;

import com.qf.Dao.ArticleDao;
import com.qf.domain.Article;
import com.qf.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("articleService")
public class ArticleImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;


    @Override
    //查询全部文章，用户信息
    public List<Article> findAll() {
        List<Article> all = articleDao.findAll();
        for (Article article : all) {
            System.out.println(article);
        }

        return all;
    }

    @Override
    //添加文章
    public void saveById(Article article) {

        System.out.println("增加");
        articleDao.saveById(article);

    }

    @Override
    //增加观看次数
    public void lookCount(Integer id) {
        System.out.println("修改");
        articleDao.lookCount(id);
    }

    @Override
    //模糊查询列表
    public List<Article> findLike(String headline) {
        List<Article> like = articleDao.findLike("%" + headline + "%");

        System.out.println("到达Service  findLike");
        for (Article article : like) {
            System.out.println("模糊查询"+article);
        }

        return like;
    }

    @Override
    public Integer findType() {

        Integer count = articleDao.findType();

        return count;
    }

    @Override
    public Integer findType2() {
        Integer count2 = articleDao.findType2();

        return count2;
    }


}
