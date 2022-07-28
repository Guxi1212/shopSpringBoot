<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>供应商修改</title>
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
    <form name="form" class="form-group section__form" action="/UpdateGys" method="post">
    <input class="form-control" name="pd" type="hidden" value="2">
    ID:<input class="form-control"	disabled="disabled" 	value="${gys.id}">
    <input	name="id" type="hidden"	value="${gys.id}"	>
    供应商编号：<input class="form-control"	type="text" name="gid"	value="${gys.gid}">
    供应商名称：<input class="form-control"	type="text" name="gname"	value="${gys.gname}">
    <input class="btn btn-success form-control"	type="submit" value="提交" onclick="check();">
    <a href="/queryAllGys">
    <input	 class=" btn btn-info form-control" type="button" value="返回" ></a>
    </form>
</body>
</html>

