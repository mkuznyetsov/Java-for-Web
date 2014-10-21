<%--
  Created by IntelliJ IDEA.
  User: Nazar
  Date: 02.10.2014
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>

    <table>
        <c:forEach var="temp" items="${list}">
            <tr>
                <td>
                    ${temp.id}
                </td>
                <td>
                    ${temp.first_name}
                </td>
                <td>
                    ${temp.last_name}
                </td>
            </tr>
        </c:forEach>
    </table>
  </body>
</html>
