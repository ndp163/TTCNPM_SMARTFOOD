package com.smartfoodhcmut.controller.admin.api;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Base64;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/ThumbnailUpload")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
			maxFileSize = 1024 * 1024 * 10,
			maxRequestSize = 1024 * 1024 * 50)

public class ThumbnailUpload extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("db");
		Connection conn = null;
		try {
			Class.forName(resourceBundle.getString("driverName"));
			conn = DriverManager.getConnection(resourceBundle.getString("url"), resourceBundle.getString("user"), resourceBundle.getString("password"));
			conn.setAutoCommit(false);
			
			Part part = request.getPart("thumbnail");
			String fileName = extractFileName(part);
			if (fileName != null && fileName.length() > 0) {
				InputStream is = part.getInputStream();
				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				byte[] buffer = new byte[4096];
				int bytesRead = -1;
				 
				while ((bytesRead = is.read(buffer)) != -1) {
				    outputStream.write(buffer, 0, bytesRead);
				}
				byte[] imageBytes = outputStream.toByteArray();
				
				String id = request.getParameter("idThumbnail");
				String base64Image = Base64.getEncoder().encodeToString(imageBytes);
				this.writeToDB(conn, base64Image, id);
				is.close();
                outputStream.close();
			}
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			response.sendRedirect(request.getContextPath()+"/admin-foods?type=list&page=1&maxPageItem=6&sortName=id&sortBy=asc");
		}			
	}
		
	private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length() - 1);
			}
		}
		return null;
	}
	private void writeToDB(Connection conn, String savePath, String id) throws SQLException {
		String sql = "UPDATE foods SET thumbnail = ? WHERE id = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, savePath);
		ps.setString(2, id);
		ps.executeUpdate();
	}	
}

