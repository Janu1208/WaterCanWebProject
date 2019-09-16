package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.Admin;
import com.revature.service.AdminServices;


public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
String Name = request.getParameter("name");
		
        String password=request.getParameter("password");
        System.out.println(Name);
        System.out.println(password);
       Admin admin =new Admin();
       admin.setName(Name);
       admin.setPassword(password);
        //PrintWriter out=response.getWriter();
        
            admin = null;
              try {
                  AdminServices as = new AdminServices ();
                  admin = as.login(Name,password);
                  System.out.println(admin);
              }catch(Exception e) {
                  e.printStackTrace();
              }
              if(admin!=null) {
                  response.sendRedirect("adminOperations.jsp");
              }
              else {
                  response.sendRedirect("index.jsp?  alert.message=Invalid Login Crendentials!!!");
              }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String name = request.getParameter("name");
		String password = request.getParameter("password");
		AdminServices as=new AdminServices();

	  Admin admin= as.login(name,password);
		System.out.println(admin);
		
		Gson gson = new Gson();
		String json = gson.toJson(admin);

		System.out.println("Hello");
		PrintWriter out = response.getWriter();
		out.write(json);
		out.flush();
		*/
		
	}

	
	
}
