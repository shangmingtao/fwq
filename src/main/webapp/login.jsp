<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<html>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>


<body>
<form id="loginForm" action="login" method="post">
    <table border="1">
        <tr>
            <th>用户名 : </th>
            <th><input id = "username" name="username"/></th>
        </tr>
        <tr>
            <th>密码 : </th>
            <th><input id = "password" name="password"/></th>
        </tr>
    </table>
    <h1>${error}</h1>
    <input type="submit" value="提交"/>
    <input type="reset" value="清空"/>
</form>
</body>
<script src="<%=basePath%>/resources/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
</script>
</html>
