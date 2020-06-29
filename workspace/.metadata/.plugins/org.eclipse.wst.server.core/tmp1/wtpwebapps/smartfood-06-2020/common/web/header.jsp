<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
			<a href='<c:url value="/trang-chu?page=1&maxPageItem=6&sortName=title&sortBy=asc"/>'><img src="/views/web/image/hcmut.jpg" width="60" height="60" alt="Loading..."></a>
		<a class="navbar-brand" href='<c:url value="/trang-chu?page=1&maxPageItem=6&sortName=title&sortBy=asc"/>'>
		SMART FOOD HCMUT</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<c:if test="${not empty USERMODEL}">
					<li class="nav-item">
						<a href='#' class="nav-link">Wellcome, ${USERMODEL.fullName}</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href='<c:url value="/thoat?action=logout"/>'>Đăng xuất</a>
					</li>
				</c:if>

				<c:if test="${empty USERMODEL}">
					<li class="nav-item">
						<a class="nav-link" href='<c:url value="/dang-nhap?action=login"/>'>Đăng nhập</a>
					</li>
				</c:if>
				<c:if test="${empty USERMODEL}">
					<li class="nav-item">
						<a class="nav-link" href='<c:url value="/dang-ky?action=register"/>'>Đăng ký</a>
					</li>
				</c:if>
				<a class="nav-link" href='<c:url value="/cart"/>'>
					<h4><i class="fa fa-shopping-cart" aria-hidden="true" style="color:#cccccc"></i></h4>
				</a>
			</ul>
		</div>
	</div>
</nav>