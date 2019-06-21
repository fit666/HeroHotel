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
<form action="ServiceFoodOrderUpdateServlet" method="post">
<table align="center" border="1" cellspacing="0" bordercolor="#E6E6E6">
<tr><td align="left">订单id：</td><td align="left"><input name="id" readonly="true" type="text" value="${requestScope.FOODORDER.id }"></td></tr>
<tr><td align="left">订单状态：</td><td align="left"><select name="status">
													<option value="0" selected="selected">待用餐</option>
													<option value="1">已用餐</option>
													<option value="2">已退单</option>
												</select></td></tr>
</table>
<input style="margin-left:150px;margin-top:30px;width:100px;height:30px;font-size:20px;background-color:#E6E6E6;border:0px" type="submit" value="保存修改">
</form>
</body>
</html>