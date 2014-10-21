<%--
  Created by IntelliJ IDEA.
  User: Nazar
  Date: 09.10.2014
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:if test = "${result > 10}">${result} > 10 </c:if>
<c:if test = "${result < 10}">${result} < 10 </c:if>
</body>
</html>
