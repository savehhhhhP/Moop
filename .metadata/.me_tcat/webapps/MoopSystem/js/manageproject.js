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

function submitForm() {
	$('#uploadFileForm1').submit();
}

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

					$("#file_upload_return")
							.load(
									function() {
										var data = $(
												window.frames['file_upload_return'].document.body)
												.find("font").html();
										// 若iframe携带返回数据，则显示在file_upload_return_img中
										if (data != null) {
											$("#file_upload_return_img")
													.append(
															data
																	.replace(
																			/&lt;/g,
																			'<')
																	.replace(
																			/&gt;/g,
																			'>'));
											$("#file").val('');
										}
										getFileList();
										$('#closeModal').click();
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

function deleteFile(type, id) {

	if (confirm('确定删除?')) {
		$.ajax({
			type : "post",
			url : "delete.action",
			async : true,
			data : {
				"type" : type,
				"id" : id
			},
			success : function(data) {
				getFileList();
				alert("sucess");
				return false;
			}
		});
	} else {
		return false;
	}

	// $('a').confirm({
	// 'title' : '删除该记录?',
	// 'message' : '您确认删除该记录? <br />删除后无法恢复记录.',
	// 'buttons' : {
	// 'Yes' : {
	// 'class' : 'blue',
	//
	// },
	// 'No' : {
	// 'class' : 'gray',
	// 'action': function(){} // Nothing to do in this case. You can
	// // as well omit the action property.
	// }
	// }
	// });

}

function getFileList() {
	var projectId = $('#id').val();
	$.ajax({
				type : "post",
				url : "getfilelist.action",
				data : {
					"projectId" : projectId
				},
				dataType : "json",
				async : true,
				success : function(data) {
					var myDoc = data[0]['document']['owner'];
					var otherDoc = data[0]['document']['other'];
					var myPatent = data[0]['patent']['owner'];
					var otherPatent = data[0]['patent']['other'];
					var myThesis = data[0]['thesis']['owner'];
					var otherThesis = data[0]['thesis']['other'];

					var pantentContent = "";
					var thesisContent = "";
					var docContent = "";
					var patentObj = "patent";
					var thesisObj = "thesis";
					var docObj = "document";
					if (myPatent != null) {
						for ( var i = 0; i < myPatent.length; i++) {
							pantentContent += "<li class='media'><div class='media-body'><div class='mbs'>"
									+ "<a href='download.action?"
									+ "filePath="
									+ myPatent[i]['patentPath']
									+ "&fileName="
									+ myPatent[i]['name']
									+ "'>"
									+ myPatent[i]['name']
									+ "</a></div><div class='text-sm'>"
									+ "<span class='text-muted'>applyDate:"
									+ myPatent[i]['applyDate']
									+ "</span><span class='bullet'>•</span> <span class='text-muted'>patent</span>"
									+ "<a onclick='deleteFile(&quot;"
									+ patentObj
									+ "&quot;,"
									+ myPatent[i]['id']
									+ ")' href='javascript:void(0)'>&nbsp;delete</a></div></div></li>";
						}
					}

					if (otherPatent != null) {
						for ( var i = 0; i < otherPatent.length; i++) {
							pantentContent += "<li class='media'><div class='media-body'><div class='mbs'>"
									+ "<a href='download.action?"
									+ "filePath="
									+ otherPatent[i]['patentPath']
									+ "&fileName="
									+ otherPatent[i]['name']
									+ "'>"
									+ otherPatent[i]['name']
									+ "</a></div><div class='text-sm'>"
									+ "<span class='text-muted'>applyDate:"
									+ otherPatent[i]['applyDate']
									+ "</span><span class='bullet'>•</span> <span class='text-muted'>patent</span>"
									+ "</div></div></li>";
						}
					}

					if (myThesis != null) {
						for ( var i = 0; i < myThesis.length; i++) {
							thesisContent += "<li class='media'><div class='media-body'><div class='mbs'>"
									+ "<a href='download.action?"
									+ "filePath="
									+ myThesis[i]['thesisPath']
									+ "&fileName="
									+ myThesis[i]['name']
									+ "'>"
									+ myThesis[i]['name']
									+ "</a></div><div class='text-sm'>"
									+ "<span class='text-muted'>applyDate:"
									+ myThesis[i]['publishDate']
									+ "</span><span class='bullet'>•</span> <span class='text-muted'>thesis</span>"
									+ "<a onclick='deleteFile(&quot;"
									+ thesisObj
									+ "&quot;,"
									+ myThesis[i]['id']
									+ ")' href='javascript:void(0)'>&nbsp;delete</a></div></div></li>";
						}
					}

					if (otherThesis != null) {
						for ( var i = 0; i < otherThesis.length; i++) {
							thesisContent += "<li class='media'><div class='media-body'><div class='mbs'>"
									+ "<a href='download.action?"
									+ "filePath="
									+ myThesis[i]['thesisPath']
									+ "&fileName="
									+ myThesis[i]['name']
									+ "'>"
									+ myThesis[i]['name']
									+ "</a></div><div class='text-sm'>"
									+ "<span class='text-muted'>applyDate:"
									+ myThesis[i]['publishDate']
									+ "</span><span class='bullet'>•</span> <span class='text-muted'>thesis</span>"
									+ "</div></div></li>";
						}
					}
					if (myDoc != null) {
						for ( var i = 0; i < myDoc.length; i++) {
							docContent += "<li class='media'><div class='media-body'><div class='mbs'>"
									+ "<a href='download.action?"
									+ "filePath="
									+ myDoc[i]['documentPath']
									+ "&fileName="
									+ myDoc[i]['name']
									+ "'>"
									+ myDoc[i]['name']
									+ "</a></div><div class='text-sm'>"
									+ "<span class='bullet'>•</span> <span class='text-muted'>document</span>"
									+ "<a  onclick='deleteFile(&quot;"
									+ docObj
									+ "&quot;,"
									+ myDoc[i]['id']
									+ ")' href='javascript:void(0)'>&nbsp;delete</a></div></div></li>";
						}
					}

					if (otherDoc != null) {
						for ( var i = 0; i < otherDoc.length; i++) {
							docContent += "<li class='media'><div class='media-body'><div class='mbs'>"
									+ "<a href='download.action?"
									+ "filePath="
									+ otherDoc[i]['documentPath']
									+ "&fileName="
									+ otherDoc[i]['name']
									+ "'>"
									+ otherDoc[i]['name']
									+ "</a></div><div class='text-sm'>"
									+ "<span class='bullet'>•</span> <span class='text-muted'>document</span>"
									+ "</div></div></li>";
						}
					}
					$('#patentList')[0].innerHTML = pantentContent;
					$('#thesisList')[0].innerHTML = thesisContent;
					$('#documentList')[0].innerHTML = docContent;
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert(" ddd" + "ajax取学校信息出错-" + errorThrown + "fff");
				}
			});
	return;
}

function selectfile() {
	document.getElementById("file").click();

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
	document.getElementById("filePath").value = file.path;
}
// IE获取文件全路径方法
function readFileIE(fileBrowser) {
	var path = fileBrowser.value;
	document.getElementById("filePath").value = path;

}
