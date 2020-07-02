package com.smartfoodhcmut.controller.admin.api;





import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mservice.allinone.models.CaptureMoMoResponse;
import com.mservice.allinone.processor.allinone.CaptureMoMo;
import com.mservice.shared.sharedmodels.Environment;
import com.mservice.shared.utils.LogUtils;
import com.smartfoodhcmut.model.OrderModel;



@WebServlet("/payment")
public class PaymentAPI extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("USERMODEL") != null) {
			if (session.getAttribute("order") != null) {
				OrderModel order = (OrderModel) session.getAttribute("order");
		        LogUtils.init();
		        String requestId = String.valueOf(System.currentTimeMillis());
		        String orderId = "SFBKU-" + getAlphaNumericString(10);
		        long amount = order.total();
		
		        String orderInfo = "Pay With MoMo";
		        String returnURL = "http://localhost:8080/trang-chu?page=1&maxPageItem=6&sortName=title&sortBy=asc";
		        String notifyURL = "http://localhost:8080/trang-chu?page=1&maxPageItem=6&sortName=title&sortBy=asc";
		        String extraData = "abc";
		        String bankCode = "SML";
		
		        Environment environment = Environment.selectEnv("dev", Environment.ProcessType.PAY_GATE);
		
		
		        CaptureMoMoResponse captureMoMoResponse;
				try {
					captureMoMoResponse = CaptureMoMo.process(environment, orderId, requestId, Long.toString(amount), orderInfo, returnURL, notifyURL, "");
			        String url = captureMoMoResponse.getPayUrl();
			        response.sendRedirect(url);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else
			response.sendRedirect(request.getContextPath()+"/trang-chu?page=1&maxPageItem=6&sortName=title&sortBy=asc");

        
//		QueryStatusTransactionResponse queryStatusTransactionResponse = QueryStatusTransaction.process(environment, orderId, requestId);

//      Process Payment Result - Xá»­ lÃ½ káº¿t quáº£ thanh toÃ¡n
//      PayGateResponse payGateResponse = PaymentResult.process(environment,new PayGateResponse());

    }
	protected void doPut(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

	}
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

	}
	
	static String getAlphaNumericString(int n) { 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
}
