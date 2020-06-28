package com.smartfoodhcmut.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartfoodhcmut.model.FoodsModel;
import com.smartfoodhcmut.model.UserModel;
import com.smartfoodhcmut.service.IFoodsService;
import com.smartfoodhcmut.utils.HttpUtil;
import com.smartfoodhcmut.utils.SessionUtil;

@WebServlet(urlPatterns = {"/api-admin-foods"})
public class FoodsAPI extends HttpServlet {

	
	@Inject
	private IFoodsService foodsService;
	private static final long serialVersionUID = 2535844104962403259L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		FoodsModel foodsModel = HttpUtil.of(request.getReader()).toModel(FoodsModel.class);	
		foodsModel.setCreatedBy(((UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL")).getUserName());
		foodsModel = foodsService.save(foodsModel);
		mapper.writeValue(response.getOutputStream(), foodsModel);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		FoodsModel updateFoods = HttpUtil.of(request.getReader()).toModel(FoodsModel.class);
		updateFoods.setCreatedBy(((UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL")).getUserName());
		updateFoods = foodsService.update(updateFoods);
		mapper.writeValue(response.getOutputStream(), updateFoods);
	}
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		FoodsModel foodsModel = HttpUtil.of(request.getReader()).toModel(FoodsModel.class);
		foodsService.delete(foodsModel.getIds());
		mapper.writeValue(response.getOutputStream(), "{}");
	}
}
