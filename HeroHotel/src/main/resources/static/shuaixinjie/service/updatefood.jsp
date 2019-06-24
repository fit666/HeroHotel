<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="FoodInsertServlet" method="post" enctype="multipart/form-data">
食品名称:<input type="text" name="fname" value=""><br/>
食品单价(￥):<input type="text" name="fprice" value=""><br>
食品描述:<input type="text" name="fdescribe" value=""><br>
食品照片:<input type="file" name="images" value=""><br>
<input style="margin-left:100px;margin-top:30px;width:100px;height:30px;font-size:20px;background-color:#E6E6E6;border:0px"  type="submit" value="提交" onclick="getchange()">
</form>

</body>


</html>