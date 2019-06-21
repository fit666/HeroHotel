<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>房间添加</title>
<link rel="stylesheet" href="layui/css/layui.css"  media="all">
<script type="text/javascript" src="../js/jquery-1.8.2.min.js"></script>
</head>
<body>

<form class="layui-form" >
  <div class="layui-form-item">
    <label class="layui-form-label">房间号</label>
    <div class="layui-input-block">
      <input type="text" id="title" name="title" lay-verify="title" autocomplete="off" placeholder="请输入房间号" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">房间类型</label>
    <div id="droom1" class="layui-input-inline" ><!-- lay-filter="t1" -->
      <select lay-filter="test" name="quiz1" id="roomb">
        <option value="99">--请选择--</option>
      </select>
    </div>
    <div id="droom" class="layui-input-inline">
      <select name="quiz2" id="rooms">
        <option value="">--请选择--</option>
      </select>
    </div>
  </div>
  
  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">价格/12小时</label>
      <div class="layui-input-inline" style="width: 100px;">
        <input type="text" id="price_min" name="price_min" placeholder="￥" autocomplete="off" class="layui-input">
      </div>
    </div>
  </div>
  
  <div class="layui-form-item layui-form-text">
    <label class="layui-form-label">普通文本域</label>
    <div class="layui-input-block">
      <textarea id="dtext" name="dtext" placeholder="请输入内容" class="layui-textarea"></textarea>
    </div>
  </div>
  
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" onclick="add()">立即提交</button><!-- lay-submit="" lay-filter="demo1"-->
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>
<script src="layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="js/select.js"></script>
<script type="text/javascript" src="js/addroom.js"></script>
</body>
</html>