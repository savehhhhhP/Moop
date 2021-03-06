<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="">
<link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">
<link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">
<link href="css/bootstrap-3.1.1-dist/css/bootstrap.css" rel="stylesheet">
<link href="css/manageproject.css" rel="stylesheet">
<link href="My97DatePicker/skin/WdatePicker.css" rel="stylesheet">

<script src="js/jquery/jquery1.83.js"></script>
<script src="js/jquery/jquery.form.js"></script>
<script src="js/jquery/jquery.confirm-1.3.js"></script>
<script src="js/manageproject.js"></script>
<script src="css/bootstrap-3.1.1-dist/js/bootstrap.js"></script>
<script src="My97DatePicker/WdatePicker.js"></script>
<script>
	$('#myTab a').click(function(e) {
		e.preventDefault();
		$(this).tab('show');
	});
</script>

</head>

<body>
	<%@ include file="header.jsp"%>

	<div style="background:#EAEAEA;min-height:730px;">
		<div id="content-container" class="container">

			<div class="container-gap">

				<div class="row row-12">
					<div class="col-md-12">
						<div>
							<h1 class="title">
								<s:property value='projectInfo.name' />
							</h1>
						</div>
					</div>
				</div>

				<div class="row row-8-4">
					<div class="col-md-8">
						<div class="panel panel-default" id="dashboard-main">
							<div class="panel-body">
								<ul class="nav nav-tabs course-dashboard-tabs clearfix"
									id="course-tabs">
									<li class="active"><a class="js-nav" data-toggle="tab"
										href="#home">项目信息</a>
									</li>
									<li class=""><a class="js-nav" data-toggle="tab"
										href="#manageperson">成员管理</a>
									</li>
									<li class=""><a class="js-nav" data-toggle="tab"
										href="#myresource">资料区</a>
									</li>
									<li class=""><a class="js-nav" data-toggle="tab"
										href="#discussion">讨论区</a>
									</li>
								</ul>



								<!--  	<div class="tab-content">
									<div class="tab-pane active" id="home">...</div>
									<div class="tab-pane" id="profile">...</div>
									<div class="tab-pane" id="messages">...</div>
									<div class="tab-pane" id="settings">...</div>
								</div> -->


								<div class="tab-content">
									<!-- 项目基本信息 -->

									<div class="tab-pane active" style="margin-top:10px;" id="home">
										<form id="updateprojectForm" method="post"
											enctype="multipart/form-data" action="updateproject.action">
											<input type="hidden" name="id" id="id"
												value="<s:property value='projectInfo.id'/>"></input>
											<!-- class="course-item-list-wrap" -->
											<ul style="list-style:none;margin-top:7px;"
												id="course-item-list">
												<li><label for="name" style="font-weight:normal;">项目名称</label>
													<input class="form-control" id="name" name="name"
													style="margin-top:6px;width:90%;display:inline-block;"
													value=" <s:property value='projectInfo.name'/>"></input></li>

												<li><label for="number" style="font-weight:normal;">项目编号</label>
													<input class="form-control"
													style="margin-top:6px;width:90%;display:inline-block;"
													id="number" name="number"
													value="<s:property value='projectInfo.number'/>"></input>
												</li>
												<li><label for="type" style="font-weight:normal;">项目类型</label>
													<select id="type" name="type"
													style="margin-top:6px;width:90%;display:inline-block;"
													class="form-control">
														<option>
															<s:property value='projectInfo.projectType.name' />
														</option>
												</select></li>
												<li><label for="enterpriseName"
													style="font-weight:normal;">依托单位</label> <select
													id="enterpriseName" name="enterpriseName"
													style="margin-top:6px;width:90%;display:inline-block;"
													class="form-control">
														<option>
															<s:property value='projectInfo.enterprise.enterpriseName' />
														</option>
												</select></li>
												<li><label for="startDate" style="font-weight:normal;">时间安排</label>
													<input type="text" id="startDate" name="startDate"
													class="form-control"
													style="margin-top:6px;width:42.3%;display:inline-block;"
													onclick="WdatePicker()" data-explain="开始时间"
													value="<s:property value='projectInfo.startDate'/>">
													<label>——</label> <input type="text" id="endDate"
													name="endDate" class="form-control"
													style="margin-top:6px;width:42.3%;display:inline-block;"
													onclick="WdatePicker()" data-explain="结束时间"
													value="<s:property value='projectInfo.endDate'/>">
												</li>

												<li><label for="funds" style="font-weight:normal;">项目经费</label>
													<input class="form-control"
													style="margin-top:6px;width:90%;display:inline-block;"
													id="funds" name="funds"
													value="<s:property value='projectInfo.funds'/>"></input>
												</li>
												<li><label style="font-weight:normal;" for="isPublic">是否公开</label>
													<select id="isPublic" name="isPublic"
													style="margin-top:6px;width:90%;display:inline-block;"
													class="form-control">
														<option>
															<s:property value='projectInfo.isPublic' />
														</option>
												</select>
												</li>

												<li><label style="font-weight:normal;" for="state">项目状态</label>
													<select id="state"
													style="margin-top:6px;width:90%;display:inline-block;"
													name="state" class="form-control">
														<option>
															<s:property value='projectInfo.projectState.name' />
														</option>
												</select>
												</li>

												<li><label style="font-weight:normal;margin-top:3px;"
													for="introduction">项目介绍</label> <textarea id="introduction"
														required="required" name="introduction"
														class="form-control"
														style="text-align:left;margin-top:6px;width:90%;display:inline-block; ">
													<s:property value='projectInfo.introduction' />
									</textarea></li>
												<li>
													<div class="form-group">
														<div class="controls">
															<center>
																<button type="submit" style="width:30%;" name="save"
																	id="save" class="btn btn-primary btn-large btn-block">保存修改</button>

															</center>
														</div>
													</div>
												</li>
											</ul>
										</form>
									</div>
									<!-- 成员管理 -->
									<div class="tab-pane" style="margin-top:10px;"
										id="manageperson">
										<label for="project.addperson" style="font-weight:normal;">增加成员</label>
										<input class="form-control"
											style="margin-top:6px;width:50%;display:inline-block;"
											id="project.addperson"></input>
										<button class="btn btn-primary">发送邮件</button>
										<div class="table-responsive" style="margin-top:10px;">
											<table class="table table-hover">
												<thead>
													<tr>
														<th>_</th>
														<th>姓名</th>
														<th>邮箱</th>
														<th>单位</th>
														<th>手机</th>
														<th>操作</th>
													</tr>
												</thead>
												<tbody>
													<s:iterator value="reProjectUser" id="reProjectUser"
														status="st">
														<tr>
															<td><s:property value="#st.count" />
															</td>
															<td><s:if
																	test="#reProjectUser.userName==null||''.equals(#reProjectUser.userName)">------</s:if>
																<s:else>
																	<s:property value='#reProjectUser.userName' />
																</s:else>
															</td>
															<td><s:if
																	test="#reProjectUser.userInfo.email==null||''.equals(#reProjectUser.userInfo.email)">------</s:if>
																<s:else>
																	<s:property value='#reProjectUser.userInfo.email' />
																</s:else>
															</td>
															<td><s:if
																	test="#reProjectUser.enterpriseName==null||''.equals(#reProjectUser.enterpriseName)">------</s:if>
																<s:else>
																	<s:property value='#reProjectUser.enterpriseName' />
																</s:else>
															</td>
															<td><s:if
																	test="#reProjectUser.userInfo.phone==null||
															''.equals(#reProjectUser.userInfo.phone)">------</s:if>
																<s:else>
																	<s:property value='#reProjectUser.userInfo.phone' />
																</s:else>
															</td>
															<td><a>删除</a></td>
														</tr>
													</s:iterator>
												</tbody>
											</table>
										</div>
									</div>

									<!-- 资源标签 -->
									<div class="tab-pane" style="margin-top:10px;" id="myresource">
										<button class="btn btn-primary" data-toggle="modal"
											data-target="#uploadFile">上传文件</button>

										<!-- 上传文件模态框 -->
										<div class="modal fade" id="uploadFile" tabindex="-1"
											role="dialog" aria-labelledby="myModalLabel"
											aria-hidden="true">
											<div class="modal-dialog">

												<form id="uploadFileForm1" method="post"
													target="file_upload_return" enctype="multipart/form-data"
													action="uploadfile.action">
													<div class="modal-content">
														<div class="modal-header">
															<button type="button" class="close" data-dismiss="modal"
																aria-hidden="true">&times;</button>
															<h4 class="modal-title" id="myModalLabel">上传文件</h4>
														</div>

														<div class="modal-body">
															<ul style="list-style:none;margin-top:7px;"
																id="course-item-list">
																<li><input type="hidden" name="projectId"
																	value="<s:property value='projectInfo.id'/>"></input></li>

																<li><label for="fileType"
																	style="font-weight:normal;">文件类型</label> <select
																	class="form-control" id="fileType" name="fileType"
																	required="required"
																	style="margin-top:6px;width:80%;display:inline-block;">
																		<option value="-1">---请选择---</option>
																		<option value="document">文档资料</option>
																		<option value="patent">专利</option>
																		<option value="thesis">论文</option>
																</select>
																</li>


																<li id="patentNumLi" style="display: none;"><label
																	for="patentNum" style="font-weight:normal;">专利号码</label>
																	<input id="patentNum" class="form-control"
																	name="patentNum" required="required"
																	style="margin-top:6px;width:80%;display:inline-block;" />
																</li>

																<li id="patentDateLi" style="display: none;"><label
																	for="patentDate" style="font-weight:normal;">申请日期</label>
																	<input id="patentDate" class="form-control"
																	required="required" name="patentDate"
																	style="margin-top:6px;width:80%;display:inline-block;"
																	onclick="WdatePicker()" />
																</li>

																<li id="patentOrgLi" style="display: none;"><label
																	for="patentOrg" style="font-weight:normal;">机构名称</label>
																	<input id="patentOrg" class="form-control"
																	name="patentOrg" required="required"
																	style="margin-top:6px;width:80%;display:inline-block;" />
																</li>



																<li id="thesisOrgLi" style="display: none;"><label
																	for="thesisOrg" style="font-weight:normal;">出版机构</label>
																	<input id="thesisOrg" class="form-control"
																	name="thesisOrg" required="required"
																	style="margin-top:6px;width:80%;display:inline-block;" />
																</li>

																<li id="thesisDateLi" style="display: none;"><label
																	for="thesisDate" style="font-weight:normal;">出版日期</label>
																	<input id="thesisDate" class="form-control"
																	name="thesisDate" required="required"
																	style="margin-top:6px;width:80%;display:inline-block;"
																	onclick="WdatePicker()" />
																</li>

																<li id="thesisPaginationLi" style="display: none;"><label
																	for="thesisPagination" style="font-weight:normal;">论文页码</label>
																	<input id="thesisPagination" class="form-control"
																	name="thesisPagination" required="required"
																	style="margin-top:6px;width:80%;display:inline-block;" />
																</li>


																<li><label for="fileKeywords"
																	style="font-weight:normal;">关键词语</label> <input
																	class="form-control" id="fileKeyWords"
																	name="fileKeyWords" required="required"
																	style="margin-top:6px;width:80%;display:inline-block;"></input>
																</li>


																<li><label for="fileDescription"
																	style="font-weight:normal;">文件描述</label> <textarea
																		class="form-control" id="fileDescription"
																		name="fileDescription" required="required"
																		style="margin-top:6px;width:80%;min-height:100px;display:inline-block;"></textarea>
																</li>



																<li><label for="fileAuthor"
																	style="font-weight:normal;">文件作者</label> <input
																	class="form-control" id="fileAuthor" name="fileAuthor"
																	required="required"
																	style="margin-top:6px;width:80%;display:inline-block;"></input>
																</li>

																<li><label for="1" style="font-weight:normal;">选择文件</label>
																	<input type="text" class="form-control" id="filePath"
																	name="filePath" required="required"
																	style="margin-top:6px;width:64%;display:inline-block;" />
																	<input type="file" name="file" id="file"
																	onchange="readFile(this)" style="display:none;" />
																	<button type="button" id="btnSelect" name="btnSelect"
																		onclick="selectfile()" class="btn btn-primary">选择文件</button>
																</li>
															</ul>
														</div>

														<div class="modal-footer">
															<button type="button" class="btn btn-default" id="closeModal"
																data-dismiss="modal">Close</button>
															<input type="button" id="formSummitButton"
																class="btn btn-primary" value="确定"
																onclick="submitForm()"></input>
														</div>
													</div>
												</form>

												<iframe id="file_upload_return" name="file_upload_return"></iframe>
												<!-- 提交表单处理iframe框架 -->
												<div id="file_upload_return_img"></div>
												<!-- /.modal-content -->
											</div>
											<!-- /.modal-dialog -->
										</div>
										<!-- /.modal -->
										<div id="fileList">
										<ul id="patentList" class="media-list"
											style="margin-top:10px;">
											<s:iterator value="patentList" id="patentList">
												<li class="media"><div class="media-body">
														<div class="mbs">
															<a
																href='<s:url action="download">
														<s:param name="filePath"><s:property value="#patentList.patentPath"></s:property>
														</s:param><s:param name="fileName"><s:property value="#patentList.name"></s:property></s:param></s:url>'>
																<s:property value="#patentList.name" />
															</a>
														</div>
														<div class="text-sm">
															<span class="text-muted">applyDate:<s:property
																	value="#patentList.applyDate" />
															</span> <span class="bullet">•</span> <span class="text-muted">Patent</span>
															<s:if test="userEmail.equals(#patentList.userInfo.email)">
																<span class="bullet">•</span>
																<a onclick='deleteFile("patent",<s:property value="#patentList.id"/>)' href="javascript:void(0)">delete</a>
															</s:if>
														</div>
													</div></li>
											</s:iterator>

										</ul>
										<ul id="thesisList" class="media-list"
											style="margin-top:10px;">

											<s:iterator value="thesisList" id="thesisList">
												<li class="media"><div class="media-body">
														<div class="mbs">
															<a
																href='<s:url action="download">
														<s:param name="filePath"><s:property value="#thesisList.thesisPath"></s:property>
														</s:param><s:param name="fileName"><s:property value="#thesisList.topic"></s:property></s:param></s:url>'>
																<s:property value="#thesisList.topic" />
															</a>
														</div>
														<div class="text-sm">
															<span class="text-muted">publishDate:<s:property
																	value="#thesisList.publishDate" />
															</span> <span class="bullet">•</span> <span class="text-muted">Thesis</span>
															<s:if test="userEmail.equals(#thesisList.userInfo.email)">
																<span class="bullet">•</span>
																<a onclick='deleteFile("thesis",<s:property value="#thesisList.id"/>)' href="javascript:void(0)">delete</a>
															</s:if>
														</div>
													</div></li>
											</s:iterator>

										</ul>
										<ul id="documentList" class="media-list"
											style="margin-top:10px;">
											<s:iterator value="documentList" id="documentList">
												<li class="media"><div class="media-body">
														<div class="mbs">
															<a
																href='<s:url action="download">
														<s:param name="filePath"><s:property value="#documentList.documentPath"></s:property>
														</s:param><s:param name="fileName"><s:property value="#documentList.name"></s:property></s:param></s:url>'>
																<s:property value="#documentList.name" />
															</a>
														</div>
														<div class="text-sm">
															<span class="bullet">•</span> <span class="text-muted">Document</span>
															<s:if
																test="userEmail.equals(#documentList.userInfo.email)">
																<span class="bullet">•</span>
																<a onclick='deleteFile("document",<s:property value="#documentList.id"/>)' href="javascript:void(0)">delete</a>
															</s:if>
														</div>
													</div></li>
											</s:iterator>
										</ul>
										</div>
									</div>

								</div>
							</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">项目进度</h3>
							</div>
							<div class="panel-body">
								<div class="progress">
									<div class="progress-bar" style="width: 0%;"></div>
								</div>
							</div>
						</div>





						<div class="panel panel-default">
							<div class="panel-heading">
								<div class="pull-right"></div>
								<h3 class="panel-title">
									项目公告
									<button class="btn btn-primary" data-toggle="modal"
										data-target="#newUpdate">发布公告</button>
								</h3>
								<!-- model -->
								<div class="modal fade" id="newUpdate" tabindex="-1"
									role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
									<div class="modal-dialog">
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal"
													aria-hidden="true">&times;</button>
												<h4 class="modal-title" id="myModalLabel">发布公告</h4>
											</div>

											<div class="modal-body">
												<ul style="list-style:none;margin-top:7px;"
													id="course-item-list">
													<li><label for="update.name"
														style="font-weight:normal;">标题</label> <input
														class="form-control" id="update.name" required="required"
														style="margin-top:6px;width:80%;display:inline-block;"></input>
													</li>
													<li><label for="update.content"
														style="font-weight:normal;">内容</label> <textarea
															class="form-control" id="update.name" required="required"
															style="margin-top:6px;width:80%;min-height:100px;display:inline-block;"></textarea>
													</li>
												</ul>

											</div>

											<div class="modal-footer">
												<button type="button" class="btn btn-default"
													data-dismiss="modal">Close</button>
												<button type="button" class="btn btn-primary">发布</button>
											</div>
										</div>
										<!-- /.modal-content -->
									</div>
									<!-- /.modal-dialog -->
								</div>
								<!-- /.modal -->
							</div>

							<div class="panel pa
							nel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a data-toggle="collapse" data-toggle="collapse"
											data-parent="#accordion" href="#collapseOne">Update 1 </a>
									</h4>
								</div>
								<div id="collapseOne" class="panel-collapse collapse in">
									<div class="panel-body">Anim pariatur cliche
										reprehenderit, enim eiusmod high life accusamus terry
										richardson ad squid. 3 wolf moon officia aute, non cupidatat
										skateboard dolor brunch.</div>
								</div>
							</div>

						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">最新问答</h3>
							</div>

						</div>
					</div>
				</div>

			</div>

		</div>
	</div>



	<footer>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div>
					<center>©MR.L</center>
					<br>
					<center>出品时间：2014年5月 联系我们：1354487211</center>
				</div>
			</div>
		</div>
	</div>
	</footer>
</body>
</html>
