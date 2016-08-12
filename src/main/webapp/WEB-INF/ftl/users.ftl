<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>user</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/head.css" rel="stylesheet">
    <link href="css/user.css" rel="stylesheet">
</head>
<body>
<nav id="nav" class="container">
    <div class="row">
        <div class="col-md-6">

        </div>

        <div class="col-md-6 right">
            <ul>
                <li>
                    <a v-show="login">请登录</a>
                </li>
                <li>  <a>注册</a>
                </li>
                <li class="img">
                    <img src="images/invest.png"> <a>市场有风险，投资需谨慎</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<header class=" head-nav container">
    <div class="row">


        <div id="header" class="col-md-4" >
            <img src="images/money.png"><span>p2p投资</span>
            <small>p2pInvest.com</small>
        </div>
        <div   class="col-md-8 head-f">
            <ul>

                <li>
                    <a href="index.html">首页</a>
                </li>
                <li>
                    <a>我要投资</a>
                </li>
                <li>
                    <a href="borrower.html">我要借款</a>
                </li>
                <li>
                    <a>新手导航</a>
                </li>
                <li>
                    <a v-on:click="myinfo">我的账户</a>
                </li>
            </ul>
        </div>
    </div>
</header>
<div class="container-fluid" style="border:1px solid #e3e3e3;margin-top: 10px">
</div>
<div class="container">
    <div class="row user">
        <div class="col-md-10" style="border-right: 1px solid #e0e0e0;border-bottom:1px solid  #e0e0e0;border-left: 1px solid #e0e0e0">
           <div class="row">
               <div class="col-md-4" style="border-right: 1px solid #e0e0e0">
                   <div class="row">
                    <p class="img"><img src="images/user.png"></p>
                    <p class="name">${user.userName}</p>
                   </div>
                   <div class="row center" style="margin-top: 50px" v-on:click="click">
                       <a>账户中心 <span> > </span></a>
                   </div>
                   <div class="row center" style="margin-top: 50px" v-on:click="click1">
                       <a>账户信息 <span> > </span></a>
                   </div>
               </div>
               <div class="col-md-8" v-bind:style="{display:data1}">
                   <div class="row">
                      <div class="col-md-5 money">
                          <label>账户余额 :<span>${user.totalMoney}</span>
                           <p>可用余额 : <span>${user.income}</span></p>
                          </label>
                      </div>
                       <div class="col-md-4 btn">
                       <a>充值</a><a class="ti">提现</a>
                       </div>
                   </div>
               </div>

               <div class="col-md-8" v-bind:style="{display:data2}">
                   <div class="row">
                       <div class="col-md-1">

                       </div>
                      <div class="col-md-5 username">
                          <span>用户名：</span>${user.userName}
                      </div>
                       <div class="col-md-4 username">
                           <span> 电话：</span>${user.telePhone}
                       </div>
                   </div>
                   <div class="row">
                       <div class="col-md-1">

                       </div>
                       <div class="col-md-5 username">
                           <span> email：</span>${user.email}
                       </div>
                       <div class="col-md-4 username">
                           <span> 总金额：</span>${user.totalMoney}
                       </div>
                   </div>
                   <div class="row">
                       <div class="col-md-1">

                       </div>
                       <div class="col-md-5 username">
                           <span> 信息：</span>${user.userInfo}
                       </div>
                       <div class="col-md-4 username">
                           <span>收入：</span>${user.income}
                       </div>
                   </div>

                   <div class="row">
                       <div class="col-md-4">

                       </div>
                       <div class="col-md-4 username" >
                          <a >修改</a>
                       </div>
                       <div class="col-md-3 username">

                       </div>
                   </div>

               </div>
           </div>
        </div>
    </div>
</div>

<script src="js/jquery-3.0.0.min.js" type="text/javascript"></script>
<script src="js/vue.js"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
  <script>

      var app = new Vue({
          el:"body",
          data:{
              data1:"block",
              data2:'none',
              login:true

          },
          methods:{
              click:function () {
                  this.data1 = "block";
                  this.data2 = "none";
              },
              click1:function () {
                  this.data1 = "none";
                  this.data2 = "block";
              }
          }

      });
      
      
      $(function($){
    	$.ajax({
    		url:"judge",
    		type:'POST',
    		success:function(data){
    			if(data.code == 0)
				{
				   app.login = false;
				}
	
					
				
    		}
    	});
    });
  </script>
</body>
</html>