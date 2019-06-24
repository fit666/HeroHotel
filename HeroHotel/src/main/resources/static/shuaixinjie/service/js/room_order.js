$(function() {
		ajaxCount();
		getMsgAll(1, 10);
	});

	//通过ajax获取总记录
	function ajaxCount() {
		$.ajax({
			url : '../ServiceRoomOrderCountServlet',
			type : 'post',
			dataType : 'json',
			success : function(data) {
				page(data * 1);
			}

		});
	}
	function page(count) {
		layui.use([ 'laypage', 'layer' ], function() {
			var laypage = layui.laypage, layer = layui.layer;
			//完整功能
			laypage.render({
				elem : 'demo7',
				count : count//总记录
				,
				layout : [ 'count', 'prev', 'page', 'next', 'limit',
						'refresh', 'skip' ],
				jump : function(obj, first) {
					if (!first) {
						getMsgAll(obj.curr, obj.limit);
					}
				}
			});

		});

	}

	function getMsgAll(pageNumber, pageSize) {
		$.ajax({
			url : '../ServiceRoomOrderServlet',
			data : {
				"pageNumber" : pageNumber,
				"pageSize" : pageSize
			},
			type : 'post',
			dataType : 'json',
			success : function(obj) {

				var tb = $("#tbody");
				tb.empty();
				var str = "";
				$.each(obj, function(i, user) {
					var state = user.status;
					if(state==0){
						state="待处理";
					}else if(state==1){
						state="待入住";
					}else if(state==2){
						state="已入住";
					}else if(state==3){
						state="已退房";
					}else if(state==4){
						state="退单中";
					}else if(state==5){
						state="已退单";
					}
					
					str += "<tr>";
					str += "<td>" + user.id + "</td>";
					str += "<td>" + user.userid + "</td>";
					str += "<td>" + user.time + "</td>";
					str += "<td>" + user.type + "</td>";
					str += "<td>" + user.roomtype + "</td>";
					str += "<td>" + user.starttime + "</td>";
					str += "<td>" + user.endtime + "</td>";
					str += "<td>" + state + "</td>";
					str += "<td>" + user.roomid + "</td>";
					str += "<td>" + user.rprice + "</td>";
					str += "<td> <button class='layui-btn layui-btn-xs' onclick='update("+user.id+")'>更新信息</button></td>";
					str += "</tr>";
				});
				tb.append(str);
			}

		});

	}
	$('.tablelist tbody tr:odd').addClass('odd');
	function update(id){
		layui.use('layer',function(){
			var layer=layui.layer;
			layer.open({
				  type: 2,
				  title: '订单信息更新',
				  area: ['400px', '200px'],
				  fixed: false, //不固定
				  maxmin: true,
				  content: '../ServiceShowRoomOrderServlet?id='+id 
				});
		});
	}
	
	//toast提示
	function Toast(msg, duration) {
		duration = isNaN(duration) ? 3000 : duration;
		var m = document.createElement('div');
		m.innerHTML = msg;
		m.style.cssText = "width: 10%;min-width: 150px;opacity: 0.7;height: 30px;color: rgb(255, 255, 255);line-height: 30px;text-align: center;border-radius: 5px;position: fixed;top: 50%;left: 50%;z-index: 999999;background: rgb(0, 0, 0);font-size: 12px;";
		document.body.appendChild(m);
		setTimeout(function() {
			var d = 0.5;
			m.style.webkitTransition = '-webkit-transform ' + d
					+ 's ease-in, opacity ' + d + 's ease-in';
			m.style.opacity = '0';
			setTimeout(function() {
				document.body.removeChild(m)
			}, d * 1000);
		}, duration);
	}