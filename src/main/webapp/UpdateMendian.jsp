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

<form	class="form-group section__form" action="upDateMendian" method="post">
	<h3 class="form-title">门店管理&nbsp;/&nbsp;修改门店</h3>
<input class="form-control" name="pd" type="hidden" value="2">
门店编号：<input class="form-control" 	disabled="disabled" value="${mendian.mid}">
<input	name="mid" type="hidden"	value="${mendian.mid}"	>
门店名称：<input class="form-control" name="mname"	type="text" value="${mendian.mname}">
门店地区：<input class="form-control" name="dizhi"	type="text" value="${mendian.dizhi}">
联系方式：<input class="form-control" name="phone"	type="text" value="${mendian.phone}">
<input class="btn btn-outline-success form-control"	type="submit" value="提交"><a href="/queryAllMendians"><input class=" btn btn-info form-control" type="button" value="返回"></a>
</form>
</body>
</html>