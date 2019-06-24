<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Welcome!</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery-1.8.2.min.js"></script>
</head>


<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">欢迎页</a></li>
		</ul>
	</div>

	<div class="mainindex">


		<div class="welinfo">
			<span><img src="images/sun.png" alt="天气" /></span> <b>${sessionScope.SESSION_ADMIN.aname} 早上好，欢迎使用酒店管理系统</b>(admin@uimaker.com)
		</div>

		<div class="welinfo">
			<span><img src="images/time.png" alt="时间" /></span> <i>本次登录时间：${sessionScope.LOGINTIME}</i> （不是您登录的？<a href="javascript:hhh();">请点这里</a>）
		</div>

		<div class="xline"></div>

		<ul class="iconlist">

			<li><img src="images/ico01.png" />
			<p>
					<a href="#">房间管理</a>
				</p></li>
			<li><img src="images/ico02.png" />
			<p>
					<a href="#">信息管理</a>
				</p></li>
			<li><img src="images/ico03.png" />
			<p>
					<a href="#">数据统计</a>
				</p></li>
			<li><img src="images/ico04.png" />
			<p>
					<a href="#">文件上传</a>
				</p></li>
			<li><img src="images/ico05.png" />
			<p>
					<a href="#">订单管理</a>
				</p></li>
			<li><img src="images/ico06.png" />
			<p>
					<a href="#">查询</a>
				</p></li>

		</ul>

		<div class="ibox">
			<a class="ibtn"><img src="images/iadd.png" />添加新的快捷功能</a>
		</div>

		<div class="xline"></div>
		<div class="box"></div>

		<div class="welinfo">
			<span><img src="images/dp.png" alt="提醒" /></span> <b>Uimaker酒店管理系统使用指南</b>
		</div>

		<ul class="infolist">
			<li><span>您可以快速进行房间管理操作</span><a class="ibtn">添加或管理房间</a></li>
			<li><span>您可以快速发布信息</span><a class="ibtn">发布或管理信息</a></li>
			<li><span>您可以用户查看、编辑等操作</span><a class="ibtn">用户管理</a></li>
		</ul>

		<div class="xline"></div>

		<div class="uimakerinfo">
			<b>查看Uimaker网站使用指南，您可以了解到酒店更多相关信息</b>(<a
				href="http://localhost:8080/Hotel/index.html" target="_blank">酒店门户网站</a>)
		</div>

		<ul class="umlist">
			<li><a href="#">如何管理房间</a></li>
			<li><a href="#">如何访问网站</a></li>
			<li><a href="#">如何管理信息</a></li>
			<li><a href="#">后台用户设置(权限)</a></li>
			<li><a href="#">系统设置</a></li>
		</ul>


	</div>
	<script type="text/javascript">
		function hhh() {
			alert("哈哈哈，点我也没用！O(∩_∩)O哈哈~");
		}
	
	</script>
</body>
</html>
