window.onload = function() {
	var nowDate = new Date();
	var str = nowDate.getFullYear() + "-" + (nowDate.getMonth() + 1) + "-"
			+ nowDate.getDate() + "       " + nowDate.getHours() + ":"
			+ nowDate.getMinutes();
	document.getElementById("flight-from").value = str;
}

function book() {
	debugger;
	var roomtype = $("#flight-class").val();
	var type = $("#flight-person").val();
	var starttime = $("#flight-depart").val();
	var endtime = $("#flight-return").val();
	var time = $("#flight-from").val();

	var dataJson = {
		"flight-class" : roomtype,
		"flight-person" : type,
		"flight-depart" : starttime,
		"flight-return" : endtime,
		"flight-from" : time
	};

	$.ajax({
		url : "bookroom",
		data : dataJson,
		datatype : "text",
		type : "post",
		success : function(data) {
			alert(data);

		}
	});
}
