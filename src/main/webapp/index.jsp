<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%--<%@ page  import="DBO.*" %>--%>
<%@page  import="java.util.*" %>
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
<style>
	html,body{
	  /*overflow: hidden;*/
	}
</style>
</head>
<body>

    <audio class="audio-player" autoplay="autoplay" loop="loop">
      <source src="./src/music/1.mp3" type="audio/mpeg"></source>
    </audio>
    
<!--     <div class="audio-control" autoplay="autoplay">
      <div class="audio-control__text">Uru - フリージア</div>
      <div class="audio-control__step-backward"><i class="fa fa-step-backward"></i></div>
      <div class="audio-control__playOrPause"><i class="fa fa-play"></i></div>
      <div class="audio-control__step-forward"><i class="fa fa-step-forward"></i></div>
    </div> -->

  <nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 nav-top">
      <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="blank.jsp" target="content-iframe">管理系统</a>
      
<%--        <div class="navbar-nav">--%>
<%--          <div class="audio-control">--%>
<%--            <div class="audio-control__text--wrap">--%>
<%--  		        <div class="audio-control__text">Uru - フリージア</div>--%>
<%--            </div>--%>
<%--  		      <div class="audio-control__step-backward"><i class="fa fa-step-backward"></i></div>--%>
<%--  		      <div class="audio-control__playOrPause"><i class="fa fa-play"></i></div>--%>
<%--  		      <div class="audio-control__step-forward"><i class="fa fa-step-forward"></i></div>--%>
<%--      		</div>--%>
<%--        </div>--%>

        <span id="login-time" class="navbar-text"></span>
        <span class="navbar-text">用户名:${sessionScope.user.username}</span>
        <span class="navbar-text"></span>
        <span class="navbar-text"></span>
        <span class="nav-item">
          <a class="navbar-link logout" href="loginOut">退出登录</a>
        </span>
  </nav>


  <div class="container-fluid">
    <div class="row">

      <nav class="col-md-2 d-none d-md-block sidebar bg-light">
        <ul class="nav flex-column">
          <div class="sidebar-sticky">
          <li class="nav-item dropdown">
            <span class="nav-link dropdown-toggle" data-toggle="dropdown"><i class="fa-university fa"></i>&nbsp;门店管理</span>
            <div class="dropdown-menu">
             <a target="content-iframe" href="/queryAllMendians" class="nav-link"><i class="fa-list fa"></i>&nbsp;门店列表</a>
              <a target="content-iframe" href="NewMendian.jsp" class="nav-link"><i class="fa-plus fa"></i>&nbsp;添加门店</a>
            </div>
          </li>
          
          
        <li class="nav-item">
           <span class="nav-link dropdown-toggle" data-toggle="dropdown"><i class="fa-user fa"></i>&nbsp;用户管理</span>
                       <div class="dropdown-menu">
            <a target="content-iframe" href="/queryAllUser" class="nav-link"><i class="fa-list fa"></i>&nbsp;用户列表</a>
            <a target="content-iframe" href="NewUser.jsp" class="nav-link"><i class="fa-plus fa"></i>&nbsp;添加用户</a>
        </div>
          </li>

          <li class="nav-item">
           <span class="nav-link dropdown-toggle" data-toggle="dropdown"><i class="fa-user-o fa"></i>&nbsp;会员管理</span>
            <div class="dropdown-menu">         	
            <a target="content-iframe" href="/queryAllVip" class="nav-link"><i class="fa-list fa"></i>&nbsp;会员列表</a>
            <a target="content-iframe" href="NewVip.jsp" class="nav-link"><i class="fa-plus fa"></i>&nbsp;添加会员</a>   
            </div>        
          </li>

          <li class="nav-item dropdown">
            <span  class="nav-link dropdown-toggle" data-toggle="dropdown"><i class="fa fa-cubes"></i>&nbsp;商品管理</span>
            <div class="dropdown-menu">
              <a target="content-iframe" href="/queryAllSp" class="nav-link "><i class="fa-list fa"></i>&nbsp;商品列表</a>
              <a  target="content-iframe" href="NewSp.jsp" class="nav-link "><i class="fa-plus fa"></i>&nbsp;添加商品</a>
            </div>
          </li>


              <li class="nav-item dropdown">
                  <span class="nav-link dropdown-toggle" data-toggle="dropdown"><i class="fa-truck fa"></i>&nbsp;供应商管理</span>
                  <div class="dropdown-menu">
                      <a target="content-iframe" href="/queryAllGys" class="nav-link "><i class="fa-list fa"></i>&nbsp;供应商列表</a>
                      <a target="content-iframe" href="NewGys.jsp" class="nav-link "><i class="fa-plus fa"></i>&nbsp;添加供应商</a>
                  </div>
              </li>

              <li class="nav-item dropdown">
                  <span class="nav-link dropdown-toggle" data-toggle="dropdown"><i class="fa-book fa"></i>&nbsp;入库管理</span>
                  <div class="dropdown-menu">
                      <a target="content-iframe" href="/queryAllPurchase" class="nav-link "><i class="fa-list fa"></i>&nbsp;库存列表</a>
                      <a target="content-iframe" href="NewPurchase.jsp" class="nav-link "><i class="fa-plus fa"></i>&nbsp;添加库存</a>
                  </div>
          </li>

              <li class="nav-item dropdown">
                  <span class="nav-link dropdown-toggle" data-toggle="dropdown"><i class="fa-flag-o fa"></i>&nbsp;采购管理</span>
                  <div class="dropdown-menu">
                      <a target="content-iframe" href="/queryGetin" class="nav-link "><i class="fa-list fa"></i>&nbsp;采购清单</a>
                  </div>
          </li>

              <li class="nav-item dropdown">
                  <span class="nav-link dropdown-toggle" data-toggle="dropdown"><i class="fa-truck fa"></i>&nbsp;系统管理</span>
                  <div class="dropdown-menu">
                      <a target="content-iframe" href="/queryAllUserdata" class="nav-link "><i class="fa-list fa"></i>&nbsp;管理员列表</a>
                      <%--                      <a target="content-iframe" href="NewGys.jsp" class="nav-link "><i class="fa-plus fa"></i>&nbsp;添加管理员</a>--%>
                  </div>
              </li>
<!-- 
          <li class="nav-item">
                <span  class="nav-link dropdown-toggle" data-toggle="dropdown">
                  <i class="fa-area-chart fa"></i>销售报表
                </span>

                <div class="dropdown-menu">
                  <a target="content-iframe" href="#" class="nav-link dropdown-item"><i class="fa-line-chart fa"></i>&nbsp;销售统计报表</a>
                  <a target="content-iframe" href="#" class="nav-link dropdown-item"><i class="fa-line-chart fa"></i>&nbsp;月底销售报表</a>
                  <a target="content-iframe" href="#" class="nav-link dropdown-item"><i class="fa-pie-chart fa"></i>&nbsp;热销商品排行</a>
                  <a target="content-iframe" href="#" class="nav-link dropdown-item"><i class="fa-bar-chart fa"></i>&nbsp;门店销售排行</a>
                </div>
          </li>
           -->
        </div>
      </ul>
    </nav>

    <div id="content" class="content">
      <iframe id="content-iframe" src="blank.jsp" width="100%" height="764" scrolling="no" name="content-iframe" frameborder="0" seamless="seamless"></iframe>
    </div>
  </div>
</div>
</body>
</html>