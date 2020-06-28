package com.smartfoodhcmut.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartfoodhcmut.constant.SystemConstant;
import com.smartfoodhcmut.model.FoodsModel;
import com.smartfoodhcmut.paging.PageRequest;
import com.smartfoodhcmut.paging.Pageble;
import com.smartfoodhcmut.service.ICategoryService;
import com.smartfoodhcmut.service.IFoodsService;
import com.smartfoodhcmut.sort.Sorter;
import com.smartfoodhcmut.utils.FormUtil;
import com.smartfoodhcmut.utils.MessageUtil;

@WebServlet(urlPatterns = {"/admin-foods"})	

public class FoodsController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IFoodsService foodsService;
	
	@Inject
	private ICategoryService categoryService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FoodsModel model = FormUtil.toModel(FoodsModel.class, request);
		String view = "";
		if (model.getType().equals(SystemConstant.LIST)) {
			Pageble pageble = new PageRequest(model.getPage(), model.getMaxPageItem(),
					new Sorter(model.getSortName(), model.getSortBy()));
			model.setListResult(foodsService.findAll(pageble));
			model.setTotalItem(foodsService.getTotalItem());
			model.setTotalPage((int) Math.ceil((double)model.getTotalItem() / model.getMaxPageItem()));
			view = "/views/admin/foods/list.jsp";
		} else if (model.getType().equals(SystemConstant.EDIT)) {
			if (model.getId() != null) {
				model = foodsService.findOne(model.getId());
			} 
			request.setAttribute("categories", categoryService.findAll());
			view = "/views/admin/foods/edit.jsp";
		}
		MessageUtil.showMessage(request);
		request.setAttribute(SystemConstant.MODEL, model);
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
