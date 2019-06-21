<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table align="center" border="1" cellspacing="0" bordercolor="#E6E6E6" width="300">
<tr><td align="left">用户ID：</td><td align="left">${requestScope.REALUSER.userid }</td></tr>
<tr><td align="left">真实姓名：</td><td align="left">${requestScope.REALUSER.realname }</td></tr>
<tr><td align="left">性别：</td><td align="left">${requestScope.REALUSER.sex }</td></tr>
<tr><td align="left">身份证号码：</td><td align="left">${requestScope.REALUSER.cardid }</td></tr>
<tr><td align="left">联系方式：</td><td align="left">${requestScope.REALUSER.phone }</td></tr>
</table>

</body>
</html>