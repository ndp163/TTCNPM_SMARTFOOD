<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<c:url var="APIurl" value="/api-admin-foods"/>
<c:url var ="FoodsURL" value="/admin-foods"/>
<html>
<head>
    <title>Chỉnh sửa món ăn</title>
</head>
<body>
<div class="main-content">
    <div class="main-content-inner">
		<div class="page-header row no-gutters py-4">
			<div class="col-12 col-sm-4 text-center text-sm-left mb-0">
				<span class="text-uppercase page-subtitle"><h4>Chỉnh sửa món ăn</h4></span>
			</div>
		</div>
        <div class="page-content">
            <div class="row">
                <div class="col-xs-12">
                        <c:if test="${not empty messageResponse}">
									<div class="alert alert-${alert}">
  										${messageResponse}
									</div>
						</c:if>
						<c:if test="${not empty model.categoryCode}">
							<form action="ThumbnailUpload" method="post" enctype="multipart/form-data">
	                            <div class="form-group">
	                                <label class="col-sm-3 control-label no-padding-right">Ảnh minh họa</label>
	                                <div class="col-sm-9">
	                                    <!-- <input type="text" class="form-control" id="thumbnail" name="thumbnail" value="${model.thumbnail}"/> -->
	                                    <td>Choose a image :</td>
	                        			<td><input type="file" class="form-control" id="thumbnail" name="thumbnail"/></td>
	                        			<input type="hidden" id="idThumbnail" name="idThumbnail" value="${model.id}" />
	                        			<input type="submit" value="Xác nhận ảnh">
	                                </div>
	                                <br/>
	                                <br/>
	                                <br/>
	                            </div>
                         </form>
                         </c:if>
                        <form id="formSubmit">
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Loại món ăn</label>
                                <div class="col-sm-9">
                                    <select class="form-control" id="categoryCode" name="categoryCode">
                                        <c:if test="${empty model.categoryCode}">
                                            <option value="">Chọn loại món ăn</option>
                                            <c:forEach var="item" items="${categories}">
                                                <option value="${item.code}">${item.name}</option>
                                            </c:forEach>
                                        </c:if>
                                        <c:if test="${not empty model.categoryCode}">
                                        	<option value="">Chọn loại món ăn</option>
                                            <c:forEach var="item" items="${categories}">
                                                <option value="${item.code}" <c:if test="${item.code == model.categoryCode}">selected="selected"</c:if>>
                                                        ${item.name}
                                                </option>
                                            </c:forEach>
                                        </c:if>
                                    </select>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Tên món ăn</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="title" name="title" value="${model.title}"/>
                                </div>
                            </div>
							<br/>
                            <br/>
	                            <div class="form-group">
	                                <label class="col-sm-3 control-label no-padding-right">Giá</label>
	                                <div class="col-sm-9">
	                                    <input type="text" class="form-control" id="price" name="price" value="${model.price}"/>
	                                </div>
	                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Mô tả ngắn</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="shortDescription" name="shortDescription" value="${model.shortDescription}"/>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">Nội dung</label>
                                <div class="col-sm-9">                                 
                                    <textarea rows="" cols="" id="content" name="content" style="width: 820px;height: 175px">${model.content}</textarea>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <div class="form-group">
                                <div class="col-sm-12">
                                    <c:if test="${not empty model.id}">
                                        <input type="button" class="btn btn-white btn-warning btn-bold" value="Cập nhật món ăn" id="btnAddOrUpdateFoods"/>
                                    </c:if>
                                    <c:if test="${empty model.id}">
                                        <input type="button" class="btn btn-white btn-warning btn-bold" value="Thêm món ăn" id="btnAddOrUpdateFoods"/>
                                    </c:if>
                                </div>
                            </div>
                            <input type="hidden" value="${model.id}" id="id" name="id"/>
                        </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
	var editor = '';
	$(document).ready(function(){
		editor = CKEDITOR.replace('content');
	});
	
    $('#btnAddOrUpdateFoods').click(function (e) {
        e.preventDefault();
        var data = {};
        var formData = $('#formSubmit').serializeArray();
        $.each(formData, function (i, v) {
            data[""+v.name+""] = v.value;
        });
        data["content"] = editor.getData();
        var id = $('#id').val();
        if (id == "") {
            addFoods(data);
        } else {
            updateFoods(data);
        }
    });
    function addFoods(data) {
        $.ajax({
            url: '${APIurl}',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(data),
            dataType: 'json',
            success: function (result) {
            	window.location.href = "${FoodsURL}?type=edit&id="+result.id+"&message=insert_success";
            },
            error: function (error) {
            	window.location.href = "${FoodsURL}?type=list&maxPageItem=6&message=error_system";
            }
        });
    }
    function updateFoods(data) {
        $.ajax({
            url: '${APIurl}',
            type: 'PUT',
            contentType: 'application/json',
            data: JSON.stringify(data),
            dataType: 'json',
            success: function (result) {
            	window.location.href = "${FoodsURL}?type=edit&id="+result.id+"&message=update_success";
            },
            error: function (error) {
            	window.location.href = "${FoodsURL}?type=list&maxPageItem=6&message=error_system"; 
            }
        });
    }

</script>
<script>
    $('#price .price').each(function () {   
	    var item = $(this).text();
	    var num = Number(item).toLocaleString('en');
	    $(this).text(num);
	});
</script>
</body>
</html>