<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>便利店销售管理系统登录页面</title>
<meta name="description" content="">
<meta name="keywords" content="">
<script src="js/jquery-1.8.3.min.js"></script>
<script  src="./js/vue.js"></script>
<script  src="./js/vuerouter.js"></script>
<link rel="stylesheet" href="./css/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="./css/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="./css/login.css">
<script src="./js/login.js"></script>
</head>
<body>
  <div id="login">
    <div class="bg"></div>
    <input id="msgInput" type="hidden" value="${errorMsg}">
   <router-view></router-view>
</div>

</body>
</html>
<script>
  var errorMsg=$("#msgInput").val();
  console.log(errorMsg);
  if(errorMsg.length>0){
      alert(errorMsg);
  }
</script>