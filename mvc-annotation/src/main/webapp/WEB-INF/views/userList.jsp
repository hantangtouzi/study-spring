<%--
  Created by IntelliJ IDEA.
  User: WenLiang
  Date: 2019/6/29
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>用户信息</title>
</head>
<body>
<h1>
    <c:forEach items="${users}" var="user">

        user.ID: ${user.id}<br/>
    </c:forEach>
</h1>
</body>
</html>
