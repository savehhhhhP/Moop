<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="struts" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'login.jsp' starting page</title>

</head>

<body>
	<center>
		<form action="login.action" method="post">
			<h2>登录</h2>
			<p>
				邮箱:<input type="text" name="userEmail" /><br>
				密码:<input type="text"
					name="userPsw" /> <br>
					<input class="btn btn-primary" type="submit" value="login" />
		</form>
	</center>
</body>
</html>
