<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập</title>
</head>
<body>
<div class="wrapper fadeInDown">

  <div id="formContent">
    <!-- Tabs Titles -->
    <c:if test="${not empty message}">
	    <div class="alert alert-${alert}">
    		${message}
  		</div>
    </c:if>
    <!-- Icon -->
    <div class="fadeIn first">
      <h3>Login</h3>
    </div>

    <!-- Login Form -->
	  <form action="<c:url value='/dang-nhap'/>" id="formLogin" method="post">
      <input type="text" id="userName" class="fadeIn second" name="userName" placeholder="account">
      <input type="password" id="password" class="fadeIn third" name="password" placeholder="password">
      <input type="hidden" value="login" name="action"/>
      <input type="submit" class="fadeIn fourth" value="Log In">
    </form>

    <!-- Remind Passowrd -->
    <div id="formFooter">
      <a class="underlineHover" href="#">Forgot Password?</a>
    </div>

  </div>
</div>
</body>
</html>