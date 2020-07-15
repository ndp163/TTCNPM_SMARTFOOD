<%@include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:url var="APIurl" value="/api-admin-foods"/>
<c:url var="FoodsURL" value="/admin-foods"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản lý món ăn</title>
</head>

<body>
	<div class="page-header row no-gutters py-4">
		<div class="col-12 col-sm-4 text-center text-sm-left mb-0">
			<span class="text-uppercase page-subtitle"><h4>Quản lý món ăn</h4></span>
		</div>
	</div>
	<div class="main-content">
		<form action="<c:url value='/admin-foods'/>" id="formSubmit" method="get">
			<br />
			<div class="main-content-inner">
					<div class="tableTools-container">
						<div class="dt-buttons btn-overlap btn-group">
							<a flag="info" 
							class="dt-button buttons-colvis btn btn-white btn-primary btn-bold"
								data-toggle="tooltip" title='Thêm món ăn'
								href='<c:url value="/admin-foods?type=edit"/>'> <span>
									<i class="fa fa-plus-circle bigger-110 purple"></i>
							</span>
							</a>
							<button id="btnDelete" type="button"
								class="dt-button buttons-html5 btn btn-white btn-primary btn-bold"
								data-toggle="tooltip" title='Xóa món ăn'>
								<span> <i class="fa fa-trash-o bigger-110 pink"></i>
								</span>
							</button>
						</div>
					</div>
				<div class="page-content">
					<c:if test="${not empty messageResponse}">
						<div class="alert alert-${alert}">
  							${messageResponse}
						</div>
					</c:if>
						<div class="col-xs-12">
							<div class="row">
								<div class="col-xs-12">

									<div class="table-responsive">
									<br />
										<table class="table table-hover table-bordered">
											<thead class="thead-light">
												<tr>
													<th width="20"><input type="checkbox" id="checkAll"></th>
													<th width="300">Tên món ăn</th>
													<th width="150">Giá</th>
													<th width="630">Mô tả</th>
													<th width="100">Chỉnh sửa</th>
												</tr>
											</thead>
											<tbody id="myTable">
												<c:forEach var="item" items="${model.listResult}">
													<tr>
														<td><input type="checkbox" id="checkbox_${item.id}" value="${item.id}"></td>
														<td>${item.title}</td>
														<td class="price">${item.price}</td>
														<td>${item.shortDescription}</td>
														<td>
															<c:url var="editURL" value="/admin-foods">
																	<c:param name="type" value="edit"/>
																	<c:param name="id" value="${item.id}"/>
															</c:url>
															<center>
															<a class="btn btn-sm btn-primary btn-edit"
															data-toggle="tooltip" title="Cập nhật món ăn"
															href='${editURL}'><i class="fa fa-pencil" aria-hidden="true"></i> </a>
														</center>
														</td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
					
										<ul class="float-right" class="pagination" id="pagination"></ul>
										<input type="hidden" value="" id="page" name="page" /> 
										<input type="hidden" value="" id="maxPageItem" name="maxPageItem" />
										<input type="hidden" value="" id="sortName" name="sortName" />
										<input type="hidden" value="" id="sortBy" name="sortBy" />
										<input type="hidden" value="" id="type" name="type" />
									</div>
								</div>
							</div>
						</div>
				</div>
			</div>
		</form>
	</div>
	<!-- /.main-content -->
	<script type="text/javascript">
		var totalPages = ${model.totalPage};
		var currentPage = ${model.page};
		var limit = 6;
		$(function() {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages : totalPages,
				visiblePages : 10,
				startPage : currentPage,
				onPageClick : function(event, page) {
					if (currentPage != page) {
						$('#maxPageItem').val(limit);
						$('#page').val(page); 
						$('#sortName').val('title');
						$('#sortBy').val('asc');
						$('#type').val('list');
						$('#formSubmit').submit();
					}
				}
			});
		});
		$("#btnDelete").click(function() {
			  var data = {};
				var ids = $('tbody input[type=checkbox]:checked').map(function () {
		            return $(this).val();
		        }).get();
				data['ids'] = ids;
				deleteFoods(data);
		});	
		
		   function deleteFoods(data) {
		        $.ajax({
		            url: '${APIurl}',
		            type: 'DELETE',
		            contentType: 'application/json',
		            data: JSON.stringify(data),
		            success: function (result) {
		            	window.location.href = "${FoodsURL}?type=list&maxPageItem=6&message=delete_success";
		            },
		            error: function (error) {
		            	window.location.href = "${FoodsURL}?type=list&maxPageItem=6&message=error_success";         
		            }
		        });
		    }
		    $('.price').each(function () {   
			    var item = $(this).text();
			    var num = Number(item).toLocaleString('en');
			    $(this).text(num);
			});
		    

	</script>

</body>
</html>