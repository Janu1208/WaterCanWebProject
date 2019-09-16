package com.revature.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.User;
import com.revature.service.UserServices;


public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String phone_number = request.getParameter("phone_number");
		String password = request.getParameter("password");
		

		//PrintWriter out = response.getWriter();
		User user = new User();
		user.setName(name);
		user.setPhone_number(phone_number);
		user.setPassword(password);
		UserServices us=new UserServices();
	    try {
			us.register(user);
	        response.sendRedirect("login.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("newUser.jsp?errorMessage=" + e.getMessage());
		}
		
		
		
		
	}

	
	

}
