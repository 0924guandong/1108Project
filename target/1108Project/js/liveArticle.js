$(function () {

    var totalRecord, currentPage;
    //显示第一页
    to_page(1);
    //搜索
    tolike();
    //查询篇数
    // to_count();
    // //查询标签类型
    // to_type();
    //
    // to_type2();


    function to_page(pageNo) {
        $.ajax({

            url: "/LiveJson",
            data: "pageNo=" + pageNo,
            type: "GET",
            // dataType:"json",
            success: function (result) {
                //1.解析并显示学生信息数据
                build_article_table(result);
                build_page_info(result);
                build_page_nav(result);
            }

        })
    }

    function tolike() {
        $("#submit3").click(function () {
            // alert("未解决");
            var pageNo = 1;
            var text = $("#text").val();
            $.ajax({
                url: "/LiveJson2",
                // data:$("#form").serialize()+"&_method=PUT",
                data: {pageNo: pageNo, text: text},
                // data:$("#form").serialize(),
                type: "GET",
                // dataType:"json",
                success: function (result) {
                    // 1.解析并显示学生信息数据
                    build_article_table(result);
                    build_page_info(result);
                    build_page_nav(result);

                }
            })
        })
    }

    // function to_count() {
    //     $.ajax({
    //         url: "/findType",
    //         data: {},
    //         type: "GET",
    //         dataType: "json",
    //         success: function (data) {
    //             var type = $("#type");
    //                 type.after(
    //                     "<div class=" + "item d-flex  justify-content-between" + "><a href=" + "#" + ">旅行篇" + "</a><span style='position: relative;left: 205px'>" + data[0] + "</span></div>" +
    //                     "<div  class=" + "item d-flex  justify-content-between" + "><a href=" + "#" + ">生活篇" + "</a><span style='position: relative;left: 205px'>" + data[1] + "</span></div>"
    //                 )
    //
    //         }
    //
    //     })
    // }

    // function to_type() {
    //     $.ajax({
    //         url:"/findAll",
    //         data:{},
    //         type:"GET",
    //         dataType:"json",
    //         success:function (data) {
    //             var ul = $("#ul");
    //             for (var i in data) {
    //                 ul.after(
    //                     "<span class=" + "list-inline-item" + "id=" + "ul" + "><a href=" + "/travel.html " + "class=" + "tag" + ">" + data[i].m_name + "</a></span>"
    //                     // "<span class=" + "list-inline-item" + "id=" + "ul" + "><button type=submit"+"onclick"+"=sb2(data[i].m_name)"+ "class=" + "tag" + ">" + data[i].m_name + "</button></span>"
    //
    //                 )
    //             }
    //
    //         }
    //     })
    // }

    // function to_type2() {
    //     $.ajax({
    //         url:"/"
    //
    //     })
    // }

    function build_article_table(result) {
        $('#div22').empty();
        var div = $("#div22");
        var article = result.extend.pageInfo.list;
        // var div = $("#div22");
        $.each(article, function (index, item) {
            div.append("<br><div class=" + "post col-xl-10 " + ">" +
                // "<div "+"class"+"="+"post-thumbnail"+"><a href="+"#"+"><img src="+"WEB-INF\\uploadFiles2\\"+list[i].picture+" alt="+"..." +"class="+"img-fluid"+"></a></div>"+
                "<div " + "class" + "=" + "post-thumbnail" + "><a href=" + "#" + "></a></div>" +
                "<div class=" + "post-details>" +
                "<div class=" + "post-meta d-flex justify-content-between>" +
                // "<div class="+"category"+"><a href="+"#"+">"+list[i].id+"</a></div>"
                //显示id                  /article/saveById/888
                //点击跳转
                // "<div class=" + "category" + "><a href=" + "/look/" + item.id + ">" + item.id + "</a></div>"
                // +
                "</div><a href=" + "/lzj_post.html?a_id=" + item.a_id + ">" +
                //显示标题
                "<h3 class=" + "h4" + ">" + item.a_headline  + "</h3></a>" +
                // 显示内容
                "<p class=" + "text-muted" + ">" + item.a_content + "</p>" +
                "<footer class=" + "post-footer d-flex align-items-center" + ">" +
                // //显示id
                // "<div class="+"title"+"id=tt"+"><span>"+item.user.username+"</span></div></a>"+
                "<div class=" + "title" + "><span>" + "作者：" + item.user.u_username + "</span></div></a>" +
                //发帖时间
                "<div class=" + "date" + "><i class=" + "icon-clock" + "></i>" + item.a_date + "</div>" +
                //观看次数
                "<div class=" + "views meta-last" + "><i class=" + "icon-eye" + "></i>" + "观看次数" + item.a_lookCount + "</div>" +
                "</footer>" +
                "</div>"
            )
            // }

        })


    }

    //解析显示分页信息
    function build_page_info(result) {
        $("#page_info_area").empty();
        $("#page_info_area").append("<br><div  style='position: relative;left: 190px;top: 30px'>" + "第 " + result.extend.pageInfo.pageNum + " 页,总共 " + result.extend.pageInfo.pages + " 页，共 " + result.extend.pageInfo.total + " 条记录" + "</div>");
        totalRecord = result.extend.pageInfo.total;
        currentPage = result.extend.pageInfo.pageNum;
    }

    //解析显示分页导航条
    function build_page_nav(result) {
        $("#page_nav_area").empty();
        var ul = $("<ul></ul>").addClass("pagination");
        var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href", "#"));
        var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;&nbsp;").attr("href", "#"));
        var nextPageLi = $("<li></li>").append($("<a></a>").append("&nbsp;&raquo;").attr("href", "#"));
        var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href", "#"));
        //如果没有前一页，前一页和首页就不能点
        if (result.extend.pageInfo.hasPreviousPage == false) {
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        } else {
            //首页
            firstPageLi.click(function () {
                to_page(1);
            });
            prePageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum - 1);
            });
        }
        if (result.extend.pageInfo.hasNextPage == false) {
            nextPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");
        } else {
            //构建点击事件

            nextPageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum + 1);
            });
            lastPageLi.click(function () {
                to_page(result.extend.pageInfo.lastPage);
            })
        }
        //添加首页和前一页
        ul.append(firstPageLi).append(prePageLi);
        //遍历添加页码
        $.each(result.extend.pageInfo.navigatepageNums, function (index, item) {
            var numLi = $("<li></li>").append($("<a></a>").append(item).append("&nbsp;").attr("href", "#"));
            //如果是当前选中页面，添加active标识
            if (result.extend.pageInfo.pageNum == item) {
                numLi.addClass("active");
            }
            //给每个页码添加点击就跳转
            numLi.click(function () {
                to_page(item);
            });
            ul.append(numLi);
        });
        //添加下一页和末页
        ul.append(nextPageLi).append(lastPageLi);
        var navEle = $("<nav></nav>").append(ul);
        navEle.appendTo("#page_nav_area");

    }


})

