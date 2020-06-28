<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đặt món ăn</title>
</head>
<body>
	
    <div class="site-section  pb-0">
      <div class="container">
        <div class="row mb-5 justify-content-center">
          <div class="col-7 section-title text-center mb-5">
            <h2 class="d-block">ĐẶT MÓN ĂN</h2>
          </div>
        </div>
        <div class="row mb-5">
          <form class="col-md-12" action="<c:url value='/cart'/>" id="formSubmit" method="post">
            <div class="site-blocks-table">
              <table class="table table-bordered">
                <thead>
                  <tr>
                    <th class="product-thumbnail">Hình</th>
                    <th class="product-name">Tên món</th>
                    <th class="product-price">Đơn giá</th>
                    <th class="product-quantity">Số lượng</th>
                    <th class="product-total">Thành tiền</th>
                    <th class="product-remove">Xóa</th>
                  </tr>
                </thead>
                <tbody>
                <c:forEach var="item" items="${order.items}"> 
                  <tr>
                    <td class="product-thumbnail">
                      <img src="data:image/jpg;base64,${item.food.thumbnail}" alt="Image" class="img-fluid">
                    </td>
                    <td class="product-name">
                      <h2 class="h5 cart-product-title text-black">${item.food.title}</h2>
                    </td>
                    <td class="price">${item.price}</td>
                    <td>
                    	  <a href='<c:url value="/cart?foodId=${item.food.id}&minus=1"/>'>
                          	<i class="fa fa-minus" aria-hidden="true"></i>
                          </a>
                          <span>&emsp;${item.quantity}&emsp;</span>	
                          <a href='<c:url value="/cart?foodId=${item.food.id}"/>'>
                          	<i class="fa fa-plus" aria-hidden="true"></i>
                          </a>
                    </td>
                    <td class="price">${item.price*item.quantity}</td>
                    <td><a href='<c:url value="/cart?removeId=${item.food.id}"/>' class="btn btn-primary height-auto btn-sm">X</a></td>
                  </tr>
        		</c:forEach>
                </tbody>
              </table>
            </div>
          </form>
        </div>
    
      </div>
    </div>

    <div class="site-section pt-5 bg-light">
      <div class="container">
        <div class="row">
          <div class="col-md-6">
            <div class="row mb-5">
              <div class="col-md-6 mb-3 mb-md-0">
                <button class="btn btn-primary btn-md btn-block">Cập nhật</button>
              </div>
              <div class="col-md-6">
                <a href='<c:url value="/trang-chu?page=1&maxPageItem=6&sortName=title&sortBy=asc"/>'>
                	<button class="btn btn-outline-primary btn-md btn-block" >Tiếp tục đặt món</button>
                </a>
              </div>
            </div>

          </div>
          <div class="col-md-6 pl-5">
            <div class="row justify-content-end">
              <div class="col-md-7">
                <div class="row">
                  <div class="col-md-9 text-right border-bottom mb-5">
                     <h3><span style="color:#930077">Tổng tiền: </span></h3>
                  </div>
                </div>
                <div class="row mb-3">
                  <div class="col-md-6">
                    <span class="text-black"></span>
                  </div>
                </div>
                <div class="row mb-5">
                  <div class="col-md-9 text-right">
                    <h3><strong class="price total">${order.total()}</strong></h3>
                  </div>
                </div>
    
                <div class="row">
                  <div class="col-md-12">
                    <button class="btn btn-primary btn-lg btn-block" href="#">Thanh toán</button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <script>
    $('.price').each(function () {   
	    var item = $(this).text();
	    var num = Number(item).toLocaleString('en');
	    $(this).text(num);
	});
    </script>
    	<style>
		.price.total {
		    color:red;
		}
		.price.total::after {
		    content:'đ';
		}
	</style>
</body>
</html>