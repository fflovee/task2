<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/4/24
  Time: 0:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%--<%@ page isELIgnored="false" %>--%>
<html>
<head>
    <title>查询学生信息表</title>
</head>
<body>

    <p>全部学生信息</p>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>姓名</th>
            <th>QQ</th>
            <th>职业</th>
            <th>入学时间</th>
            <th>毕业院校</th>
            <th>线上ID</th>
            <th>日报链接</th>
            <th>立愿</th>
            <th>师兄</th>
            <th>获知途径</th>
            <th>创建时间</th>
            <th>修改时间</th>
            <th>删除信息</th>
            <th>更新信息</th>
        </tr>
        <c:forEach items="${pageInfo}" var="stu">
            <tr>
                <td>${stu.id}</td>
                <td>${stu.name}</td>
                <td>${stu.qq}</td>
                <td>${stu.student_type}</td>
                <td>${stu.jointime}</td>
                <td>${stu.technology}</td>
                <td>${stu.jnshuID}</td>
                <td>${stu.daily}</td>
                <td>${stu.wish}</td>
                <td>${stu.brother}</td>
                <td>${stu.knowfrom}</td>
                <td>${stu.create_at}</td>
                <td>${stu.update_at}</td>
                <td>
                    <form action="/student/del/${stu.id}" method="post">
                        <input type="hidden" name="_method" value="DELETE">
                        <input type="submit" value="删除">
                    </form>
                </td>
                <td>
                    <form action="/student/update/${stu.id}" method="post">
                        <input type="submit" value="更新">
                    </form>
                </td>
            </tr>
        </c:forEach>

    </table>

    <%--<div>--%>
        <%--<spring:message code="${code}"/>--%>
        <%--&lt;%&ndash;${code}&ndash;%&gt;--%>
        <%--<p>11111111111121222</p></div>--%>
<%--    <div style="text-align:center">
        <a href="?start=0">首  页</a>
        <a href="?start=${pageInfo.start-pageInfo.count}">上一页</a>
        <a href="?start=${pageInfo.start+pageInfo.count}">下一页</a>
        <a href="?start=${pageInfo.last}">末  页</a>
    </div>--%>
    <div align="center">
        <a href="/page/${pageInfo}">上一页</a>
        <a href="/page/${pageInfo}">下一页</a>
        <a href="/student/addstu">添加学生</a>
    </div>

</body>
</html>