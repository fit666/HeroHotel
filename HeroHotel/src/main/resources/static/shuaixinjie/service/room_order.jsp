<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>房间管理-客房</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="layui/css/layui.css" media="all" />
<script type="text/javascript" src="../js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="js/pre.js"></script>
</head>

<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="index.html" target="rightFrame">订单管理</a></li>
			<li><a href="#">房间订单列表</a></li>
		</ul>
	</div>
	<img alt="" src="../../03.jpg">
	<div class="rightinfo">
		<div class="tools">
			<div class="itab">
				<ul>
					<li><a href="#tab1" class="selected">房间订单列表</a></li>
				</ul>
			</div>

		</div>
		<table class="tablelist"  class="layui-table" lay-data="{width: 800, height:332, url:'/demo/table/user/', page:true, id:'idTest'}" lay-filter="demo">
			<thead>
				<tr>
					<th>订单id</th>
					<th>用户id</th>
					<th>订单时间</th>
					<th>房间大类型</th>
					<th>房间小类型</th>
					<th>入住时间</th>
					<th>退房时间</th>
					<th>订单状态</th>
					<th>房间号</th>
					<th>订单价格</th>
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
	
	<script type="text/javascript" src="js/room_order.js">
	
	</script>
</body>
</html>