<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng Ký</title>
</head>
<body>
<div class="wrapper fadeInDown">

  <div id="formContent">
    <c:if test="${not empty message}">
	    <div class="alert alert-${alert}">
    		${message}
  		</div>
    </c:if>
    <!-- Tabs Titles -->
     
    <!-- Icon -->
    <div class="fadeIn first">
      <h3>Register</h3>
    </div>

    <!-- Register Form -->
	<form action="<c:url value='/dang-ky'/>" id="formLogin" method="post">
	  <input type="text" id="fullname" class="fadeIn second" name="fullname" placeholder="fullname">
      <input type="text" id="username" class="fadeIn third" name="username" placeholder="account">
      <input type="password" id="password" class="fadeIn fouth" name="password" placeholder="password">
      <input type="hidden" value="register" name="action"/>
      <input type="submit" class="fadeIn fifth" value="Register">
    </form>
  </div>
</div>
</body>
</html>