<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加管理员</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="layui/css/layui.css"  media="all">
<script type="text/javascript" src="../js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="index.html" target="rightFrame">用户管理</a></li>
			<li><a href="#">添加系统管理员</a></li>
		</ul>
	</div>
	<br>
	<br>
	<br>
	<form class="layui-form" action="" lay-filter="example">
		<div class="layui-form-item">
			<label class="layui-form-label">管理员账号</label>
			<div class="layui-input-block">
				<input type="text" id="aname" name="username" lay-verify="title"
					autocomplete="off" placeholder="请输入账号" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">管理员密码</label>
			<div class="layui-input-block">
				<input type="password" id="password" name="password" placeholder="请输入密码"
					autocomplete="off" class="layui-input">
			</div>
		</div>

		<div class="layui-form-item">
			<div class="layui-input-block">
				<input type="button" width="100" class="layui-btn" value="立即提交" onclick="submitf()">
			</div>
		</div>
	</form>
	<script src="layui/layui.js" charset="utf-8"></script>
	<script type="text/javascript" src="js/addadmin.js">
		
	</script>
</body>
</html>