$('type').ready(
		function() {
			//ȡ��ѧУ����������
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
					alert(" ddd" + "ajaxȡѧУ��Ϣ����-" + errorThrown + "fff");
				}
			});
		});

$('enterpriseName').ready(
		function() {
			//ȡ��ѧУ����������
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
					alert(" ddd" + "ajaxȡѧУ��Ϣ����-" + errorThrown + "fffff");
				}
			});
		});

$('state').ready(
		function() {
			//ȡ��ѧУ����������
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
					alert(" ddd" + "ajaxȡѧУ��Ϣ����-" + errorThrown + "ddddd");
				}
			});
		});

$('isPublic').ready(
		function(){
			var object = document.getElementById('isPublic');
			if(object.options[0].value == "��"){
				object.options.add(new Option("��","��"));
			}
			else{
				object.options.add(new Option("��","��"));
			}
		});

//
//function saveReport(){
//	$("#updateproject-form").ajaxSubmit(function(message) {   
//        // ���ڱ����ύ�ɹ�������messageΪ�ύҳ��saveReport.htm�ķ�������   
//		alert("success");
//     });   
//	//$('#form1').ajaxSubmit(options); 
//  return false; // ���뷵��false������������Լ�����һ���ύ����������ҳ����ת   
//}