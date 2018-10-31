<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/1
  Time: 2:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Student Information</h2>
<%--<form:form method="POST" action="/addStudent">--%>
    <%--<table>--%>
        <%--<tr>--%>
            <%--<td><form:label path="name">姓名：${message.name}</form:label></td>--%>
            <%--<td><form:input path="name" /></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td><form:label path="age">年龄：${message.age}</form:label></td>--%>
            <%--<td><form:input path="age" /></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td><form:label path="id">编号：${message.id}</form:label></td>--%>
            <%--<td><form:input path="id" /></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td colspan="2">--%>
                <%--<input type="submit" value="提交表单"/>--%>
            <%--</td>--%>
        <%--</tr>--%>
    <%--</table>--%>
<%--</form:form>--%>
姓名：${message.name}
年龄：${message.age}
编号：${message.id}
</body>
</html>
