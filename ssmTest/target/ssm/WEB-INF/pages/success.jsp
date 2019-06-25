<%--
  Created by IntelliJ IDEA.
  User: zheng
  Date: 19-6-20
  Time: 下午8:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>success</title>
</head>
<body>
<div align="center">

    <h1>success</h1>

    <c:forEach items="${list}" var="account">
        ${account.name}
    </c:forEach>
</div>
</body>
</html>
