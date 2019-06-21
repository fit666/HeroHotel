layui.use(['form', 'layedit', 'laydate'], function(){
	  var form = layui.form
	  ,layer = layui.layer
	  ,layedit = layui.layedit
	  ,laydate = layui.laydate;
	  
	  //创建一个编辑器
	  var editIndex = layedit.build('LAY_demo_editor');
	 
	  //自定义验证规则
	  form.verify({
	    title: function(value){
	      if(value.length < 4){
	        return '房间号 至少4位';
	      }
	    }
	    ,content: function(value){
	      layedit.sync(editIndex);
	    }
	  });
	  
	  form.on('select(test)', function(data){
		  $.ajax({
				url:"../SelectTypeServlet",
				type:"post",
				data:{"param":"city","cityid":data.value},
				dataType:"json",
				success:function(data){
					$("#droom").html("");
					var s="<select name='quiz2' id='rooms'>";
					$.each(data, function(i, item){     
						  s+="<option value='"+item.id+"'>"+item.name+"</option>";
					});
					s+="</select>";
					$("#droom").html(s);
					form.render('select');
				}
			});
		});      
	 
	});
	
	$(function () {
		$.ajax({
			url:"../SelectTypeServlet",
			type:"post",
			data:{"param":"province"},
			dataType:"json",
			success:function(data){
				$("#droom1").html("");
				var s="<select lay-filter='test' name='quiz1' id='roomb'>";
				$.each(data, function(i, item){     
					  s+="<option value='"+item.id+"'>"+item.name+"</option>";
				});
				s+="</select>";
				$("#droom1").html(s);
				form.render('select');
			}
		});
		
	});
	
	
	