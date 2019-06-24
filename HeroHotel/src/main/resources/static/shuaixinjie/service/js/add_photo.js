$(function() {
			$("#fid").change(
							function() {
								var fr = new FileReader();//创建一个文件读取流对象
								//通过文件地址读取文件到流当中，jquery不能操作files数组，只能通过dom对象操作
								fr.readAsDataURL(document.getElementById("fid").files[0]);
								//当fr流将图片完全加载完时，就要把图片显示在label上
								fr.onload = function(e) {
									//e.target.result加载图片完成后获取图片的url地址
									$("label").css("background-image",
											"url(" + e.target.result + ")")
											.html("");
								}
							});

		});