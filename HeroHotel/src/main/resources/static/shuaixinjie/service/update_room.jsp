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
<form action="ServiceRoomUpdateServlet" method="post">
<table align="center" border="1" cellspacing="0" bordercolor="#E6E6E6">
<tr><td align="left">ID：</td><td align="left"><input name="id" readonly="true" type="text" value="${requestScope.ROOM.id }"></td></tr>
<tr><td align="left">房间号：</td><td align="left"><input name="roomid" readonly="true" type="text" value="${requestScope.ROOM.roomid }"></td></tr>
<tr><td align="left">大类型：</td><td align="left"><input name="type" readonly="true" type="text" value="${requestScope.ROOM.type }"></td></tr>
<tr><td align="left">小类型：</td><td align="left"><input name="roomtype" readonly="true" type="text" value="${requestScope.ROOM.roomtype }"></td></tr>
<tr><td align="left">价格/12小时：</td><td align="left"><input name="rprice" type="text" value="${requestScope.ROOM.rprice }"></td></tr>
<tr><td align="left">描述：</td><td align="left"><textarea name="rdescribe" rows="5" cols="30" >${requestScope.ROOM.rdescribe }</textarea></td></tr>
<tr><td align="left">图片：</td><td align="left"><input name="image" type="file" value="${requestScope.ROOM.image }"></td></tr>
<tr><td align="left">状态：</td><td align="left">
												<select name="status">
													<option value="0" selected="selected">空闲</option>
													<option value="1">已预订</option>
												</select></td></tr>
<tr><td align="left">已订用户id：</td><td align="left"><input name="userid" type="text" value="${requestScope.ROOM.userid }"></td></tr>
</table>
<input style="margin-left:100px;margin-top:30px;width:100px;height:30px;font-size:20px;background-color:#E6E6E6;border:0px" type="submit" value="保存修改">
</form>
</body>
</html>