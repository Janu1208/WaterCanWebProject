package com.revature.dao;

import java.util.List;

import com.revature.model.Stock;

public interface StockDAOImp {
	public  Stock findavaiability();
	public void  availStock(int cans) throws Exception;
	public void updateStock(int cans);
	public List<Stock> viewStock() throws Exception;
   
}
