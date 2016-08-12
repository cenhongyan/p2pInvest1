<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>财神到</title>
    <link href="css/head.css" rel="stylesheet">
    <link href="css/product.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav id="nav" class="container">
    <div class="row">
        <div class="col-md-6"></div>

        <div class="col-md-6 right">
            <ul>
                <li>
                    <a v-show="login">请登录</a>
                </li>
                <li><a>注册</a>
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
   <div class="container-fluid">
    <div class="row con">
        <div class="col-md-3"></div>

        <div class="col-md-5 content" >
            <div class="row">

                <div class="people" >
                    <img src="images/borrower .png"> <span>
                  ${productinfo.name}</span>
                </div>

            </div>

            <div class="row borrwerer">
                <div class="col-md-5 borrwer"style="border-right: 1px dashed lightslategrey">
                    <label><span >债权总额:</span>
                        <p class="money">${productinfo.total}<span class="yuan">元</span></p></label>
                </div>
                <div class="col-md-4 borrwer" style="border-right: 1px dashed lightslategrey">
                    <label>
                        <span>借款年利率:</span>
                        <p class="money percent">${productinfo.annualRate}<span class="yuan">%</span></p>
                    </label>
                </div>
                <div class="col-md-3 borrwer" >
                    <label>
                        <span>还款期限:</span>
                        <p class="money">${productinfo.timeLimit}<span class="yuan"></span></p>
                    </label>
                </div>
            </div>
            <div class="row borrwerer">
                <div class="col-md-6 word">
                    <label>保障范围 : <img src="images/borrower.png"><span>适用本金保障计划</span></label>
                </div>
                <div class="col-md-6 word1">
                    <label>还款方式 :<span>${productinfo.receivedWay}</span></label>
                </div>
            </div>

        </div>
        <div class="col-md-3 invest" >
            <div class="row" style="background: white" >

                <div class="people inmoney">
                    <img src="images/borrower .png"> <span>
                  投资金额</span>
                </div>

            </div>
            <div class="row" style="background: white" >

                <div class="input">
                    <label>
                        <input type="text" placeholder="最低50" ><span>元</span>
                    </label>
                </div>

            </div>

            <div class="row" style="background: white" >

                <div class="submit">
                    <label>
                        <input type="submit"value="立即购买" >
                    </label>
                </div>

            </div>
        </div>

    </div>
</div>
<script src="js/vue.js"></script>
<script src="js/public.js" type="text/javascript"></script>


</body>
</html>