<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="layui/css/layui.css"  media="all">
<link href="css/select.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="index.html" target="rightFrame">轮播管理</a></li>
			<li><a href="#">添加图片</a></li>
		</ul>
	</div>

	<div id="usual1" class="usual">
		<div class="itab">
			<ul>
				<li><a href="#tab1" class="selected">上传照片</a></li>

			</ul>
		</div>
		<div id="tab1" class="tabson">
			<div class="formtext">
				Hi，<b>admin</b>，欢迎您试用图片上传功能！
			</div>
		</div>
	</div>
	<form action="../PhotoSaveServlet" method="post"
		enctype="multipart/form-data">
		<label for="fid">+</label><input id="fid" type="file" name="fileName" />
		
		<!-- <input type="submit" class="btn" 
			value="" /> -->
			<input class="layui-btn layui-btn-warm" style="margin-top: 30px;margin-left:50px" type="submit"  value="上传图片">
	</form>
	<script type="text/javascript" src="../js/jquery-1.8.2.min.js"></script>
	<script src="layui/layui.js" charset="utf-8"></script>
	<script type="text/javascript" src="js/add_photo.js"></script>
</body>
</html>
