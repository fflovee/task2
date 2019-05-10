<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/4/30
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<form action="/student/add" method="post">
    姓名<input type="text" name="name"><br>
    QQ<input type="text" name="qq"><br>
    修真类型<input type="text" name="student_type"><br>
    入学时间<input type="text" name="jointime"><br>
    毕业院校<input type="text" name="technology"><br>
    线上学号<input type="text" name="jnshuID"><br>
    日报连接<input type="text" name="daily"><br>
    立愿<input type="text" name="wish"><br>
    师兄<input type="text" name="brother"><br>
    了解渠道<input type="text" name="knowfrom"><br>
    创建时间<input type="text" name="create_at"><br>
    更新时间<input type="text" name="update_at"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
