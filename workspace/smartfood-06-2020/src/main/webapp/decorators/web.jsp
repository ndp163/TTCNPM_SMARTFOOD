<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title><dec:title default="Trang chủ" /></title>

    <!-- css -->
    <link href="<c:url value='/template/web/bootstrap/css/bootstrap.min.css' />" rel="stylesheet" type="text/css" media="all"/>
    <link href="<c:url value='/template/web/css/style.css' />" rel="stylesheet" type="text/css" media="all"/>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="<c:url value='/template/paging/jquery.twbsPagination.js' />"></script>
    <link rel="stylesheet" href="<c:url value='/template/admin/font-awesome/4.5.0/css/font-awesome.min.css' />" />
    <link rel="stylesheet" href="<c:url value='/template/web/fonts/icomoon/style.css' />" />

  	<link rel="stylesheet" href="<c:url value='/template/web/csscart/owl.theme.default.min.css' />" />
  	<link rel="stylesheet" href="<c:url value='/template/web/fonts/flaticon/font/flaticon.css' />" />
  	<link rel="stylesheet" href="<c:url value='/template/web/csscart/aos.css' />" />
  
    
</head>
<body>
	<!-- header -->
    <%@ include file="/common/web/header.jsp" %>
    <!-- header -->
    
    <div class="container">
    	<dec:body/>
    </div>

	<!-- footer -->
	<%@ include file="/common/web/footer.jsp" %>
	<!-- footer -->
	
    <script type="text/javascript" src="<c:url value='/template/web/bootstrap/js/bootstrap.bundle.min.js' />"></script>
	
	  <script src="<c:url value='/template/web/js/jquery-ui.js' />"></script>
	  <script src="<c:url value='/template/web/js/popper.min.js' />"></script>
	  <script src="<c:url value='/template/web/js/owl.carousel.min.js' />"></script>
	  <script src="<c:url value='/template/web/js/jquery.stellar.min.js' />"></script>
	  <script src="<c:url value='/template/web/js/jquery.countdown.min.js' />"></script>
	  <script src="<c:url value='/template/web/js/bootstrap-datepicker.min.js' />"></script>
	  <script src="<c:url value='/template/web/js/jquery.easing.1.3.js' />"></script>
	  <script src="<c:url value='/template/web/js/aos.js' />"></script>
	  <script src="<c:url value='/template/web/js/jquery.fancybox.min.js' />"></script>
	  <script src="<c:url value='/template/web/js/jquery.sticky.js' />"></script>
	  <script src="<c:url value='/template/web/js/jquery.mb.YTPlayer.min.js' />"></script>
	  <script src="<c:url value='/template/web/js/main.js' />"></script>	
</body>
</html>