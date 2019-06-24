function submitf() {
			var aname = $("#aname").val();
			var apassword = $("#password").val();
			 if(aname==null||aname==""){
				alert("账号不能为空");
				return;
			}
			if(apassword==null||apassword==""){
				alert("密码不能为空");
				return;
			}
			debugger; 
			$.ajax({
				url:"../AddAdminServlet",
				type:"post",
				data:{"aname":aname,"apassword":apassword},
				dataType:"text",
				success:function(data){
					if(data==1){
						Toast("添加成功",1000);
						$("#aname").val("");
						$("#password").val("");
						$("#aname").focus();  
					}else{
						Toast("添加失败",1000);
					}
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
	