package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.User;
import com.revature.service.UserServices;


public class UserLogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phone_number = request.getParameter("phone_number");
		
        String password=request.getParameter("password");
        System.out.println(phone_number);
        System.out.println(password);
        User user = new User();
        user.setPhone_number(phone_number);
        user.setPassword(password);
        
            user = null;
              try {
                  UserServices us = new UserServices ();
                  user = us.login(phone_number,password);
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
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		String password = request.getParameter("password");
		UserServices us=new UserServices();

	    User user= us.login(phone_number, password);
		System.out.println(user);
		
		Gson gson = new Gson();
		String json = gson.toJson(user);

		System.out.println("Hello");
		PrintWriter out = response.getWriter();
		out.write(json);
		out.flush();*/
		
	}

	
	


