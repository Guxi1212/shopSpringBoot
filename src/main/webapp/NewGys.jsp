<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>便利店销售管理系统登录页面</title>
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
<form	class="form-group section__form" action="addGys"	method="post">
	<h3 class="form-title">供应商管理&nbsp;/&nbsp;添加供应商</h3>
	<input id="msgInput" type="hidden" value="${errorMsg}">
<input class="form-control" name="pd" type="hidden" value="1">
供应商名称：<input class="form-control" name="gname"	type="text"/><br/>
供应商编号：<input class="form-control" name="gid"	type="text"/><br/>
<input class="btn btn-success form-control"	type="submit" value="提交">
	<a href="/queryAllGys"><input	 class=" btn btn-info form-control" type="button" value="返回"></a>
</div>
</form>
</body>
</html>
<script>
	var errorMsg = $("#msgInput").val();
	console.log(errorMsg);
	if (errorMsg.length > 0) {
		alert(errorMsg);
	}
</script>