<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/8 0008
  Time: 上午 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script>
        $(function () {
            $.ajax({
                url:"/article/findAll",
                data:{},
                dataType:"json",
                type:"post",
                success:function (list) {
                    for (var i in list){
                        table.append("<tr><td>"+list[i].id+"</td>"+
                            "<td>"+list[i].date+"</td>"+
                            "<td>"+list[i].lookCount+"</td>"+
                            "<td>"+list[i].describe+"</td>"+
                            "<td>"+list[i].picture+"</td>"+
                            "<td>"+list[i].headline+"</td>"+
                            "<td>"+list[i].flag+"</td>"+
                            "<td>"+list[i].type+"</td>"+
                            "<td>"+"</td>"+
                            +"</tr>");

                    }

                }
            })
        })
    </script>
</head>
<body>
测试成功

<form>
    <table id="table" align="center" width="700px" cellspacing="0" cellpadding="0">
        <caption>文章表</caption>
        <tr>
            <td>发帖者</td>
            <td>发布时间</td>
            <td>观看次数</td>
            <td>描述内容</td>
            <td>图片</td>
            <td>标题</td>
            <td>逻辑删除</td>
            <td>积分</td>
            <td>模块类型标签</td>
        </tr>
    </table>
</form>



</body>
</html>
