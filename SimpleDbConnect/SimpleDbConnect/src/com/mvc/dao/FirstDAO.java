package com.mvc.dao;




import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;


import com.mvc.model.*;


public class FirstDAO extends AbstractDAO
{
	
	/**
	 * This method gets all places from table
	 * @return
	 */
	public ArrayList<First> getAllFirst() 
	{
		ArrayList<First> first = new ArrayList<First>();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("select * from first ");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				First row = new First();
	
				row.setId(rs.getInt(1));
			    row.setName(rs.getString(2));
			  
				
			    first.add(row);
			}  //while
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		return first;
		
	}
	

}
