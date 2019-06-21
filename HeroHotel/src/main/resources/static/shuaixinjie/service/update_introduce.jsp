<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.8.2.min.js"></script>
</head>
<body>
<form action="ServiceIntroduceUpdateServlet" method="post" enctype="multipart/form-data">
<table align="center" border="1" cellspacing="0" bordercolor="#E6E6E6">
<tr><td align="left">ID：</td><td align="left"><input name="id" readonly="true" type="text" value="${requestScope.INTRODUCE.id }"></td></tr>
<tr><td align="left">酒店名称：</td><td align="left"><input name="name"  type="text" value="${requestScope.INTRODUCE.name }"></td></tr>
<tr><td align="left">酒店简介：</td><td align="left"><textarea name="text" > ${requestScope.INTRODUCE.text }</textarea></td></tr>
<tr><td align="left">图片：</td><td align="left"><input name="image" type="file"></td></tr>
</table>
<input style="margin-left:100px;margin-top:30px;width:100px;height:30px;font-size:20px;background-color:#E6E6E6;border:0px" type="submit" value="保存修改">
</form>
</body>
</html>