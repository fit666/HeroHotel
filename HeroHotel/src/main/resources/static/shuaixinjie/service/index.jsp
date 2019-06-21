<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>layout 后台大布局 - Layui</title>
<link rel="stylesheet" href="layui/css/layui.css">
<script type="text/javascript" src="../js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="js/welcome.js"></script>
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<div class="layui-logo">酒店后台管理</div>
			<!-- 头部区域（可配合layui已有的水平导航） -->
			<ul class="layui-nav layui-layout-left">
		
			</ul>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="javascript:;"> <img
						src="http://t.cn/RCzsdCq" class="layui-nav-img">${sessionScope.SESSION_ADMIN.aname }
				</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">基本资料</a>
						</dd>
						<dd>
							<a href="">安全设置</a>
						</dd>
					</dl></li>
				<li class="layui-nav-item"><a href="../AdminOutLoginServet">退出</a></li>
			</ul>
		</div>

		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree" lay-filter="test">
					<li class="layui-nav-item layui-nav-itemed"><a class=""
						href="javascript:checkframe(0);">房间管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:checkframe(0);">客房管理</a>
							</dd>
							<dd>
								<a href="javascript:checkframe(1);">会议室管理</a>
							</dd>
							<dd>
								<a href="javascript:checkframe(2);">餐厅管理</a>
							</dd>
							<dd>
								<a href="javascript:checkframe(100);">添加房间</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:checkframe(3);">餐饮管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:checkframe(3);">食品管理</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item layui-nav-itemed"><a class=""
						href="javascript:checkframe(4);">订单管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:checkframe(4);">房间订单</a>
							</dd>
							<dd>
								<a href="javascript:checkframe(5);">餐饮订单</a>
							</dd>
						</dl></li>
						<li class="layui-nav-item layui-nav-itemed"><a class=""
						href="javascript:checkframe(6);">用户管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:checkframe(6);">用户列表</a>
							</dd>
							<dd>
								<a href="javascript:checkframe(7);">添加系统管理员</a>
							</dd>
						</dl></li>
						<li class="layui-nav-item layui-nav-itemed"><a class=""
						href="javascript:checkframe(8);">新闻中心</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:checkframe(8);">酒店简介</a>
							</dd>
							<dd>
								<a href="javascript:checkframe(9);">用户评价</a>
							</dd>
						</dl></li>
						<li class="layui-nav-item layui-nav-itemed"><a class=""
						href="javascript:checkframe(10);">轮播管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:checkframe(10);">图片管理</a>
							</dd>
							<dd>
								<a href="javascript:checkframe(11);">上传图片</a>
							</dd>
						</dl></li>
				</ul>
			</div>
		</div>

		<div class="layui-body" >
			<!-- 内容主体区域 -->
			<div style="height:550px ; padding: 15px;"><iframe frameborder="0"  width="100%" height="100%" id="myframe" src="welcome.jsp"></iframe></div>
		</div>

		<div class="layui-footer">
			<!-- 底部固定区域 -->
			© layui.com - 酒店管理
		</div>
	</div>
	<script src="layui/layui.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
</body>
</html>