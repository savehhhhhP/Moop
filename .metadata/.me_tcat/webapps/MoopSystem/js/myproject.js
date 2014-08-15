//初始化我的项目页面=
$('myprojectlist')
		.ready(
				function() {
					alert("ddd");
					$.ajax({
								type : "post",
								url : "getmanageprojectlist.action",
								dataType : "json",
								success : function(data) {
									var content = "";
									if (data.length > 0) {
										for ( var i = 0; i < data.length; i++) {
											//List list = data[i];
											//alert(JSON.s)
											var object = JSON.stringify(data[i]);
											alert(object);
											content += "<li class='course-grid'>"
													+ "<div class='grid-body' style='position:relative;display: block;overflow: hidden;text-decoration: none;border-radius: 4px;color: #353535;text-align:center;padding-bottom:5px;'>"
													+ "<img src='"
													+ data[i]['picturepath']
													+ "' class='img-responsive thumb'><span class='title'>"
													+ data[i]['name']
													+ "</span><div class='learn-status'><div class='progress'>"
													+ "<div class='progress-bar progress-bar-success' style='width: 0%;'></div></div>"
													+ "<div class='action'><a class='btn btn-primary btn-sm' href='getmanageprojectinfo.action?projectId=" + data[i]['id'] + "'>管理项目"
													+ "</a></div></div> </div></li>";
										}
									} else {
										content = "暂无内容";
									}
									document.getElementById("myprojectlist").innerHTML = content;
								},
								error : function(XMLHttpRequest, textStatus,
										errorThrown) {
									alert("取数据出错！" + errorThrown);
								}
							});
				});


