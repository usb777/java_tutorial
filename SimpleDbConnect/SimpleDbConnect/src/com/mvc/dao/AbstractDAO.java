package com.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;

abstract class AbstractDAO 
{
	protected Connection conn;
	
	public void getConnection(){
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			            //jdbc:mysql://localhost:3306/usb777_advicenyc
			// Mysql Url: "jdbc:mysql://mysql3000.mochahost.com/usb777_advicenyc";
			String url = "jdbc:mysql://localhost:3306/first";
		
			String user = "root";  //MySQL user ="usb777_admin";//
			String pass = "";      //MySQL pass   ="Fight160583dsoregon";//
			
			
			
			conn = DriverManager.getConnection(url, user, pass);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeConnection() 
	{
		try
		{
			conn.close();
		} catch(Exception e) {}
	}
	
}