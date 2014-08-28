<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

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
<link href="css/myproject.css" rel="stylesheet">
<script src="js/jquery/jquery1.83.js"></script>
<script src="css/bootstrap-3.1.1-dist/js/bootstrap.js"></script>

<script src="js/myproject.js"></script>
<script src="js/button.js"></script>


</head>

<body>
<%@ include file="header.jsp"%>
	<div style="background:#EAEAEA;min-height:730px;">
		<div id="content-container" class="container"
			style="padding-top:20px;">
			<div class="row row-3-9">
				<div class="col-md-3">

					<div class="panel panel-default">
						<div class="panel-body">
							<div class="list-group-block">
								<div class="list-group-panel">
									<div class="list-group-heading">我的项目</div>
									<ul class="list-group">
										<a class="list-group-item active" href="myProject.jsp">我管理的项目</a>
										<a class="list-group-item" href="getjoinproject.action">我参与的项目</a>
										<a class="list-group-item" href="">我的问答</a>
										<a class="list-group-item" href="">我的话题</a>
										<a class="list-group-item" href="">我的笔记</a>
									</ul>
								</div>
							</div>
						</div>
					</div>

				</div>
				<div class="col-md-9">
					<div class="panel panel-default panel-col">
						<div class="panel-heading"><div style="display:inline-block;margin-right:10px;">我管理的项目</div>
							<div style="display:inline-block;margin-right:10px;">
							<button class="btn btn-primary" onclick="createproject()">创建新项目</button></div> </div>
					
						
						<div class="panel-body">
							<ul  id="myprojectlist" class='course-grids'></ul>
							

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
