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
	String DB_CONNECTION_URL="jdbc:mysql://localhost:3306/smartfood062020";
	String DB_USERNAME="root";
	String DB_PASSWORD="Dung2000";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			RequestDispatcher rd = request.getRequestDispatcher("/views/register.jsp");
			rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String fullname=request.getParameter("fullname");
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			if(fullname != null && username !=null&&password!=null) {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(DB_CONNECTION_URL, DB_USERNAME, DB_PASSWORD);
				PreparedStatement ps=con.prepareStatement("INSERT INTO user(username, password, fullname, status, roleid) VALUES (?,?,?,?,?)");
				ps.setString(1, username);
				ps.setString(2, password);
				ps.setString(3, fullname);
				ps.setInt(4,1);
				ps.setInt(5, 2);
				int i =ps.executeUpdate();
				if(i>0)
					response.sendRedirect("http://localhost:8080/dang-nhap?action=login");
				else {
					response.sendError(400);
				}
			}catch(Exception ex){
				response.sendError(HttpServletResponse.SC_BAD_REQUEST,"The username already exists");
		}
	}
	}
}
