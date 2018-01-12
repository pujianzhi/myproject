<%--
  Created by IntelliJ IDEA.
  User: pjz
  Date: 2018/1/12
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生列表</title>
    <script src="WEB-INF/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<table>
    <tr>
        <td>学号</td>
        <td>名字</td>
        <td>性别</td>
        <td>年龄</td>
        <td>生日</td>
        <td>班级</td>
        <td>操作</td>
    </tr>
</table>
</body>
</html>
<script>
    (function () {
        $table = $("table");
        $.ajax({
            type:"GET",
            url:"/list.do",
            success:function (data) {
                
            }
        })
    })();
</script>
