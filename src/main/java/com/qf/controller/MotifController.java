package com.qf.controller;

import com.qf.Dao.MotifDao;
import com.qf.domain.Motif;
import com.qf.domain.User;
import com.qf.service.ArticleService;
import com.qf.service.MotifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@RestController
public class MotifController {

    @Autowired
    private MotifService motifService;

    @Autowired
    private ArticleService articleService;


    @GetMapping("findAll")
    public List<Motif>  findAll(){

        List<Motif> all = motifService.findAll();

        return all;
    }


    //查询id遍历内容
    @GetMapping(path = "/getMotif")
    public  List<Motif> getMotif(Integer id) throws IOException {
//        System.out.println("控制层获取文章分类。。。");
        articleService.lookCount(id);
        List<Motif> motif = motifService.getMotif(id);
//        Motif motif = motifService.getMotif(id);
        System.out.println("分类："+id);
        System.out.println(motif);

        return motif;

    }


}
