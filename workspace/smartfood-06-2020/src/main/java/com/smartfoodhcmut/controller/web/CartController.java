package com.smartfoodhcmut.controller.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smartfoodhcmut.model.FoodsModel;
import com.smartfoodhcmut.model.Item;
import com.smartfoodhcmut.model.OrderModel;
import com.smartfoodhcmut.service.IFoodsService;

@WebServlet(urlPatterns = {"/cart"})
public class CartController extends HttpServlet {
	
	@Inject
	private IFoodsService foodsService;
	private static final long serialVersionUID = 2686801510274002166L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int quantity = 1;
			int id;
			
			if (request.getParameter("foodId") != null) {
				id = Integer.parseInt(request.getParameter("foodId"));
				FoodsModel food = foodsService.findOne(id);
				if (food != null) {
					if (request.getParameter("quantity") != null) {
						quantity = Integer.parseInt(request.getParameter("quantity"));
					}
					HttpSession session = request.getSession();
					if (session.getAttribute("order") == null) {
						OrderModel order = new OrderModel();
						List<Item> listItems = new ArrayList<Item>();
						Item item = new Item();
						item.setQuantity(quantity);
						item.setFood(food);
						item.setPrice(food.getPrice());
						listItems.add(item);
						order.setItems(listItems);
						session.setAttribute("order", order);
					} else {
						OrderModel order = (OrderModel) session.getAttribute("order");
						List<Item> listItems = order.getItems();
						boolean check = false;
						for (Item item : listItems) {
							if (item.getFood().getId() == food.getId()) {
								if (request.getParameter("minus") != null) {
									if (item.getQuantity() > 0)
										item.setQuantity(item.getQuantity() - 1);
								} else {
									item.setQuantity(item.getQuantity() + 1);
								}
								check = true;
							}
						}
						if (check == false) {
							Item item = new Item();
							item.setQuantity(quantity);
							item.setFood(food);
							item.setPrice(food.getPrice());
							listItems.add(item);
						}
						session.setAttribute("order", order);
					}
				}
			}
			if (request.getParameter("removeId") != null) {
				int rmId = Integer.parseInt(request.getParameter("removeId"));
				HttpSession session = request.getSession();
				OrderModel order = (OrderModel) session.getAttribute("order");
				order.removeItemById(rmId);
				session.setAttribute("order", order);
			}
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/cart/cart.jsp");
			rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
