<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<title>这是一个用户姓名的输入页面</title>
</head>
<body><br>

<s:form action="userAction2" method="post">
<s:textfield name="username" label="用户名" required="true"></s:textfield>
<s:textfield name="info" label="信息" required="true"></s:textfield>
<s:submit key="submit" value="注册"></s:submit>
</s:form>

<br></body>
</html>