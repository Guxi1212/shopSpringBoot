<%@ page language="java" contentType="text/html; charset=utf-8"
		 pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>添加VIP</title>
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
		<form class="form-group section__form" action="addVip"	method="post">
			<h3 class="form-title">会员管理&nbsp;/&nbsp;添加会员</h3>
			<input type="hidden"	name="pd" value="2">
			用户ID：<input class="form-control" name="uid" 	type="text"/><br/>
			会员ID：<input class="form-control" name="hid"	 type="text"/><br/>
			入会时间：<input class="form-control" name="time"	type="text"/><br/>
			<input id="msgInput" type="hidden" value="${errorMsg}">
			类型：<select class="form-control" name="type" >
			<option>1</option>
			<option>2</option>
			<option>3</option>
			</select><br/>
				<%--	<input class="form-control" name="type"	type="text"/><br/>--%>
			<input class="btn btn-success form-control"	type="submit"	value="提交">
			<a href="queryAllVip"><input	class="btn btn-info form-control" type="button" value="返回"></a>
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