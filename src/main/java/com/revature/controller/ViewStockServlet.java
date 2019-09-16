package com.revature.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.revature.model.Stock;
import com.revature.service.AdminServices;


public class ViewStockServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    
        List<Stock> list = null;
        
    try {
        AdminServices as = new AdminServices();
        list=as.stockView();
        
        
        } catch (Exception e) {
        e.printStackTrace();
    }
    Gson gson = new Gson();
    String json = gson.toJson(list);
    
    PrintWriter out = response.getWriter();
    out.println(json);
    out.flush();
    }
    
}


