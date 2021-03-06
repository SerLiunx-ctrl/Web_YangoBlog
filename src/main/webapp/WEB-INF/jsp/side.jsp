<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>


<shiro:notAuthenticated>
    <div class="panel panel-default" id="sidebar2" style="width: 20%;margin:1% 2% 1% 0%;float: right">
        <div class="panel-heading" style="background-color: white;text-align: center">
            <blockquote>
                阳光技术论坛
                <small>阳光学院XXXXXXXXXXXX论坛</small>
            </blockquote>
        </div>
        <ul class="list-group" style="width: 100%">
            <li class="list-group-item">
                <a  href="${pageContext.request.contextPath}/forword/toLogin" class="btn btn-primary btn-block">登录</a>
                <a  href="${pageContext.request.contextPath}/forword/toRegist" class="btn btn-default btn-block">注册</a>
            </li>
        </ul>
    </div>

</shiro:notAuthenticated>

<shiro:authenticated>

    <!-- 已登录 -->
    <div class="panel panel-default" id="sidebar2" style="width: 20%;margin:1% 2% 1% 0%;float: right">
        <div class="panel-heading" style="background-color: white;text-align: center">
            <a href="${pageContext.request.contextPath}/user/userInfoid/${user.id}">用户名: ${user.username}</a>
        </div>
        <ul class="list-group" style="width: 100%">
            <li class="list-group-item"><a href="${pageContext.request.contextPath}/forword/toNew">发帖</a></li>
            <li class="list-group-item"><a href="${pageContext.request.contextPath}/user/myTopic.action?id=${user.id}&&starPage=1">我的帖子</a></li>
            <li class="list-group-item"><a href="">0条未读提醒</a></li>
            <li class="list-group-item"><a href="">用户积分积分:${user.credit}</a></li>
        </ul>
    </div>
</shiro:authenticated>


<div class="panel panel-default" id="sidebar1" style="width: 20%;margin:1% 2% 1% 0%;float: right">
    <div class="panel-heading" style="background-color: white;text-align: center">
        热议主题
    </div>
    <ul class="list-group" style="width: 100%">
        <c:forEach items="${hostTopics}" var="hotestTopic">
            <li class="list-group-item"><a href="${pageContext.request.contextPath}/forword/toDetails?topicId=${hotestTopic.id}">${hotestTopic.title}</a></li>
        </c:forEach>
    </ul>
</div>


