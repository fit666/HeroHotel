function add() {
	var title = $("#title").val();
	if(title==null||title=="") {
		alert("房间号不能为空!");
		return;
	}
	var quiz1 = $("#roomb").val();
	var quiz2 = $("#rooms").val();
	var price_min = $("#price_min").val();
	var dtext = $("#dtext").val();
	var datajson = {"title":title,"quiz1":quiz1,"quiz2":quiz2,"price_min":price_min,"dtext":dtext};
	$.ajax({
		url:"../AddRoomServlet",
		type:"post",
		data:datajson,
		dataType:"text",
		success:function(data){
			if(data==1){
				alert("添加成功!");
			}else{
				alert("添加失败!");
			}
		}
		
	});
	
}

