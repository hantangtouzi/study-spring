<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Home</title>
</head>
<body>
${requestScope.get("errors")}
<hr/>
    <c:if test="${errors == null}">
        ${errors}
    </c:if>
    <div>
        <h1>用户注册</h1>
        <form action="/register" method="post">
            用户名:<input name="username"/><br/>
            FirstName:<input name="firstname"/><br/>
            密码：<input type="password" name="password"/><br/>
            <input type="submit" value="保存">
        </form>
    </div>
</body>
</html>
