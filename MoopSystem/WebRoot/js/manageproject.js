$('type').ready(
		function() {
			//取得学校放入下拉框
			$.ajax({
				type : "post",
				url : "getprojecttype.action",
				dataType : "json",
				success : function(data) {
					for ( var i = 0; i < data.length; i++) {
						var sname = data[i];
						var object = document.getElementById('type');
						if(!(object.options[0].value == sname))
						{
							document.getElementById('type').options.add(new Option(sname, sname));
						}
					}
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert(" ddd" + "ajax取学校信息出错-" + errorThrown + "fff");
				}
			});
		});

$('enterpriseName').ready(
		function() {
			//取得学校放入下拉框
			$.ajax({
				type : "post",
				url : "getprojectenterprise.action",
				dataType : "json",
				success : function(data) {
					for ( var i = 0; i < data.length; i++) {
						var sname = data[i];
						var object = document.getElementById('enterpriseName');
						if(!(object.options[0].value == sname))
						{
							document.getElementById('enterpriseName').options
							.add(new Option(sname, sname));
						}
					}
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert(" ddd" + "ajax取学校信息出错-" + errorThrown + "fffff");
				}
			});
		});

$('state').ready(
		function() {
			//取得学校放入下拉框
			$.ajax({
				type : "post",
				url : "getprojectstate.action",
				dataType : "json",
				success : function(data) {
					for ( var i = 0; i < data.length; i++) {
						var sname = data[i];
						var object = document.getElementById('state');
						if(!(object.options[0].value == sname))
						{
							document.getElementById('state').options
								.add(new Option(sname, sname));
						}
					}
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert(" ddd" + "ajax取学校信息出错-" + errorThrown + "ddddd");
				}
			});
		});

$('isPublic').ready(
		function(){
			var object = document.getElementById('isPublic');
			if(object.options[0].value == "否"){
				object.options.add(new Option("是","是"));
			}
			else{
				object.options.add(new Option("否","否"));
			}
		});

//
//function saveReport(){
//	$("#updateproject-form").ajaxSubmit(function(message) {   
//        // 对于表单提交成功后处理，message为提交页面saveReport.htm的返回内容   
//		alert("success");
//     });   
//	//$('#form1').ajaxSubmit(options); 
//  return false; // 必须返回false，否则表单会自己再做一次提交操作，并且页面跳转   
//}
