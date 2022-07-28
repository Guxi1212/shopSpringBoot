<%--
  Created by IntelliJ IDEA.
  User: 刘佳莉
  Date: 2022/6/16
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>用户修改</title>
    <meta name="description" content="">
    <meta name="keywords" content="">
    <script src="./js/jQuery.js"></script>
    <script src="./js/index.js"></script>
    <script src="./js/popper.js"></script>
    <link rel="stylesheet" href="./css/bootstrap/css/bootstrap.css">
    <script src="./css/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="./css/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="./css/index.css">
</head>
<body>
<form	class="form-group section__form" action="UpdateUserdata" method="post">
    <h3 class="form-title">修改管理员信息</h3>
    <input class="form-control"  name="pd" type="hidden" value="3">
    ID：<input class="form-control"  	readonly="readonly" value="${userdata.id}">
    <input	name="id" type="hidden"	value="${userdata.id}"	>
    管理员账号：<input class="form-control"  name="username"	type="text" value="${userdata.username}">
    密码：<input class="form-control"  name="password"	type="text" value="${userdata.password}">
    <input class="btn btn-success form-control"	type="submit" value="提交">
    <a href="/queryAllUserdata"><input	 class=" btn btn-info form-control" type="button" value="返回"></a>
</form>
</body>
</html>