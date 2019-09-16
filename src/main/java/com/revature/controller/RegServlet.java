package com.revature.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String phone_number = request.getParameter("phone_number");
		String password = request.getParameter("password");
		UserController uc = new UserController();
		String json = uc.register(name, phone_number, password);
		PrintWriter out = response.getWriter();
		out.write(json);
		out.flush();
		

	}

}
