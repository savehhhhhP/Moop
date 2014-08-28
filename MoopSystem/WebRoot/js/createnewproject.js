﻿$('project.type').ready(
		function() {
			// 取得学校放入下拉框
			$.ajax({
				type : "post",
				url : "getprojecttype.action",
				dataType : "json",
				success : function(data) {
					for ( var i = 0; i < data.length; i++) {
						var sname = data[i];
						document.getElementById('project.type').options
								.add(new Option(sname, sname));

					}
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert(" ddd" + "ajax取学校信息出错-" + errorThrown + "fff");
				}
			});
		});

$('project.enterprise').ready(
		function() {
			// 取得学校放入下拉框
			$.ajax({
				type : "post",
				url : "getprojectenterprise.action",
				dataType : "json",
				success : function(data) {
					for ( var i = 0; i < data.length; i++) {
						var sname = data[i];
						document.getElementById('project.enterprise').options
								.add(new Option(sname, sname));
					}
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert(" ddd" + "ajax取学校信息出错-" + errorThrown + "fffff");
				}
			});
		});

$('project.state').ready(
		function() {
			// 取得学校放入下拉框
			$.ajax({
				type : "post",
				url : "getprojectstate.action",
				dataType : "json",
				success : function(data) {
					for ( var i = 0; i < data.length; i++) {
						var sname = data[i];
						document.getElementById('project.state').options
								.add(new Option(sname, sname));
					}
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert(" ddd" + "ajax取学校信息出错-" + errorThrown + "ddddd");
				}
			});
		});

function selectfile() {
	document.getElementById(1).click();

}

function readFile(fileBrowser) {
	alert(navigator.userAgent.toLowerCase());
	alert(navigator.userAgent.indexOf("msie"));
	if (navigator.userAgent.indexOf("MSIE") == -1) // 浏览器为IE
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
	document.getElementById("project.picturePath").value = path;

}
