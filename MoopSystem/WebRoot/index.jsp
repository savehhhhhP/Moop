<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">

<title>MOOP</title>

<script src="js/index.js" charset="utf-8"></script>
<script src="js/jquery/jquery1.83.js"></script>
<link href="css/extend/ext.css" rel="stylesheet">
<link href="css/bootstrap-3.1.1-dist/css/bootstrap.css" rel="stylesheet">
<link href="css/extend/jumbotron.css" rel="stylesheet">
</head>


<body onload="displayindexpage()">

	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.jsp">项目流程化管理系统 MOOP</a>
			</div>
			<div class="navbar-collapse collapse">
				<form class="navbar-form navbar-right" action="login.action"
					method="post">
					<div class="form-group">
						<input type="text" placeholder="Email" name="userEmail"
							class="form-control">
					</div>
					<div class="form-group">
						<input type="password" placeholder="Password" name="userPsw"
							class="form-control">
					</div>
					<button type="submit" value="login" class="btn btn-success">登陆</button>
					<a href="/MoopSystem/register.jsp" class="btn btn-success">注册</a>

				</form>


			</div>
			<!--/.navbar-collapse -->
		</div>
	</div>
	<div id="carousel-example-generic" class="carousel slide"
		data-ride="carousel" data-interval="3000" data-wrap="true">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#carousel-example-generic" data-slide-to="0"
				class="active"></li>
			<li data-target="#carousel-example-generic" data-slide-to="1"></li>
			<!-- 			<li data-target="#carousel-example-generic" data-slide-to="2"></li> -->
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner">
			<div class="item active">
				<img alt="First slide" src="image/xxx1_1.jpg" />
			</div>
			<div class="item">
				<img alt="Second slide" src="image/xxx2_2.jpg" />
			</div>
		</div>


		<!-- Controls -->
		<a class="left carousel-control" href="#carousel-example-generic"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"></span>
		</a> <a class="right carousel-control" href="#carousel-example-generic"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right"></span> </a>
	</div>


	<!-- Main jumbotron for a primary marketing message or call to action -->
	<div class="lxlpadding">
		<div class="container">

			<div
				class="panel-heading panel-heading-important lxlbordercolor lxlpading">
				<h2 class="panel-title lxlmainproject">
					最新项目 / <small class="lxlblackcolor">Latest Project</small>
				</h2>
			</div>
		</div>
	</div>

	<div class="container">
		<!-- Example row of columns -->
		<div id="latestproject" class="row">	
		</div>

	</div>


	<div class="lxlpadding">
		<div class="container">

			<div
				class="panel-heading panel-heading-important lxlbordercolor lxlpading">
				<h2 class="panel-title lxlmainproject">
					优秀项目 / <small class="lxlblackcolor">Excellent Project</small>
				</h2>
			</div>
		</div>
	</div>

	<div class="container">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-3">
				<li class="autumn-grid autumn-course-grid"><a href="/course/35"
					class="course-picture"><img src="image/abc.jpg">
				</a>
					<h3 class="course-name">
						<a href="/course/35">第六届中国云计算大会——Hadoop专场培训，5月18日-20日</a>
					</h3>
					<div class="course-about">大会介绍为了更好地交流云计算大数据的实践经验，进一步推进云计算技术创新和大数据应用，展示国内外云计算、大数据领域的最新成...</div>
					</li>
			</div>
			<div class="col-md-3">
				<li class="autumn-grid autumn-course-grid"><a href="/course/35"
					class="course-picture"><img src="image/abc.jpg">
				</a>
					<h3 class="course-name">
						<a href="/course/35">第六届中国云计算大会——Hadoop专场培训，5月18日-20日</a>
					</h3>
					<div class="course-about">大会介绍为了更好地交流云计算大数据的实践经验，进一步推进云计算技术创新和大数据应用，展示国内外云计算、大数据领域的最新成...</div>

					</li>
			</div>
			<div class="col-md-3">
				<li class="autumn-grid autumn-course-grid"><a href="/course/35"
					class="course-picture"><img src="image/abc.jpg">
				</a>
					<h3 class="course-name">
						<a href="/course/35">第六届中国云计算大会——Hadoop专场培训，5月18日-20日</a>
					</h3>
					<div class="course-about">大会介绍为了更好地交流云计算大数据的实践经验，进一步推进云计算技术创新和大数据应用，展示国内外云计算、大数据领域的最新成...</div>

					</li>
			</div>
			
			<div class="col-md-3">
				<li class="autumn-grid autumn-course-grid"><a href="/course/35"
					class="course-picture"><img src="image/abc.jpg">
				</a>
					<h3 class="course-name">
						<a href="/course/35">第六届中国云计算大会——Hadoop专场培训，5月18日-20日</a>
					</h3>
					<div class="course-about">大会介绍为了更好地交流云计算大数据的实践经验，进一步推进云计算技术创新和大数据应用，展示国内外云计算、大数据领域的最新成...</div>

					</li>
			</div>

			

		</div>



		<hr>
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
	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
	<script src="css/bootstrap-3.1.1-dist/js/bootstrap.min.js"></script>
</body>
</html>
