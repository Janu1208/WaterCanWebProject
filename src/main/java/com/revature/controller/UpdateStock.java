package com.revature.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.Stock;
import com.revature.service.AdminServices;
import com.revature.service.UserServices;


public class UpdateStock extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Stock sc=new Stock();
		int cans = Integer.parseInt( request.getParameter("cans_avail"));
        int updateCans=sc.setCans_avail(cans);
        sc = null;
        try {
            AdminServices as = new AdminServices ();
            int stock = as.setAvailableCans();
        }catch(Exception e) {
            e.printStackTrace();

        }
        if(user!=null) {
            response.sendRedirect("userOperations.jsp");
        }
        else {
            response.sendRedirect("ulogin.jsp?errorMessage=" +"invalid login credentials!!!!!!!!");

        }
	}



}
