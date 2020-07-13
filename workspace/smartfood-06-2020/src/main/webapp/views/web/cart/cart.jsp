<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<c:url var ="CartURL" value="/trang-chu?page=1&maxPageItem=6&sortName=title&sortBy=asc"/>
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
                          <a href='<c:url value="/cart?foodId=${item.food.id}&minus=1"/>' type="submit" class="btn">
                          	<i class="fa fa-minus" aria-hidden="true"></i>
                          </a>
                          ${item.quantity}	
                          <a href='<c:url value="/cart?foodId=${item.food.id}"/>' type="submit" class="btn">
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
     
	<center>
		<h3 style="color:#930077">Tổng tiền:&emsp;&emsp; <span class="price total">${order.total()}</span></h3>
		<br>&nbsp;
		<br>
		<br>
			<c:if test="${not empty USERMODEL}">
			<form action="payment" method="post">
    	        <a href='<c:url value="/trang-chu?page=1&maxPageItem=6&sortName=title&sortBy=asc"/>' class="btn btn-outline-primary btn-md" role="button">
                	Tiếp tục đặt món
                </a>
                    <button id="btt" class="btn btn-primary btn-lg" type="submit" data-toggle="modal" data-target="#exampleModalCenter">Thanh toán</button> 	
				
			</form>
			</c:if>
				<c:if test="${empty USERMODEL}">
    	        <a href='<c:url value="/trang-chu?page=1&maxPageItem=6&sortName=title&sortBy=asc"/>' class="btn btn-outline-primary btn-md" role="button">
                	Tiếp tục đặt món
                </a>
                &emsp;&emsp;&emsp;&emsp;&emsp;			
					<button id="btt" class="btn btn-primary btn-lg" type="submit" data-toggle="modal" data-target="#exampleModalCenter">Thanh toán</button>
				</c:if>
	</center>       
				<c:if test="${empty USERMODEL}">          
					<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
					  <div class="modal-dialog modal-dialog-centered" role="document">
					    <div class="modal-content">  	
					       	<div class="modal-body">
					       		<center><h4>Xin vui lòng đăng nhập và chọn món!</h4></center>
					       	</div>
					    </div>
					  </div>
                </div>
				</c:if>
    </div>
    <script type="text/javascript">
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