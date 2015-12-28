<%--
  Created by IntelliJ IDEA.
  User: Mr.Shi
  Date: 2015/12/27
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index.jsp</title>
</head>
<body>
        <h1>index.jsp for jcaptcha</h1>
        <form action="" method="post">
            验证码：<input type="text" id="jcaptcha" name = "jcaptchaCode"> <img src="<%=request.getContextPath()%>/captcha.jpg" alt="验证码" style="cusror:pointer;"><a href="javascript:void();">看不清楚</a>
<a href="<%=request.getContextPath()%>/captcha.jpg">图片</a>
        </form>
</body>
</html>
