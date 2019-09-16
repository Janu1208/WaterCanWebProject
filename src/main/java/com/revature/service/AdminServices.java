package com.revature.service;

import java.io.PrintWriter;
import java.util.List;


import com.revature.dao.AdminDAO;
import com.revature.dao.AdminDAOImp;
import com.revature.dao.StockDAO;
import com.revature.dao.StockDAOImp;
import com.revature.exception.DBException;
import com.revature.model.Admin;
import com.revature.model.Stock;

public class AdminServices {
	AdminDAOImp adao=new AdminDAO();

	public Admin login(String name,String password) throws Exception
	{
		Admin admin=null;
	     try {
	    	 admin=adao.login(name,password);
		} catch (DBException e) {
			e.printStackTrace();
		}
		return admin;
		
	}
	public List<Stock> stockView() throws Exception {

		StockDAOImp dao = new StockDAO();
		List<Stock> list = null;
		try {
			list = dao.viewStock();
		} catch (DBException e) {

			e.printStackTrace();
		}

		System.out.println();
		return list;
	}
	public int setAvailableCans()
	{
		Stock stock=new Stock();
		StockDAOImp sdao = new StockDAO();
		
		sdao.availStock(cans);
		
		int total=stock.getCans_avail();
		sdao.updateStock(total);

		
	}
}
