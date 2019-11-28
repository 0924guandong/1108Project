package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.domain.Article;
import com.qf.domain.Msg;
import com.qf.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

//@Controller
//@RequestMapping("article")
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;



    //测试获取全部列表内容
    //    @RequestMapping("findAll")
    //    public String findAll(Model model){
    //        System.out.println("Controller层");
    //        List<Article> list = articleService.findAll();
    //        model.addAttribute("list",list);
    //        return "list";
    //    }

    //全部列表内容
    @RequestMapping(path="/getListWithJson",method = RequestMethod.GET)
    public Msg getListWithJson(Integer pageNo){

        //这是一个分页查询
        //引入PageHelp分页插件
        //在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pageNo,4);//自动添加limit 0,8
        //startPage后面紧跟的查询就是分页查询
        List<Article> articlePage = articleService.findAll();

//        List<Article> one = articleService.findLike("河");
//        for (Article article : articlePage) {
//            System.out.println(article);
//        }
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,传入连续显示的页数
        PageInfo pageInfo=new PageInfo(articlePage,5);

//        PageInfo pageInfo=new PageInfo(one,5);
        return Msg.sucess().add("pageInfo",pageInfo);
    }

    //增加
    //@RequestMapping(path = "/saveById/{id}",method = RequestMethod.GET)
    @RequestMapping("saveById")
    public void saveById(Article article, HttpServletRequest request, HttpServletResponse response) throws IOException {

//        自动生成当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String format = sdf.format(date);


        //设置当前时间
        article.setA_date(format);
        //设置用户id
//        article.setUid(2);
        article.setA_uid(2);
        //设置默认观看次数为0
        article.setA_lookCount(0);
//        article.setLookCount(0);
        //设置文章类型
        article.setA_mid(1);
//        article.setMid(1);

//        System.out.println("uid====="+id);
        articleService.saveById(article);

        response.sendRedirect(request.getContextPath()+"/header.html");
//        response.sendRedirect(request.getContextPath()+"/article/findAll");

    }

    //展示列表
    @RequestMapping(path = "/getAll")
    @ResponseBody
    public List<Article >getAll(Model model){
        List<Article> list= articleService.findAll();
        String str="name";
        model.addAttribute("name",str);

        return list;
    }


    //每点击一次修改查看次数
    //每点击一次修改查看次数
//    @RequestMapping("updataLook")
//    public void updataLook(Integer id,HttpServletRequest request, HttpServletResponse response) throws IOException {
//
//        articleService.lookCount(2);
//
//        response.sendRedirect(request.getContextPath()+"/list.html");
//
//    }



    //标题搜索
    @RequestMapping(path="/getListWithJson2",method = RequestMethod.GET)
    public Msg getListWithJson2(Integer pageNo,String text,HttpServletRequest request,HttpServletResponse response){

        System.out.println("页码pageNo=============="+pageNo);
        System.out.println("文本信息text"+text);

        //这是一个分页查询
        //引入PageHelp分页插件
        //在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pageNo,4);//自动添加limit 0,8

        //startPage后面紧跟的查询就是分页查询
//        List<Article> articlePage = articleService.findLike(text);
        List<Article> articlePage = articleService.findLike(text);
        for (Article article : articlePage) {
            System.out.println("控制层controller---"+article);
        }

        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,传入连续显示的页数
        PageInfo pageInfo=new PageInfo(articlePage,5);


        return Msg.sucess().add("pageInfo",pageInfo);
    }


    //搜索类型篇数
    @RequestMapping(path = "/findType",method = RequestMethod.GET)
    public List<Integer> findType(){

        Integer count = articleService.findType();
        Integer count2 = articleService.findType2();

        List<Integer> list=new ArrayList<>();
        list.add(count);
        list.add(count2);

//        int[] math={count,count2};
//        return math;

        return list;

    }


    //旅游列表内容
    @RequestMapping(path="/TravelJson",method = RequestMethod.GET)
    public Msg getListTravelJson(Integer pageNo){

        //这是一个分页查询
        //引入PageHelp分页插件
        //在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pageNo,4);//自动添加limit 0,8
        //startPage后面紧跟的查询就是分页查询
        List<Article> articlePage = articleService.findTravel();

//        List<Article> one = articleService.findLike("河");
//        for (Article article : articlePage) {
//            System.out.println(article);
//        }
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,传入连续显示的页数
        PageInfo pageInfo=new PageInfo(articlePage,5);

//        PageInfo pageInfo=new PageInfo(one,5);
        return Msg.sucess().add("pageInfo",pageInfo);
    }

    //查询旅游内容
    @RequestMapping(path="/TravelJson2",method = RequestMethod.GET)
    public Msg getListTravelJson2(Integer pageNo,String text,HttpServletRequest request,HttpServletResponse response){

        System.out.println("页码pageNo=============="+pageNo);
        System.out.println("文本信息text"+text);

        //这是一个分页查询
        //引入PageHelp分页插件
        //在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pageNo,4);//自动添加limit 0,8

        //startPage后面紧跟的查询就是分页查询
//        List<Article> articlePage = articleService.findLike(text);
        List<Article> articlePage = articleService.TravelLike(text);
        for (Article article : articlePage) {
            System.out.println("旅游控制层controller---"+article);
        }

        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,传入连续显示的页数
        PageInfo pageInfo=new PageInfo(articlePage,5);


        return Msg.sucess().add("pageInfo",pageInfo);
    }



    //生活列表内容
    @RequestMapping(path="/LiveJson",method = RequestMethod.GET)
    public Msg getListLiveJson(Integer pageNo){

        //这是一个分页查询
        //引入PageHelp分页插件
        //在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pageNo,4);//自动添加limit 0,8
        //startPage后面紧跟的查询就是分页查询
        List<Article> articlePage = articleService.findLive();

//        List<Article> one = articleService.findLike("河");
//        for (Article article : articlePage) {
//            System.out.println(article);
//        }
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,传入连续显示的页数
        PageInfo pageInfo=new PageInfo(articlePage,5);

//        PageInfo pageInfo=new PageInfo(one,5);
        return Msg.sucess().add("pageInfo",pageInfo);
    }

    //查询生活内容
    @RequestMapping(path="/LiveJson2",method = RequestMethod.GET)
    public Msg LiveJson2(Integer pageNo,String text,HttpServletRequest request,HttpServletResponse response){

        System.out.println("页码pageNo=============="+pageNo);
        System.out.println("文本信息text"+text);

        //这是一个分页查询
        //引入PageHelp分页插件
        //在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pageNo,4);//自动添加limit 0,8

        //startPage后面紧跟的查询就是分页查询
//        List<Article> articlePage = articleService.findLike(text);
        List<Article> articlePage = articleService.LiveLike(text);
        for (Article article : articlePage) {
            System.out.println("旅游控制层controller---"+article);
        }

        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,传入连续显示的页数
        PageInfo pageInfo=new PageInfo(articlePage,5);


        return Msg.sucess().add("pageInfo",pageInfo);
    }


    //最新列表内容
    @RequestMapping(path="/aNew",method = RequestMethod.GET)
    public Msg aNew(Integer pageNo){

        //这是一个分页查询
        //引入PageHelp分页插件
        //在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pageNo,4);//自动添加limit 0,8
        //startPage后面紧跟的查询就是分页查询
        List<Article> articlePage = articleService.findNew();


        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,传入连续显示的页数
        PageInfo pageInfo=new PageInfo(articlePage,5);

        return Msg.sucess().add("pageInfo",pageInfo);
    }


    //最早列表内容
    @RequestMapping(path="/early",method = RequestMethod.GET)
    public Msg early(Integer pageNo){

        //这是一个分页查询
        //引入PageHelp分页插件
        //在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pageNo,4);//自动添加limit 0,8
        //startPage后面紧跟的查询就是分页查询
        List<Article> articlePage = articleService.findEarly();


        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,传入连续显示的页数
        PageInfo pageInfo=new PageInfo(articlePage,5);

        return Msg.sucess().add("pageInfo",pageInfo);
    }

    //观看人数最多列表内容
    @RequestMapping(path="/most",method = RequestMethod.GET)
    public Msg most(Integer pageNo){

        //这是一个分页查询
        //引入PageHelp分页插件
        //在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pageNo,4);//自动添加limit 0,8
        //startPage后面紧跟的查询就是分页查询
        List<Article> articlePage = articleService.findMost();


        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,传入连续显示的页数
        PageInfo pageInfo=new PageInfo(articlePage,5);

        return Msg.sucess().add("pageInfo",pageInfo);
    }

    //作者查询
    @RequestMapping(path="/writer",method = RequestMethod.GET)
    public Msg writer(Integer pageNo,String text){

        System.out.println("pageNo---"+pageNo);
        System.out.println("text---"+text);
        //这是一个分页查询
        //引入PageHelp分页插件
        //在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pageNo,4);//自动添加limit 0,8
        //startPage后面紧跟的查询就是分页查询
        List<Article> articlePage = articleService.findWriter(text);


        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,传入连续显示的页数
        PageInfo pageInfo=new PageInfo(articlePage,5);

        return Msg.sucess().add("pageInfo",pageInfo);
    }



}
