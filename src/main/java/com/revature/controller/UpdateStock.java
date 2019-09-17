package com.revature.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class UpdateStock extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int addCans=Integer.parseInt(request.getParameter("cans"));
		System.out.println(addCans);
	   //StockController sc=new StockController();
	   String json= StockController.updateStock(addCans);  
	    PrintWriter out = response.getWriter();
	    out.println(json);
	    out.flush();
	    


	}
}
