package com.revature.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String name = request.getParameter("name");
        String password=request.getParameter("password");
        System.out.println(name);
        System.out.println(password);
        AdminController ac=new AdminController();
        String json=ac.login(name,password);
        PrintWriter out=response.getWriter();
        out.print(json);
        out.flush();
        
	}

	
	
}
