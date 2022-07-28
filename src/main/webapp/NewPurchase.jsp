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
<form	class="form-group section__form" action="addPurchase"	method="post">
    <h3 class="form-title">入库管理&nbsp;/&nbsp;添加库存</h3>
    <input class="form-control" name="pd" type="hidden" value="1">
    <input id="msgInput" type="hidden" value="${errorMsg}">
    商品名称：<input class="form-control"	type="text" name="gname"><br/>
    商品数量：<input class="form-control"	type="text" name="count"><br/>
    供应商名称：<input class="form-control"	type="text" name="gysname"><br/>
    <input class="btn btn-success form-control"	type="submit" value="提交">
    <a href="/queryAllPurchase"><input	 class=" btn btn-info form-control" type="button" value="返回"></a>
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