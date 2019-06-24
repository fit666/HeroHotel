$(function() {
			ajaxCount();
			getMsgAll(1, 10);

		});



		function ajaxCount() {
			$.ajax({
				url : '../FoodCountServlet',
				type : 'post',
				typeType : 'json',
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
				url : '../FoodLimitServlet',
				data : {
					"pageindex" : pageNumber,
					"pagesize" : pageSize
				},
				type : 'post',
				dataType : 'json',
				success : function(obj) {
					var tb = $("#tbody");
					tb.empty();
					var str = "";
					$.each(obj, function(i, food) {
						str += "<tr>";
						str += "<td>" + food.id + "</td>";
						str += "<td>" + food.fname + "</td>";
						str += "<td>" + food.fprice + "</td>";
						str += "<td>" + food.fdescribe + "</td>";
						str += "<td><img width='50' height='50' src='../" +food.image+ "'/></td>";
						str += "<td> <button onclick='del("+food.id+")' class='layui-btn layui-btn-xs layui-btn-normal'>下架食品</button><button class='layui-btn layui-btn-xs' onclick='xiugai("+food.id+")'>修改食品</button></td>";
						str += "</tr>";
					});			
					tb.append(str);
				}
			});
		}
		$('.tablelist tbody tr:odd').addClass('odd');
		function show(){
		layui.use('layer',function(){
			var layer=layui.layer;
			layer.open({
				  type: 2,
					  title: '新增食品信息',
				  area: ['400px', '250px'],
					  fixed: false, //不固定
				  maxmin: true,
				  content: '../FoodUpdateServlet'
					});
			});					
		}	
		function xiugai(id){
			$.ajax({
				url:"../FoodServlet",
				type:"post",
				data:{"id":id},
				dataType:"text",
				success:function(data){
					if(data==1){
						Toast('修改成功',2000);
					}else{
						Toast('修改失败',2000);
					}
					getMsgAll(1, 10);
				}				
			});
		layui.use('layer',function(){
			var layer=layui.layer;
			layer.open({
				  type: 2,
					  title: '修改食品信息',
				  area: ['400px', '250px'],
					  fixed: false, //不固定
				  maxmin: true,
				  content: '../FoodServlet?id='+id
					});
			});					
		}
		function del(id){
			$.ajax({
				url:"../FoodDeleteServlet",
				type:"post",
				data:{"id":id},
				dataType:"text",
				success:function(data){
					if(data==1){
						Toast('下架成功',2000);
					}else{
						Toast('下架失败',2000);
					}
					getMsgAll(1, 10);
				}				
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