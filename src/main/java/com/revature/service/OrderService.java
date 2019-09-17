package com.revature.service;

import java.sql.SQLException;

import com.revature.dao.OrderDAO;
import com.revature.dao.OrderDAOImp;
import com.revature.dao.StockDAO;
import com.revature.dao.StockDAOImp;
import com.revature.model.Order;
import com.revature.model.User;

public class OrderService {
	public void orderCan(User user, Order order) {
		StockDAOImp sdao =new StockDAO();
		int availableStock = viewAvailableStock();
		int totalCanAfterOrder=0;
		System.out.println(availableStock);
		if (order.getOrderCans() <= availableStock) {
			OrderDAOImp odao=new OrderDAO();
			odao.addOrder(user, order);
			totalCanAfterOrder=availableStock - order.getOrderCans();
			System.out.println(totalCanAfterOrder);
			try {
				sdao.updateStock(totalCanAfterOrder);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}
	public int viewAvailableStock()

	{		
		StockDAOImp sdao =new StockDAO();
		int availableCan = sdao.findavaiability();
		return availableCan;

	}
}
