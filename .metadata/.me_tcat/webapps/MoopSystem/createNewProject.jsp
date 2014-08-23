<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

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

<title>MOOP</title>
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
<link href="css/bootstrap-3.1.1-dist/css/bootstrap.css" rel="stylesheet">
<link href="My97DatePicker/skin/WdatePicker.css" rel="stylesheet">
<script src="js/jquery/jquery1.83.js"></script>
<script src="css/bootstrap-3.1.1-dist/js/bootstrap-transition.js"></script>
<script src="css/bootstrap-3.1.1-dist/js/bootstrap-dropdown.js"></script>


<script src="My97DatePicker/WdatePicker.js"></script>
<script src="js/button.js"></script>
<script src="js/createnewproject.js"></script>


<title>MOOP</title>

</head>

<body>
	<%@ include file="header.jsp"%>
	<!-- center body -->
	<center style="background:#EAEAEA">
		<div class="container" style="height:auto;">
			<div class="row row-6"
				style="margin-top:80px;min-height:600px;width:700px;">


				<div class="panel panel-default panel-page"
					style="margin-left:0;text-align:left;">
					<div class="panel-heading" style="margin:30px;background:white;">
						<h2>创建新项目</h2>
						<form id="createproject-form" method="post" enctype="multipart/form-data"
							action="createproject.action">
							<div class="form-group">
								<label class="control-label required" for="_projectName">项目名称</label>
								<div>
									<input type="text" id="project.name" required="required"
										name="_projectName" class="form-control" data-explain="填写项目名称">
									<p class="help-block">填写项目名称</p>
								</div>
							</div>
							<div class="form-group">
								<label class="control-label required" for="_projectNumber">编号</label>
								<div class="controls">
									<input type="text" id="project.number" required="required"
										name="_projectNumber" class="form-control" data-explain="项目编号">
									<p class="help-block">10位英文、数字</p>
								</div>
							</div>


							<div class="form-group">
								<label class="control-label required" for="_projectType">类型</label>
								<div class="controls">
									<select id="project.type" name="_projectType"
										class="form-control" data-explain="项目类型">
										<option value="_projectType" selected>----请选择----</option>
									</select>
									<p class="help-block">选择项目类型</p>
								</div>
							</div>

							<div class="form-group">
								<label class="control-label required" for="_projectEnterprise">依托单位</label>
								<div class="controls">
									<select id="project.enterprise" name="_projectEnterprise"
										class="form-control" data-explain="依托单位名称">
										<option value="_projectEnterprise" selected>----请选择----</option>
									</select>
									<p class="help-block">选择依托单位，若列表中没有，请直接添加</p>
								</div>
							</div>

							<div class="form-group">
								<label class="control-label required" for="_startDate">时间安排</label>
								<div class="controls">
									<input type="text" id="project.starttime" required="required"
										name="_startDate" class="form-control"
										style="width:47%;display:inline-block;"
										onclick="WdatePicker()" data-explain="开始时间"> <label>——</label>
									<input type="text" id="project.endtime" required="required"
										name="_endDate" class="form-control"
										style="width:47%;display:inline-block;"
										onclick="WdatePicker()" data-explain="结束时间">
									<p class="help-block">输入项目起始时间</p>
								</div>
							</div>


							<div class="form-group">
								<label class="control-label required" for="_projectFunds">经费</label>
								<div class="controls">
									<input type="text" id="project.funds" required="required"
										name="_projectFunds" class="form-control" data-explain="项目经费">
									<p class="help-block">输入项目经费，单位：元</p>
								</div>
							</div>


							<div class="form-group">
								<label class="control-label required" for="_isPublic">是否公开</label>
								<div class="controls">
									<select id="project.ispublic" required="required"
										name="_isPublic" class="form-control" data-explain="项目是否公开">
										<option value="是">是</option>
										<option value="否">否</option>
									</select>
									<p class="help-block">项目是否对外公开</p>
								</div>
							</div>


							<div class="form-group">
								<label class="control-label required" for="_projectState">状态</label>
								<div class="controls">
									<select id="project.state" name="_projectState"
										class="form-control" data-explain="项目状态">
										<option value="_projectState" selected>----请选择----</option>
									</select>
									<p class="help-block">选择项目状态</p>
								</div>
							</div>


							<div class="form-group">
								<label class="control-label required" for="_projectIntroduction">介绍</label>
								<div class="controls">
									<textarea id="project.introduction" required="required"
										style="text-align:left;" name="_projectIntroduction"
										class="form-control" data-explain="项目介绍">
									</textarea>
									<p class="help-block">填写项目介绍</p>
								</div>
							</div>
							<div class="form-group">
								<label class="control-label required" for="_picturePath">上传图片</label>
								<div class="controls">
									<input type="text" id="project.picturePath" required="required"
										style="text-align:left;width:90%;display:inline-block;" name="_projectPicturePath"
										class="form-control" data-explain="上传项目图片">
									</input>
									<input type="file" accept="image/*" name="file" id="1" onchange="readFile(this)" style="display: none" />
									<input type="button" class="btn btn-primary btn-sm" onclick="selectfile()" value="浏览.."></input>
									<p class="help-block">上传项目图片</p>
								</div>
							</div>
							<div class="form-group">
								<div class="controls">
									<!--  <input type="button" value="确定" name="project.save"
										id="project.save" class="btn btn-primary btn-large btn-block"
										onclick="manageproject()" />-->
									<button type="submit" value="register" name="project.save"
										id="project.save" class="btn btn-primary btn-large btn-block">确定</button>
								</div>
							</div>


						</form>

					</div>
				</div>
			</div>
		</div>
	</center>

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
