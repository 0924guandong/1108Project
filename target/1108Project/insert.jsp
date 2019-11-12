<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/8 0008
  Time: 下午 2:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.3.1.min.js"></script>
</head>
<body>

<form action="/saveById" method="post"  enctype="multipart/form-data">
            用户名：<input type="username" name="username">
            描述：<input type="text" name="content">
<%--            图片：<input type="text" name="picture">--%>
            标题：<input type="text" name="headline">
<%--            选择文件：<input type="file" name="upload" /><br/>--%>
            <input type="submit" value="提交">
</form>

</body>
</html>
