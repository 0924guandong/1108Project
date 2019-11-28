$(function () {

    //获取类型
    to_type();

    //获取作者信息
    to_author


    function to_type(){
        /*文章分类标签*/
        var a_id = location.href.split("=")[1];

        $.ajax({
            url: "/getMotif",
            data: {"id":a_id},
            dataType: "json",
            type: "GET",
            success: function (data) {
                var div = $("#motif");
                var div2 = $("#motif2");
                var div3 = $("#articleMsg");

                var m1 = $("#mainbody");
                var m2 = $("#maintitle");

                var a1 = $("#authorHead");
                var a2 = $("#authorName");
                var a3 = $("#authorEmail");
                var a4 = $("#articleMsg");
                for (var i in data){

                    div.append(" <li class=\"list-inline-item\"><a href=\"#\" class=\"tag\">" + data[i].m_name + "</a></li>")
                    div2.append("<a href=\"\" class=\"tag\">" + data[i].m_name + "</a>")

                    div3.append("<div class=\"date\"><i class=\"icon-clock\"></i>" + data[i].article.a_date+" " + "</div>" +
                        "<div class=\"views\"><i class=\"icon-eye\"></i>" + data[i].article.a_lookCount+" " + "</div>")

                    a1.append("<img src=\"../img/avatar-1.jpg\" alt=\"...\" class=\"img-fluid\">");
                    a2.append("<span>" + data[i].user.u_username+" " + "</span>");
                    a3.append("<span>" + data[i].user.u_email + " |" + "</span>");

                    m1.append("<br><p class=\"lead\">"+data[i].article.a_content+"</p>\n"+"<p></p>\n"+"<p>分类</p>");
                    m2.append("<h1>"+data[i].article.a_headline+"<a href=\"#\"><i class=\"fa fa-bookmark-o\"></i></a></h1>")


                }


            }
        })

    }








})
