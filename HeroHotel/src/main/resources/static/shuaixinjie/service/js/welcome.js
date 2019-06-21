$(function() {
	$.ajax({
		url:"../ServiceWelcomeServlet",
		type:"get",
		success:function(data){
			$("#myframe").attr("src","welcome.jsp");
		}
	})
})
