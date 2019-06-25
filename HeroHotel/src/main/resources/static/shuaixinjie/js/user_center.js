$(function() {
	$("#textbody").load('usermsg.jsp');
	$.ajax({
		url:"../user/userInfo",
		type:"post",
		data:{},
		dataTyoe:"json",
		success:function(data){
			alert(data);
		}
	})
})
function showInfo(){
	showBox();
	closeVip();
	closePwd();
	closeOrder();
}
function showOrders(){

	$.ajax({
		url:"../order/allOrders",
		type:"post",
		data:{},
		dataType:"json",
		success:function(data){
			var context="";
			for(var i=0;i<data.length;i++){
				context+="<tr>"
							+"<td>"+data[i].ordernumber+"</td>"
							+"<td>"+data[i].createtime+"</td>"
							+"<td>"+data[i].total+"</td>"
							+"<td>"+data[i].payway+"</td>"
							+"<td><button type='button' class='btn btn-default' onclick='comment()'>评论</button></td>"
						+"</tr>";
			}
			context=context+"<tr><td colspan='5'></td></tr>";
			$("#orders").html(context);
			closeBox();
			closeVip();
			closePwd();
			showOrder();
		}
	})
}
function reset(){
	$.ajax({
		url:"../user/rpwd",
		type:"post",
		data:{
			pwd:$("#password").val()
		},
		success:function(data){
			alert(data);
		}
	})
}
function addInfo(){
	$.ajax({
		url:"../info/addInfo",
		type:"post",
		data:{
			"uname":$("#name").val(),
			"sex":$(':radio[name="sex"]:checked').val(),
			"idcard":$("#idcard").val()
		},

		success:function(data){
			alert(data);
			if(data=="添加成功"){
				window.location.reload();
			}
		}
	})
}
function showVips(){
	$.ajax({
		url:"../vip/allVips",
		type:"post",
		data:{},
		dataType:"json",
		success:function(data){
			var context="";
			for(var i=0;i<data.length;i++){
				context+="<tr>"
							+"<td>"+data[i].vname+"</td>"
							+"<td>"+data[i].vmoney+"</td>"
							+"<td>"+data[i].discount+"折</td>"
						+"</tr>";
			}
			context=context+"<tr><td colspan='3'></td></tr>";
			$("#vips").html(context);
			showVip();
			closeOrder();
			closeBox();
			closePwd();
		}
	})
}
function comment(){
	location.href="/share.html";
}
function showOrder(){
	$("#order").fadeIn("fast");
}
function showBox(){
	$("#info").fadeIn("fast");
}
function showPwd(){
	closeBox();
	closeOrder();
	closeVip();
	$("#pwd").fadeIn("fast");
}
function showVip(){
	$("#vip").fadeIn("fast");
}
function closeOrder(){
	$("#order").fadeOut("fast");
	$("#orders").empty();
}
function closeBox(){
	$("#info").fadeOut("fast");
}
function closePwd(){
	$("#pwd").fadeOut("fast");
}
function closeVip(){
	$("#vip").fadeOut("fast");
	$("#vips").empty();
}
