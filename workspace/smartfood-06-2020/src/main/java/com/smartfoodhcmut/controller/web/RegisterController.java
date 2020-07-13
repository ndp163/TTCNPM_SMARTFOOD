package com.smartfoodhcmut.controller.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/dang-ky"})
public class RegisterController extends HttpServlet {
	@Inject
	private static final long serialVersionUID = 2686801510274002166L;
	ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
	ResourceBundle resourceBundleDB = ResourceBundle.getBundle("db");
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String alert = request.getParameter("alert");
		String message = request.getParameter("message");
		if (alert != null && message != null) {
			request.setAttribute("message", resourceBundle.getString(message));
			request.setAttribute("alert", alert);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/views/register.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String fullname=request.getParameter("fullname");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(fullname != null && username !=null&&password!=null) {
			try{
				Class.forName(resourceBundleDB.getString("driverName"));
				Connection con = DriverManager.getConnection(resourceBundleDB.getString("url"), resourceBundleDB.getString("user"), resourceBundleDB.getString("password"));

				PreparedStatement ps=con.prepareStatement("INSERT INTO user(username, password, fullname, status, roleid) VALUES (?,?,?,?,?)");
				ps.setString(1, username);
				ps.setString(2, password);
				ps.setString(3, fullname);
				ps.setInt(4,1);
				ps.setInt(5, 2);
				int i =ps.executeUpdate();
				if(i>0)
					response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login");
				else {
					response.sendError(400);
				}
			}catch(Exception ex){
				response.sendRedirect(request.getContextPath()+"/dang-ky?alert=danger&message=not_register");
			}
		}
	}
}
