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
<form	class="form-group section__form" action="updateUser" method="post">
    <h3 class="form-title">用户管理&nbsp;/&nbsp;修改用户</h3>
    <input class="form-control"  name="pd" type="hidden" value="2">
    ID：<input class="form-control"  	readonly="readonly" value="${userTable.id}">
    <input	name="id" type="hidden"	value="${userTable.id}"	>
    UID：<input class="form-control"  name="uid"	type="text" value="${userTable.uid}">
    姓名：<input class="form-control"  name="name"	type="text" value="${userTable.name}">
    性别：<select class="form-control" name="sex" type="text" value="${userTable.sex}">
    <option>男</option>
    <option>女</option>
</select><br/>
    联系方式：<input class="form-control"  name="phone"	type="text" value="${userTable.phone}">
    <input class="btn btn-success form-control"	type="submit" value="提交">
    <a href="/queryAllUser"><input	 class=" btn btn-info form-control" type="button" value="返回"></a>
</form>
</body>
</html>
<script language="javascript">
    function formcheck() {
        if(uid==null||uid==''){
            alert("用户ID不为空！")
        }else if(name==null||name==''){
            alert("用户姓名不为空！")
        }else if(sex==null||sex==''){
            alert("性别不为空！")
        }else if(phone==null||phone==''||phone.length!=11){
            alert("请输入11位数字的电话号码！")
        }
    }

</script>
