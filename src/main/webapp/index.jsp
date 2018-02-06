<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<html>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>

<body>

<h1>this is a sevlet study demo</h1>
<h1>当前登录状态 : ${sessionScope.password eq "123" ? "登陆成功" : "当前未登录"}</h1>


<a href="<%=basePath%>login.jsp">登陆</a>
</body>
</html>
