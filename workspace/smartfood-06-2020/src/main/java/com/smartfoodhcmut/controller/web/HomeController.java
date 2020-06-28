package com.smartfoodhcmut.controller.web;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartfoodhcmut.constant.SystemConstant;
import com.smartfoodhcmut.model.FoodsModel;
import com.smartfoodhcmut.model.UserModel;
import com.smartfoodhcmut.paging.PageRequest;
import com.smartfoodhcmut.paging.Pageble;
import com.smartfoodhcmut.service.IFoodsService;
import com.smartfoodhcmut.service.IUserService;
import com.smartfoodhcmut.sort.Sorter;
import com.smartfoodhcmut.utils.FormUtil;
import com.smartfoodhcmut.utils.SessionUtil;

@WebServlet(urlPatterns = {"/trang-chu","/dang-nhap","/thoat"})
public class HomeController extends HttpServlet {
	
	@Inject
	private IUserService userService;
	
	private static final long serialVersionUID = 2686801510274002166L;
	
	@Inject
	private IFoodsService foodsService;

	ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String category = request.getParameter("category");
		if (action != null && action.equals("login")) {
			String alert = request.getParameter("alert");
			String message = request.getParameter("message"); 
			if (message != null && alert != null) {
				request.setAttribute("message", resourceBundle.getString(message));
				request.setAttribute("alert", alert);
			}
			RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
			rd.forward(request, response);
		} else if (action != null && action.equals("logout")) {
			SessionUtil.getInstance().removeValue(request, "USERMODEL");
			SessionUtil.getInstance().removeValue(request, "order");
			response.sendRedirect(request.getContextPath()+"/trang-chu?page=1&maxPageItem=6&sortName=title&sortBy=asc");
		} else {				
			FoodsModel model = FormUtil.toModel(FoodsModel.class, request);
			Pageble pageble = new PageRequest(model.getPage(), model.getMaxPageItem(),
					new Sorter(model.getSortName(), model.getSortBy()));
			model.setListResult(foodsService.findAll(pageble));
			model.setTotalItem(foodsService.getTotalItem());
			model.setTotalPage((int) Math.ceil((double)model.getTotalItem() / model.getMaxPageItem()));
			request.setAttribute(SystemConstant.MODEL, model);
			if (category != null && category.equals("1")) {
				request.setAttribute("category", category);
			} else if (category != null && category.equals("2")) {
				request.setAttribute("category", category);
			} else if (category != null && category.equals("3")) {
				request.setAttribute("category", category);
			}
			else {
				request.setAttribute("category", null);
			}
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
			rd.forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null && action.equals("login")) {
			SessionUtil.getInstance().removeValue(request, "order");	

			UserModel model = FormUtil.toModel(UserModel.class, request);
			model = userService.findByUserNameAndPasswordAndStatus(model.getUserName(), model.getPassword(), 1);
			if (model != null) {
				SessionUtil.getInstance().putValue(request, "USERMODEL", model);
				if (model.getRole().getCode().equals("USER")) {
					response.sendRedirect(request.getContextPath()+"/trang-chu?page=1&maxPageItem=6&sortName=title&sortBy=asc");
				} else if (model.getRole().getCode().equals("ADMIN")) {
					response.sendRedirect(request.getContextPath()+"/admin-foods?type=list&page=1&maxPageItem=6&sortName=id&sortBy=asc");
				}
			} else {
				response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login&message=username_password_invalid&alert=danger");
			}
		}
	}
}
