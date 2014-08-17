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
						if (!(object.options[0].value == sname)) {
							document.getElementById('type').options
									.add(new Option(sname, sname));
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
						if (!(object.options[0].value == sname)) {
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
						if (!(object.options[0].value == sname)) {
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

$('isPublic').ready(function() {
	var object = document.getElementById('isPublic');
	if (object.options[0].value == "否") {
		object.options.add(new Option("是", "是"));
	} else {
		object.options.add(new Option("否", "否"));
	}
});

//

$(document).ready(function() {
	$('#updateproject-form').bind('submit', function() {
		ajaxSubmit(this, function(data) {
			alert("success");
		});
		return false;
	});
	$('#fileType').change(function() {
//		if ($('#document').attr("selected") == true) {
//			alert("123");
//		} else {
//			alert("222");
//		}
		
		if($('#fileType option:selected').val() == "patent"){
			$('#patentTitle').css("display","block");
		}
		else{
			$('#patentTitle').css("display","none");
		}
		
		if($(this).val() == "document"){
			$('#fileType').css("width","30%");
			var s = "<input type='text' value='ddd'></input>";
			$('#type').append("<input type='text' value='ddd'/>");
		}
	});
});

//将form转为AJAX提交
function ajaxSubmit(frm, fn) {
	var dataPara = getFormJson(frm);
	$.ajax({
		url : frm.action,
		type : frm.method,
		data : dataPara,
		success : fn
	});
}

function getFormJson(frm) {
	var o = {};
	var a = $(frm).serializeArray();
	$.each(a, function() {
		if (o[this.name] !== undefined) {
			if (!o[this.name].push) {
				o[this.name] = [ o[this.name] ];
			}
			o[this.name].push(this.value || '');
		} else {
			o[this.name] = this.value || '';
		}
	});

	return o;
}

function selectfile() {
	document.getElementById(1).click();

}

function readFile(fileBrowser) {
	alert(navigator.userAgent.toLowerCase());
	alert(navigator.userAgent.indexOf("msie"));
	if (navigator.userAgent.indexOf("MSIE") == -1) // 浏览器为IE 有問題
		readFileIE(fileBrowser);
	else if (navigator.userAgent.indexOf("Firefox") > 0
			|| navigator.userAgent.indexOf("Mozilla") > 0) // 浏览器为firefox
		readFileFirefox(fileBrowser);
	else
		alert("Not IE or Firefox (userAgent=" + navigator.userAgent + ")");
}
// firefox获取文件全路径的方法
function readFileFirefox(fileBrowser) {
	try {
		netscape.security.PrivilegeManager
				.enablePrivilege("UniversalXPConnect");
	} catch (e) {
		alert('Unable to access local files due to browser security settings. To overcome this, follow these steps: (1) Enter "about:config" in the URL field; (2) Right click and select New->Boolean; (3) Enter "signed.applets.codebase_principal_support" (without the quotes) as a new preference name; (4) Click OK and try loading the file again.');
		return;
	}

	var fileName = fileBrowser.value;
	var file = Components.classes["@mozilla.org/file/local;1"]
			.createInstance(Components.interfaces.nsILocalFile);
	try {
		// Back slashes for windows
		file.initWithPath(fileName.replace(/\//g, "\\\\"));
	} catch (e) {
		if (e.result != Components.results.NS_ERROR_FILE_UNRECOGNIZED_PATH)
			throw e;
		alert("File '"
				+ fileName
				+ "' cannot be loaded: relative paths are not allowed. Please provide an absolute path to this file.");
		return;
	}

	if (file.exists() == false) {
		alert("File '" + fileName + "' not found.");
		return;
	}
	alert(file.path); // I test to get the local file's path.
	document.getElementById("project.picturePath").value = file.path;
}
// IE获取文件全路径方法
function readFileIE(fileBrowser) {
	var path = fileBrowser.value;
	document.getElementById("filePath").value = path;

}
