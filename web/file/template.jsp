<%--
  Created by IntelliJ IDEA.
  User: PC_01
  Date: 2019/9/26
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <title>网页模板商城</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="alternate icon" type="image/png" href="../images/favicon.png">
    <link rel='icon' href='favicon.ico' type='image/x-ico' />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <link rel="stylesheet" href="../css/default.min.css?t=227" />
    <!--[if (gte IE 9)|!(IE)]><!-->
    <script type="text/javascript" src="../other/jquery/jquery.min.js"></script>
    <!--<![endif]-->
    <!--[if lte IE 8 ]>
    <script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
    <script src="../other/amazeui/amazeui.ie8polyfill.min.js"></script>
    <![endif]-->
    <script type="text/javascript" src="../other/handlebars/handlebars.min.js"></script>
    <script type="text/javascript" src="../other/iscroll/iscroll-probe.js"></script>
    <script type="text/javascript" src="../other/amazeui/amazeui.min.js"></script>
    <script type="text/javascript" src="../other/raty/jquery.raty.js"></script>
    <script type="text/javascript" src="../js/main.min.js?t=1"></script>
</head>
<body>
﻿<header class="hd">
    <div class="hd-top am-hide-md-down">
        <div class="cg">
            <div class="hd-top-left">
                <a href="#">设为首页</a>
                <a href="#">收藏</a>
                <a href="#">RSS订阅</a>
            </div>
            <div class="hd-top-right">
                <a href="register.html">注册</a>
                <a href="login.html">登录</a>
            </div>
        </div>
    </div>
    <div class="cg">
        <div class="hd-search">

            <div class="hd-search-left">
                <a href="../index.jsp"><img class="am-hide-md-down" src="../images/logo.jpg" /></a>
                <a href="../index.jsp"><img class="am-show-md-down" src="../images/logo-sm.jpg" /></a>
            </div>

            <div class="hd-search-right am-hide-md-down">
                <div class="hd-search-right-input">
                    <input type="text" name="name" value="" placeholder="搜索模版" />
                    <button class="font am-show-md-down">&#xe634;</button>
                </div>
                <div class="hd-search-right-keyword">
                    <a href="#">包装用品</a>
                    <a href="#">母婴</a>
                    <a href="#">教育</a>
                    <a href="#">招聘</a>
                    <a href="#">绿化</a>
                </div>
            </div>


            <button class="am-show-md-down font f-btn" id="hd_botton" type="button" data-am-modal="{target: '#my-modal'}">&#xe68b;</button>
        </div>
    </div>


    <div class="hd-bottom">
        <div class="cg">
            <div class="hd-bottom-category am-hide-md-down">
                <h1><a href="javascript:;">全部模版分类</a><i data-am-collapse="{target: '.banner-collapse'}">&#xe78f;</i></h1>
            </div>
            <div class="hd-bottom-nav" id="my-modal">
                <h1 class="am-show-md-down"><input type="text" name="name" value="" placeholder="请输入关键字" /><em class="font">&#xe6e7;</em><i data-am-modal="{target: '#my-modal'}">&#xe607;</i></h1>
                <ul>
                    <li class="on"><a href="../index.jsp">首页</a></li>
                    <li><a href="template.html">模版中心</a></li>
                    <li><a href="#">定制服务</a></li>
                    <li><a href="#">成功案例</a></li>
                    <li><a href="#">关于我们</a></li>
                </ul>
            </div>
        </div>
    </div>
</header>
﻿<div class="banner-slide1">
    <div class="cg">
        <div class="banner-slide1-div  banner-collapse am-collapse">

            <ul>
                <li><a href="#">机构组织</a></li>
                <li><a href="#">农林牧渔</a></li>
                <li><a href="#">医药卫生</a></li>
                <li><a href="#">建筑建材</a></li>
                <li><a href="#">冶金矿产</a></li>
                <li><a href="#">石油化工</a></li>
                <li><a href="#">水利水电</a></li>
                <li><a href="#">交通运输</a></li>
                <li><a href="#">信息产业</a></li>
                <li><a href="#">机械机电</a></li>
                <li><a href="#">轻工食品</a></li>
                <li><a href="#">服装纺织</a></li>
                <li><a href="#">专业服务</a></li>
                <li><a href="#">安全防护</a></li>
                <li><a href="#">环保绿化</a></li>
                <li><a href="#">旅游休闲</a></li>
                <li><a href="#">办公文教</a></li>
                <li><a href="#">电子电工</a></li>
                <li><a href="#">玩具礼品</a></li>
                <li><a href="#">家居用品</a></li>
                <li><a href="#">物资专材</a></li>
                <li><a href="#">包装用品</a></li>
                <li><a href="#">办公家具</a></li>
            </ul>


        </div>
    </div>
</div>

<div class="ads">
    <div class="cg">
        <img src="../images/demo3.jpg" />
    </div>
</div>


<div class="cg am-avg-lg-12">
    <div class=" am-u-lg-12">
        <div class="comarticle-right">
            <h1>网页制作</h1>
            <ul>
                <C:forEach items="${sessionScope.WebShops}" var="shops">
                    <li>
                        <a href=""><img src="../${shops.wshImg}" width="50px"></a>
                        <a href="#">
                            <strong>${shops.wshName}</strong>
                            <span>${shops.wshDetail}</span>
                            <h1><em>更新时间：${shops.wshRenewDate}</em><em>人气：${shops.wshCount}</em><em>软件大小：${shops.wshSize} MB</em></h1>
                        </a>
                    </li>
                </C:forEach>
            </ul>
        </div>
    </div>
</div>
<div class="cgs am-avg-lg-12">分页</div>

</body>
</html>
