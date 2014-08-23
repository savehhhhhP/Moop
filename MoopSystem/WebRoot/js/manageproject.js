$('type').ready(
		function() {
			// 取得学校放入下拉框
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
			// 取得学校放入下拉框
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
			// 取得学校放入下拉框
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

$(document)
		.ready(
				function() {
					// var options={
					// beforeSubmit: showRequest,
					// url:"uploadfile.action",
					// type:"post",
					// };
					//					
					// $('#uploadFileForm1').ajaxForm(options);

					// $('#uploadFileForm1').bind('submit', function() {
					// alert("ddd");
					// ajaxSubmit(this, function(data) {
					// alert("succcess");
					// });
					// return false;
					// });

					$('#updateprojectForm').bind('submit', function() {
						ajaxSubmit(this, function(data) {
							alert("success");
						});
						return false;
					});
					//
					$('#formSummitButton').click(
							function() {
								$('#uploadFileForm1').attr("action",
										"uploadfile.action").submit();
								// $('#uploadFileForm1').attr("action","uploadfile.action");
								// $('#uploadFileForm1').attr("method","post");
								// ajaxSubmit($('#uploadFileForm1'),
								// function(data) {
								// alert("succcess");
								// });
								return false;
							});

					$('#fileType')
							.change(
									function() {
										if ($('#fileType option:selected')
												.val() == "patent") {
											$('#patentNumLi').css("display",
													"block");
											$('#patentDateLi').css("display",
													"block");
											$('#patentOrgLi').css("display",
													"block");

											$('#thesisOrgLi').css("display",
													"none");
											$('#thesisDateLi').css("display",
													"none");
											$('#thesisPaginationLi').css(
													"display", "none");
										} else if (($(
												'#fileType option:selected')
												.val() == "document")
												|| ($(
														'#fileType option:selected')
														.val() == "-1")) {
											$('#patentNumLi').css("display",
													"none");
											$('#patentDateLi').css("display",
													"none");
											$('#patentOrgLi').css("display",
													"none");
											$('#thesisOrgLi').css("display",
													"none");
											$('#thesisDateLi').css("display",
													"none");
											$('#thesisPaginationLi').css(
													"display", "none");
										} else if ($(
												'#fileType option:selected')
												.val() == "thesis") {
											$('#thesisOrgLi').css("display",
													"block");
											$('#thesisDateLi').css("display",
													"block");
											$('#thesisPaginationLi').css(
													"display", "block");
											$('#patentNumLi').css("display",
													"none");
											$('#patentDateLi').css("display",
													"none");
											$('#patentOrgLi').css("display",
													"none");
										}
									});
				});

// 将form转为AJAX提交
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

// 初始化管理项目资源页面 使用ajax获取数据后在前台显示
//$('patentList')
//		.ready(
//				function() {
//					var projectId = $('#id').val();
//					var userEmail = $('#user')[0].innerText.trim();
//					$
//							.ajax({
//								type : "post",
//								url : "getprojectfilelist.action",
//								data : {
//									"projectId" : projectId
//								},
//								dataType : "json",
//								success : function(data) {
//									var content = "";
//									if (data.length > 0) {
//										for ( var i = 0; i < data.length; i++) {
//											var str = "<a href='' target='_blank'>&nbsp;delete</a></div></div></li>";
//											for ( var j = 0; j < data[i].length; j++) {
//												content += "<li class='media'><div class='media-body'><div class='mbs'>" 
//													    +"<a href='download.action?"
//													    + "filePath=" + data[i][j]['patentPath'] + "&fileName=" + data[i][j]['name'] +"'>"
//														+ data[i][j]['name']
//														+ "</a></div><div class='text-sm'>"
//														+ "<span class='text-muted'>applyDate:"
//														+ data[i][j]['applyDate']
//														+ "</span><span class='bullet'>•</span> <span class='text-muted'>patent</span>";
//												if (data[i][j]['userEmail']
//														.trim() == userEmail) {
//													content += str;
//												} else {
//													content += "</div></div></li>";
//												}
//											}
//										}
//									} else {
//										content = "暂无内容";
//									}
//									$('#patentList')[0].innerHTML = content;
//								},
//								error : function(XMLHttpRequest, textStatus,
//										errorThrown) {
//									alert("no data" + errorThrown);
//								}
//							});
//				});

//$('thesisList')
//		.ready(
//				function() {
//					var projectId = $('#id').val();
//					var userEmail = $('#user')[0].innerText.trim();
//					$
//							.ajax({
//								type : "post",
//								url : "getthesislist.action",
//								data : {
//									"projectId" : projectId
//								},
//								dataType : "json",
//								success : function(data) {
//									var content = "";
//									if (data.length > 0) {
//										for ( var i = 0; i < data.length; i++) {
//											var str = "<a href='' target='_blank'>&nbsp;delete</a></div></div></li>";
//											for ( var j = 0; j < data[i].length; j++) {
//												content += "<li class='media'><div class='media-body'><div class='mbs'>" 
//													    + "<a href='download.action?filePath=" + data[i][j]['thesisPath'] 
//												        + "&fileName=" + data[i][j]['name'] +"' target='_blank'>"
//														+ data[i][j]['name']
//														+ "</a></div><div class='text-sm'>"
//														+ "<span class='text-muted'>publishDate:"
//														+ data[i][j]['publishDate']
//														+ "</span><span class='bullet'>•</span> <span class='text-muted'>thesis</span>";
//												if (data[i][j]['userEmail']
//														.trim() == userEmail) {
//													content += str;
//												} else {
//													content += "</div></div></li>";
//												}
//											}
//										}
//									} else {
//										content = "暂无内容";
//									}
//									$('#thesisList')[0].innerHTML = content;
//								},
//								error : function(XMLHttpRequest, textStatus,
//										errorThrown) {
//									alert("no data" + errorThrown);
//								},
//							});
//				});
//
//$('documentList')
//		.ready(
//				function() {
//					var projectId = $('#id').val();
//					var userEmail = $('#user')[0].innerText.trim();
//					$
//							.ajax({
//								type : "post",
//								url : "getdocumentlist.action",
//								data : {
//									"projectId" : projectId
//								},
//								dataType : "json",
//								success : function(data) {
//									var content = "";
//									if (data.length > 0) {
//										for ( var i = 0; i < data.length; i++) {
//											var str = "<a href='' target='_blank'>&nbsp;delete</a></div></div></li>";
//											for ( var j = 0; j < data[i].length; j++) {
//												content += "<li class='media'><div class='media-body'><div class='mbs'>"
//													    +"<a href='download.action?filePath=" + data[i][j]['documentPath'] 
//												        + "&fileName=" + data[i][j]['name'] + "' target='_blank'>"
//														+ data[i][j]['name']
//														+ "</a></div><div class='text-sm'>"
//														+ "<span class='text-muted'>document</span>";
//												if (data[i][j]['userEmail']
//														.trim() == userEmail) {
//													content += str;
//												} else {
//													content += "</div></div></li>";
//												}
//											}
//										}
//									} else {
//										content = "暂无内容";
//									}
//									$('#documentList')[0].innerHTML = content;
//								},
//								error : function(XMLHttpRequest, textStatus,
//										errorThrown) {
//									alert("no data" + errorThrown);
//								}
//							});
//				});
