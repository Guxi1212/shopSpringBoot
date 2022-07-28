/**
 * 
 * @authors bobo (you@example.org)
 * @date    2018-07-16 11:12:01
 * @version $Id$
 */
  var picArgs=[
    "2.jpg","1.png","3.png"
  ];


  function turnPic(picArgs,time,switchTime){
    var i=0,len=picArgs.length;
    var bg=document.querySelector(".bg");
    bg.style.backgroundImage="url(src/img/"+picArgs[0]+")";
      setInterval(function(){
        bg.style.opacity=0.2;
        setTimeout(function(){
          i++;
          bg.style.backgroundImage="url(src/img/"+picArgs[(i%3)]+")";
          bg.style.opacity=0.8;
        },switchTime);
      },time);
  }


  document.addEventListener("DOMContentLoaded",function(){
    var register={
      template:`
       <div class="box__content">
        <div class="box__title bg-primary">用户注册</div>
          <form class="box__form" action="doSign" method="post" >
           <div class="form__username">
             用户名称：<input name="username"	class="form__input--username"  name="username" type="text" placeholder="请输入新用户名">
           </div>
           <div class="form__password">
             用户密码：<input name="password"	class="form__input--password" name="password" type="password" placeholder="请输入用户密码">
           </div>
           <router-link to="/"><input class="btn btn-secondary btn--submit" type="button" value="返回"></router-link>
          <input class="btn btn-primary btn--submit" type="submit" value="注册""></router-link>
         </form>
       </div>
       ` 
   }

   var login={
      template:`
        <div class="box__content">
        <div class="box__title bg-primary">用户登陆</div>
        <form class="box__form" action="doLogin" method="post" >
          <div class="form__username">
            用户名称：<input name="username" class="form__input--username" type="text" placeholder="请输入用户名">
          </div>
          <div class="form__password">
            用户密码：<input name="password"	class="form__input--password" type="password" placeholder="请输入用户密码">
          </div>
          <input class="btn btn-primary btn--submit" type="submit" value="登陆">
          <router-link to="/register"><button class="btn btn-secondary btn--register">
          注册</button></router-link>
        </form>
      </div>
      ` 
    }

    var router=new VueRouter ({
      routes:[
        {path:"",component:login},
        {path:"/register",component:register}
      ]
    })

    new Vue ({
      router:router,
      el:"#login",
      mounted:function(){
        turnPic(picArgs,5000,200);
      },
      components:{login,register}
    })
});