$(function () {
    $.ajax({
        url:"/article/getAll",
        data:{},
        dataType:"json",
        type:"post",
        success:function (list) {
            var table=$("#table");
            var div = $("#div22");
            var title = $(".title");
            for (var i in list){
                div.append("<br><div class="+"post col-xl-8 "+" id="+"div"+">"+
                    // "<div "+"class"+"="+"post-thumbnail"+"><a href="+"#"+"><img src="+"WEB-INF\\uploadFiles2\\"+list[i].picture+" alt="+"..." +"class="+"img-fluid"+"></a></div>"+
                    "<div "+"class"+"="+"post-thumbnail"+"><a href="+"#"+"></a></div>"+
                    "<div class="+"post-details>"+
                    "<div class="+"post-meta d-flex justify-content-between>"+
                    // "<div class="+"category"+"><a href="+"#"+">"+list[i].id+"</a></div>"
                    //显示id                  /article/saveById/888
                    "<div class="+"category"+"><a href="+"/article/saveById/"+list[i].id+">"+list[i].id+"</a></div>"
                    +
                    "</div><a href="+"post.html>"+
                    //显示标题
                    "<h3 class="+"h4"+">"+list[i].headline+"</h3></a>"+
                    // 显示内容
                    "<p class="+"text-muted"+">"+list[i].content+"</p>"+
                    "<footer class="+"post-footer d-flex align-items-center"+">"+
                    // //显示id
                    "<div class="+"title"+"id=tt"+"><span>"+list[i].id+"</span></div></a>"+
                        "<div class="+"title"+"><span>"+list[i].id+"</span></div></a>"+
                    //发帖时间
                        "<div class="+"date"+"><i class="+"icon-clock"+"></i>"+list[i].date+"</div>"+
                    //观看次数
                        "<div class="+"comments meta-last"+"><i class="+"icon-comment"+"></i>"+"观看次数"+list[i].lookCount+"</div>"+
                    "</footer>"+"<br><div>"+list[i].name+"</div>"+
                    "</div>"
                )
            }
        }
    })
})