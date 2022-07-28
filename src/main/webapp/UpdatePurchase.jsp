<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>修改库存</title>
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
<form	class="form-group section__form" action="UpdatePurchase" method="post">
    <input class="form-control" name="pd" type="hidden" value="2">
    ID:<input class="form-control"	disabled="disabled" 	value="${purchase.id}">
    <input	name="id" type="hidden"	value="${purchase.id}"	>
    商品名称：<input class="form-control"	type="text" name="gname"	value="${purchase.gname}">
    商品数量：<input class="form-control"	type="text" name="count"	value="${purchase.count}">
    供应商名称：<input class="form-control"	type="text" name="gysname"	value="${purchase.gysname}">
    <input class="btn btn-success form-control"	type="submit" value="提交">
    <a href="/queryAllGys"><input	 class=" btn btn-info form-control" type="button" value="返回"></a>
</form>
</body>
</html>