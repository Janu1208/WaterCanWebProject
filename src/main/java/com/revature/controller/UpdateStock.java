package com.revature.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.service.AdminServices;


public class UpdateStock extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int addCans=Integer.parseInt(request.getParameter("cans"));
		System.out.println(addCans);
		AdminServices as=new AdminServices();
		try {
			as.setAvailableCans(addCans);
			response.sendRedirect("adminOperations.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("updateStock.jsp?message=" + e.getMessage());
		}
	}



}
