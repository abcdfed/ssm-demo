<%--
  Created by IntelliJ IDEA.
  User: zheng
  Date: 19-6-20
  Time: 下午8:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello world</title>
</head>
<body>
<div align="center">
    <h1>欢迎欢迎热烈欢迎</h1>
    <a href="account/findAll">跳转</a>

    <form method="post" action="account/saveAccount">

        姓名：<input type="text" name="name"> <br>
        money:<input type="text" name="money"> <br>
        <input type="submit" value="提交">

    </form>
</div>
</body>
</html>
