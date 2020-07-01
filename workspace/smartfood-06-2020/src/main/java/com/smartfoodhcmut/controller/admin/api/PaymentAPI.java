package com.smartfoodhcmut.controller.admin.api;





import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;



@WebServlet("/payment")
public class PaymentAPI extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
      
		 String data = "Ha noi mua thu";
		 QRCodeWriter qrCodeWriter = new QRCodeWriter();
		 BitMatrix matrix;
		try {
			matrix = qrCodeWriter.encode(data, BarcodeFormat.QR_CODE, 200, 200);
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			MatrixToImageWriter.writeToStream(matrix, "PNG", outputStream);
			byte[] pngByteArray = outputStream.toByteArray();
			String base64Image = Base64.getEncoder().encodeToString(pngByteArray);
			
		} catch (WriterException e) {
			e.printStackTrace();
		}
		request.setAttribute("base64", "base64");
	}
	protected void doPut(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

	}
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

	}

}
