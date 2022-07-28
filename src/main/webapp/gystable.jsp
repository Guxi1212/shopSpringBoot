<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<script	src="js/jquery-1.8.3.min.js"></script>
<link rel="stylesheet" href="./css/bootstrap/css/bootstrap.css">
<script src="./css/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="./css/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="./css/index.css">

</head>
<style>
	ul.pagination {
		display: inline-block;
		padding: 0;
		margin: 0;
	}

	ul.pagination li {display: inline;}

	ul.pagination li a {
		color: black;
		float: left;
		padding: 8px 16px;
		text-decoration: none;
		transition: background-color .3s;
		border: 1px solid #ddd;
	}

	ul.pagination li a.active {
		background-color: #4CAF50;
		color: white;
		border: 1px solid #4CAF50;
	}

	ul.pagination li a:hover:not(.active) {background-color: #ddd;}

	div.center {text-align: center;}
</style>


<body>
<div class="section__table table-responsive">

<table id="gystable" class="table table-striped">
<tr>
<th>ID</th>
<th>供应商编号</th>
<th>供应商名称</th>
<th>操作</th>
</tr>
	<c:forEach var="gystable" items="${GysList}">
	<tr>
		<td>${gystable.id}</td>
		<td>${gystable.gid}</td>
		<td>${gystable.gname}</td>
		<td>
			<a  href="toDeleteGys?id=${gystable.id}"><button class="btn btn-danger"><i class="fa fa-close"></i>&nbsp;删除</button></a>
			<a  href="toUpdateGys?id=${gystable.id}"><button  class="btn btn-info"><i class="fa-pencil-square-o fa"></i>&nbsp;修改</button></a>
	 </td>
	</tr>
	</c:forEach>
</table>
<div class="table__btn-group">
	<a href="NewGys.jsp">
		<button class="btn btn-outline-success"><i class="fa fa-plus"></i>&nbsp;新增供应商</button>
	</a>
	<a href="blank.jsp">
		<button  class="btn btn-outline-info" ><i class="fa fa-arrow-left"></i>&nbsp;返回主页面</button>
	</a>
</div>
</div>
<div class="center">
	<ul id="numValue" class="pagination page">
		<li><a href="#">当前第【${pageInfo.pageNum}】页，总共【${pageInfo.pages}】页，总共【${pageInfo.total}】条</a></li>
		<li><a href="/queryAllGys?pageNo=1">首页</a></li>
		<li><a href="/queryAllGys?pageNo=${pageInfo.prePage}">上一页</a></li>
		<li><a href="/queryAllGys?pageNo=${pageInfo.nextPage}">下一页</a></li>
		<li><a href="/queryAllGys?pageNo=${pageInfo.pages}">尾页</a></li>
	</ul>
</div>

</body>
</html>