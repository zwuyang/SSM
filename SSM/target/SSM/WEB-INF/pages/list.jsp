<%--
  Created by IntelliJ IDEA.
  User: yz
  Date: 2019/7/21
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询所有用户</title>
</head>
<body>
    <h3>查询所有</h3>
         <c:forEach items="${people}" var="person">
             ${person.name}
<%--             ${person.age}--%>
         </c:forEach>
</body>
</html>
