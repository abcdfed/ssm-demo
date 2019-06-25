<%--
  Created by IntelliJ IDEA.
  User: zheng
  Date: 19-6-17
  Time: 下午4:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数</title>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
            $("#testAjax").click(function () {
                alert("test ajax");
                $.ajax(
                    {
                        url:"Param/testAjax",
                        contentType:"application/json;charset=UTF-8",
                        data:'{"age":143,"sex":"aaa"}',
                        dataType:"json",
                        type:"post",
                        success:function (data) {
                            alert(data);
                            alert(data.age);
                        }
                    }
                );
            });
        });
    </script>
</head>


<%--<form action="Param/saveAccount" method="post">--%>

    <%--姓名：<input type="text" name="name">--%>
    <%--<br>--%>
    <%--id：<input type="text" name="id">--%>
    <%--<br>--%>
    <%--money：<input type="text" name="money">--%>
    <%--<br>--%>
    <%--user.age:<input type="text" name="user.age">--%>
    <%--<br>--%>
    <%--user.sex:<input type="text" name="user.sex">--%>
    <%--<br>--%>
    <%--<input type="submit" value="提交">--%>

<%--</form>--%>



<%--<form action="Param/ListMap" method="post">--%>

    <%--姓名：<input type="text" name="name">--%>
    <%--<br>--%>
    <%--id：<input type="text" name="id">--%>
    <%--<br>--%>
    <%--money：<input type="text" name="money">--%>
    <%--<br>--%>
    <%--user.age:<input type="text" name="user.age">--%>
    <%--<br>--%>
    <%--user.sex:<input type="text" name="user.sex">--%>
    <%--<br>--%>
    <%--user.age:<input type="text" name="list[0].age">--%>
    <%--<br>--%>
    <%--user.sex:<input type="text" name="list[0].sex">--%>
    <%--<br>--%>
    <%--user.age:<input type="text" name="map['one'].age">--%>
    <%--<br>--%>
    <%--user.sex:<input type="text" name="map['one'].sex">--%>
    <%--<br>--%>
    <%--<input type="submit" value="提交">--%>

<%--</form>--%>



<h1>测试自定义类型转换器</h1>
<form action="Param/testTime" method="post">
    test time<input type="test" name="date">
    <br>
    <input type="submit" value="提交">
</form>


<br><br>
<h1>注解test RequestParam</h1>
<form action="Param/testRequestParam">
    姓名：<input type="text" name="name">
    <%--age：<input type="text" name="age">--%>
    <input type="submit" value="提交">
</form>

<br><br>
<h1>test RequestBody</h1>
<form action="Param/testRequestBody" method="post">
    姓名：<input type="text" name="name">
    age:<input type="text" name="age">
    <input type="submit" value="提交">
</form>

<br><br>
<h1>test PathVaribale</h1>
<a href="Param/testPathVariable/111">PathVaribale</a>
</form>

<br><br>
<h1>test ModelAttribute</h1>
<form action="Param/testModelAttribute" method="post">
    姓名：<input type="text" name="name">
    <input type="submit" value="提交">
</form>

<br><br>
<h1>test SessionAttribute</h1>
<a href="Param/testGetSessionAttribute">getSessionAttribute</a><br>
<a href="Param/testSetSessionAttribute">setSessionAttribute</a><br>
<a href="Param/testdelSessionAttribute">delSessionAttribute</a><br>


<br>
<h1>test Conttorller 返回字符串，用setSession</h1>
<a href="Param/testReturnString">test</a>

<br>
<h1>test Controller 返回为void；</h1>
<a href="Param/testReturnVoid">test viod</a>

<br>
<h1>test controller 返回modelAndView</h1>
<a href="Param/testModelAndView">test ModelAndView</a>


<br>
<h1>test controller forword关键词</h1>
<a href="Param/testForword">test ModelAndView</a>

<br>
<h1>test ajax，静态资源</h1>
<button id="testAjax">test</button>

<br>
<h1>test 异常处理</h1>
<a href="Param/testException">test 异常</a>


<br>
<h1>test 拦截器</h1>
<a href="Param/testInterceptor">test Interceptor</a>

</body>
</html>
