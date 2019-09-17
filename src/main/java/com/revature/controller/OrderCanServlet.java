package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.model.Order;
import com.revature.model.User;
import com.revature.service.OrderService;


public class OrderCanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 Order order=new Order();
		 OrderService us=new OrderService();
		 User user=new User();
		 try
		 {
			 String orderCan=request.getParameter("orderCans");
				HttpSession session = request.getSession(false);
				Integer userId = (Integer) session.getAttribute("USER_ID");
				System.out.println("User Id==>" + userId);
				int canOrder = Integer.parseInt(orderCan);
				user.setId(userId);
				order.setOrderCans(canOrder);
				 us.orderCan(user,order);
                
		 }

		catch(Exception e)
		 {
			System.out.println("Error");
		 }
		
	}

}
