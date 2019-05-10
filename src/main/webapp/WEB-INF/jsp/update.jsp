<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/4/26
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<h1>输入要更新的id为${stu.id}的学生的信息</h1>
<form action="/student/update" method="post">
    id:<input type="text" value="${stu.id}" name="id" readonly="readonly" ><br>
    姓名:<input type="text" value="${stu.name}" name="name"><br>
    QQ:<input type="text" value="${stu.qq}" name="qq"><br>
    修真类型:<input type="text" value="${stu.student_type}" name="student_type"><br>
    入学时间:<input type="text" value="${stu.jointime}" name="jointime"><br>
    毕业院校:<input type="text" value="${stu.technology}" name="technology"><br>
    线上学号:<input type="text" value="${stu.jnshuID}" name="jnshuID"><br>
    日报连接:<input type="text" value="${stu.daily}" name="daily"><br>
    立愿:<input type="text" value="${stu.wish}" name="wish"><br>
    师兄:<input type="text" value="${stu.brother}" name="brother"><br>
    了解渠道:<input type="text" value="${stu.knowfrom}" name="knowfrom"><br>
    创建时间:<input type="text" value="${stu.create_at}" name="create_at"><br>
    更新时间:<input type="text" value="${stu.update_at}" name="update_at"><br>
    <input type="submit" value="提交">
</form>







<%--<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>输入要更新的id为${id}的学生的信息</h1>
<form action="/student/update/${id}" method="post">
    <input type="hidden" name="_method" value="post">
    <select name="key">
        <option value="name">姓名</option>
        <option value="qq">QQ</option>
        <option value="type">修真类型</option>
        <option value="jointime">入学时间</option>
        <option value="technology">毕业院校</option>
        <option value="jnshuID">线上学号</option>
        <option value="daily">日报连接</option>
        <option value="wish">立愿</option>
        <option value="brother">师兄</option>
        <option value="knowfrom">了解渠道</option>
    </select>
    <input type="text" name="value"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>--%>

<%--<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="update" action="/student/update/${id}" method="post">
    <input type="hidden" name="_method"value="put">
    <table>
        <tr>
            <td>姓名:</td>
            <td><input name="name"></td>
        </tr>
        <tr>
            <td>线上ID:</td>
            <td><input name="name"></td>
        </tr>
        <tr>
            <td>师兄:</td>
            <td><input name="name"></td>
        </tr>
        <tr>
            <td><input type="submit" value="确认更新"></td>
        </tr>
    </table>
</form>
</body>
</html>--%>
