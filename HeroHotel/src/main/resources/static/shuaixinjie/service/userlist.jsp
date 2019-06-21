<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="layui/css/layui.css" media="all" />
<script type="text/javascript" src="../js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="js/pre.js"></script>
</head>

<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="index.html" target="rightFrame">用户管理</a></li>
			<li><a href="#">用户列表</a></li>
		</ul>
	</div>
	<div class="rightinfo">
		<div class="tools">
			<div class="itab">
				<ul>
					<li><a href="#tab1" class="selected">用户列表</a></li>
				</ul>
			</div>

		</div>
		<table class="tablelist"  class="layui-table" lay-data="{width: 800, height:332, url:'/demo/table/user/', page:true, id:'idTest'}" lay-filter="demo">
			<thead>
				<tr>
					<th>ID</th>
					<th>用户名</th>
					<th>密码</th>
					<th>账户余额</th>
					<th>用户类型</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody id="tbody">
			</tbody>
		</table>
		<!-- 分页控件显示的div -->
		<div id="demo7"></div>

	</div>
	<script src="layui/layui.js" charset="utf-8"></script>
	
	<script type="text/javascript" src="js/userlist.js">
		
	</script>
</body>
</html>