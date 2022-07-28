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
<form action="UpdateVip"	class="form-group section__form" method="post">
	<h3 class="form-title">会员管理&nbsp;/&nbsp;修改会员</h3>
	<input class="form-control" type="hidden" name="pd" value="1">
	ID：<input class="form-control" 	disabled="disabled" value="${vipTable.id}">
	<input	name="id" type="hidden"	value="${vipTable.id}"	>
	用户ID：<input class="form-control" name="uid"	type="text" value="${vipTable.uid}">
	会员ID：<input class="form-control" name="hid"	type="text" value="${vipTable.hid}">
	入会时间：<input class="form-control" name="time"	type="text" value="${vipTable.time}">
	类型：<select class="form-control" name="type" type="text" value="${vipTable.type}">
	<option>1</option>
	<option>2</option>
	<option>3</option>
</select><br/>
	<%--	<input class="form-control" name="type"	type="text" value="${vipTable.type}">--%>
	<input class="btn btn-success form-control"	type="submit" value="提交">
	<a href="/queryAllVip"><input class=" btn btn-info form-control" type="button" value="返回"></a>
</form>
</body>
</html>
<script language="javascript">
	function formcheck () {
		if(uid==null||uid==''){
			alert("用户ID不为空！")
		}else if(hid==null||hid==''){
			alert("会员ID不为空！")
		}else if(time==null||time==''||time>2022){
			alert("请输入小于2022年的入会时间！")
		}else if(type==null||type==''){
			alert("请选择会员类型！")
		}

	}
</script>