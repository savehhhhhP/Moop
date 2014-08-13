<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script>
	$(function() {
		$('.dropdown-toggle').dropdown();
	});
</script>

</head>

<body>

	<div class="navbar navbar-inverse site-navbar"
		style="margin-bottom:0px;">
		<div class="container">
			<div class="container-gap">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-collapse">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand-logo" href="/"><img src=""> </a>
				</div>
				<div class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li><a href="home.jsp">首页</a>
						</li>
						<li><a href="myProject.jsp">我的项目</a></li>
						<li><a href="">公开课</a></li>
						<li><a href="" target="_blank">论坛</a>
						</li>
						<li><a href="" target="_blank">关于我们</a>
						</li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href=""><span class="glyphicon glyphicon-search"></span>
								搜索</a>
						</li>
						<li><a href="/message/"
							class="badge-container message-badge-container"> <span
								class="glyphicon glyphicon-envelope hidden-lt-ie8"></span> <span
								class="visible-lt-ie8">私信</span> </a></li>
						<li class="dropdown hidden-lt-ie8"><a id="user" href="#"
							class="dropdown-toggle" role="button" data-toggle="dropdown"><s:property value="#session.userInfo" />
								<b class="caret"></b> </a>
							<ul class="dropdown-menu" role="menu" aria-labelledby="user">
								<li role="presentation"><a role="menuitem" tabindex="-1"
									href=""><i class="glyphicon glyphicon-home"></i> 我的主页</a>
								</li>
								<li role="presentation"><a role="menuitem" tabindex="-1"
									href=""><i class="glyphicon glyphicon-cog"></i> 帐号设置</a>
								</li>

								<li role="presentation"><a role="menuitem" tabindex="-1"
									href=""><i class="glyphicon glyphicon-off"></i> 退出</a>
								</li>
							</ul></li>
					</ul>
				</div>
				<!--/.navbar-collapse -->
			</div>
		</div>
	</div>
</body>
</html>
