<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="FoodGgServlet" method="post">
食品ID：<input type="text" name="id" value="${requestScope.Food.id}"></br>
食品名称:<input type="text" name="Fname" value="${requestScope.Food.fname }"></br>
食品单价(￥):<input type="text" name="Fprice" value="${requestScope.Food.fprice }"></br>
食品食材:<input type="text" name="Fdescribe" value="${requestScope.Food.fdescribe }"></br>
食品照片:<input type="file" name="Image" value="${requestScope.Food.image }"></br>
<input style="margin-left:100px;margin-top:30px;width:100px;height:30px;font-size:20px;background-color:#E6E6E6;border:0px" type="submit" value="提交" onclick="getchange()">
</form>

</body>
</html>