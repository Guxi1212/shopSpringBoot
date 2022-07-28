<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>新增商品</title>
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
<form	class="form-group section__form" action="/addSp"	method="post">
	<h3 class="form-title">商品管理&nbsp;/&nbsp;添加商品</h3>
<input class="form-control"  name="pd"	type="hidden"	value="1"/>
商品编号：<input class="form-control"  	name="sid"	type="text"/>
商品名称：<input class="form-control"  	name="sname"	type="text"/>
商品单价：<input class="form-control"  	name="danjia"	type="text"/>
商品条码：<input class="form-control"  	name="tiaoma"	type="text"/>
商品单位：<input class="form-control"  	name="danwei"	type="text"/>
商品折扣：<input class="form-control"  	name="zhekou"	type="text"/>
商品供应商：<select	 class="form-control custom-select" name="gid"	 >
				<c:forEach var="gys" items="${gysList}">
					<option value="${gys.gid}">${gys.gname}</option>
				</c:forEach>
</select>
会员价：<input class="form-control"	name="huiyuanjia" 	type="text"/>
	<input id="msgInput" type="hidden" value="${errorMsg}">
<input class="btn btn-success form-control" type="submit"	value="提交"/>
<input class="btn btn-danger form-control"	type="reset"value="重置">
<a href="/queryAllSp"><input class="btn btn-info form-control" type="button" value="返回"></a>
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