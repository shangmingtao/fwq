<%@ page language="java" pageEncoding="UTF-8"  %>
<html>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<body>
<a href="<%=basePath%>/select">查询</a>
</body>
</html>
