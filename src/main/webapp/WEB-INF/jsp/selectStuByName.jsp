<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/4/18
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查找学生</title>
</head>
<body>
    <json:object>
        <json:property name="id" value="${stu.id}"/>
        <json:property name="name" value="${stu.name}"/>
        <json:property name="qq" value="${stu.qq}"/>
        <json:property name="type" value="${stu.type}"/>
        <json:property name="jointime" value="${jointime}"/>
        <json:property name="technology" value="${technology}"/>
        <json:property name="jnshuID" value="${jnshuID}"/>
        <json:property name="daily" value="${daily}"/>
        <json:property name="wish" value="${wish}"/>
        <json:property name="brother" value="${brother}"/>
        <json:property name="knowfrom" value="${knowfrom}"/>
        <json:property name="create_at" value="${create_at}"/>
        <json:property name="update_at" value="${update_at}"/>
    </json:object>
</body>
</html>
