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
							<h1 class="title"></h1>
								<input type="text" value="${infoId}">
							    <s:property  value="projectInfo.id"/>
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
									<div class="tab-pane active" id="home">
										<!-- class="course-item-list-wrap" -->
										<ul style="list-style:none;margin-top:7px;"
											id="course-item-list">
											<li><label for="project.name"
												style="font-weight:normal;">项目名称</label> <input
												class="form-control" id="projectInfo.id" name="projectInfo.id"
												style="margin-top:6px;width:90%;display:inline-block;" 
												></input>
											</li>

											<li><label for="project.number"
												style="font-weight:normal;">项目编号</label> <input
												class="form-control"
												style="margin-top:6px;width:90%;display:inline-block;"
												id="project.number"></input></li>
											<li><label for="project.type"
												style="font-weight:normal;">项目类型</label> <select
												id="project.type" name="project.type"
												style="margin-top:6px;width:90%;display:inline-block;"
												class="form-control">
											</select></li>
											<li><label for="project.enterprise"
												style="font-weight:normal;">依托单位</label> <select
												id="project.enterprise" name="project.enterprise"
												style="margin-top:6px;width:90%;display:inline-block;"
												class="form-control">
											</select></li>
											<li><label for="project.time"
												style="font-weight:normal;">时间安排</label> <input type="text"
												id="project.starttime" name="project.starttime"
												class="form-control"
												style="margin-top:6px;width:42.3%;display:inline-block;"
												onclick="WdatePicker()" data-explain="开始时间"> <label>——</label>
												<input type="text" id="project.endtime"
												name="project.endtime" class="form-control"
												style="margin-top:6px;width:42.3%;display:inline-block;"
												onclick="WdatePicker()" data-explain="结束时间">
											</li>

											<li><label for="project.funds"
												style="font-weight:normal;">项目经费</label> <input
												class="form-control"
												style="margin-top:6px;width:90%;display:inline-block;" id=""project.funds""></input>
											</li>
											<li><label style="font-weight:normal;"
												for="project.ispublic">是否公开</label> <select
												id="project.ispublic"
												style="margin-top:6px;width:90%;display:inline-block;"
												name="project.ispublic" class="form-control">
													<option value="yes">是</option>
													<option value="no">否</option>
											</select>
											</li>

											<li><label style="font-weight:normal;"
												for="project.state">项目状态</label> <select id="project.state"
												style="margin-top:6px;width:90%;display:inline-block;"
												name="project.state" class="form-control">
											</select>
											</li>

											<li><label style="font-weight:normal;margin-top:3px;"
												for="project.introduction">项目介绍</label> <textarea
													id="project.introduction" required="required"
													name="project.introduction" class="form-control"
													style="margin-top:6px;width:90%;display:inline-block;">
									</textarea></li>
											<li>
												<div class="form-group">
													<div class="controls">
														<center>
															<button type="submit" style="width:30%;"
																name="project.save" id="project.save"
																class="btn btn-primary btn-large btn-block">保存修改</button>
														</center>
													</div>
												</div>
											</li>
										</ul>
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
													<tr>
														<td>1</td>
														<td>Mark</td>
														<td>715620615@qq.com</td>
														<td>ncepu</td>
														<td>15811436207</td>
														<td><a>删除</a></td>
													</tr>
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
												<div class="modal-content">
													<div class="modal-header">
														<button type="button" class="close" data-dismiss="modal"
															aria-hidden="true">&times;</button>
														<h4 class="modal-title" id="myModalLabel">上传文件</h4>
													</div>

													<div class="modal-body">
														<ul style="list-style:none;margin-top:7px;"
															id="course-item-list">
															<li><label for="upload.name"
																style="font-weight:normal;">文件名称</label> <input
																class="form-control" id="upload.name"
																required="required"
																style="margin-top:6px;width:80%;display:inline-block;"></input>
															</li>

															<li><label for="upload.type"
																style="font-weight:normal;">文件类型</label> <input
																class="form-control" id=""
																upload.type" required="required"
																style="margin-top:6px;width:80%;display:inline-block;"></input>
															</li>


															<li><label for="upload.keywords"
																style="font-weight:normal;">关键词语</label> <input
																class="form-control" id=""
																upload.keywords" required="required"
																style="margin-top:6px;width:80%;display:inline-block;"></input>
															</li>


															<li><label for="upload.description"
																style="font-weight:normal;">文件描述</label> <textarea
																	class="form-control" id="upload.description"
																	required="required"
																	style="margin-top:6px;width:80%;min-height:100px;display:inline-block;"></textarea>
															</li>

															<li><label for="upload.selectfile"
																style="font-weight:normal;">选择文件</label> <input
																class="form-control" id="upload.selectfile"
																required="required"
																style="margin-top:6px;width:50%;display:inline-block;"></input>
																<button type="button" id="btn.selectfile"
																	class="btn btn-primary">选择文件</button></li>
														</ul>

													</div>

													<div class="modal-footer">
														<button type="button" class="btn btn-default"
															data-dismiss="modal">Close</button>
														<button type="button" class="btn btn-primary">确定</button>
													</div>
												</div>
												<!-- /.modal-content -->
											</div>
											<!-- /.modal-dialog -->
										</div>
										<!-- /.modal -->





										<ul class="media-list" style="margin-top:10px;">
											<li class="media">
												<div class="media-body">
													<div class="mbs">
														<a href="" target="_blank">resource 1.pdf</a>
													</div>
													<div class="text-sm">
														<a class="link-muted" href="">project 1</a> <span
															class="bullet">•</span> <span class="text-muted">上传于01-14</span>
														<span class="bullet">•</span> <span class="text-muted">论文</span>
													</div>

												</div></li>
										</ul>
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