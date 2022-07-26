<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--使用jstl标签库--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理员信息</title>
</head>
<body>
<table>
    <caption border="1" width="400px">管理员信息</caption>
    <tr>
        <th>ID</th>
        <th>用户名</th>
        <th>密码</th>
        <th>管理员类型</th>
    </tr>
    <c:if test="${adminList ne null}">
        <c:forEach items="${adminList}" var="admin">
            <tr>
                <td>${admin.id}</td>
                <td>${admin.username}</td>
                <td>${admin.password}</td>
                <td>${admin.adminType}</td>
            </tr>
        </c:forEach>
    </c:if>

    <c:if test="${adminList eq null}">
        <tr>
                <%--合并表的四列信息--%>
            <td rowspan="4">没有任何管理员</td>
        </tr>
    </c:if>

</table>
</body>
</html>
