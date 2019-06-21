//JavaScript代码区域
		layui.use('element', function(){
  			var element = layui.element;
		});
		function checkframe(number){
			switch(number){
				case 0:
					$("#myframe").attr("src","kefang.jsp");
					break;
				case 1:
					$("#myframe").attr("src","huiyishi.jsp");
					break;
				case 2:
					$("#myframe").attr("src","canting.jsp");
					break;
				case 3:
					$("#myframe").attr("src","food.jsp");
					break;
				case 4:
					$("#myframe").attr("src","room_order.jsp");
					break;
				case 5:
					$("#myframe").attr("src","food_order.jsp");
					break;
				case 6:
					$("#myframe").attr("src","userlist.jsp");
					break;
				case 7:
					$("#myframe").attr("src","addadmin.jsp");
					break;
				case 8:
					$("#myframe").attr("src","introduce.jsp");
					break;
				case 9:
					$("#myframe").attr("src","evaluate.jsp");
					break;
				case 10:
					$("#myframe").attr("src","show_lunbo.jsp");
					break;
				case 11:
					$("#myframe").attr("src","add_photo.jsp");
					break;
				case 100:
					$("#myframe").attr("src","addroom.jsp");
					break;	
			}
		}