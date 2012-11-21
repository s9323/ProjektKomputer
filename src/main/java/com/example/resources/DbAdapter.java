package com.example.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbAdapter {

	Connection conn;
	private String url = "";
	
	String createTable= "";
	
	Statement statement;
	
	
	
	public DbAdapter() 
	{
		try {
			conn=DriverManager.getConnection(url);
			statement = conn.createStatement();
			
			ResultSet rs = conn.getMetaData().getTables(null, null, null, null);
			
			boolean tableExists = false;
			while (rs.next()) {
				if ("".equalsIgnoreCase(rs.getString(""))){
					tableExists = true;
					break;
					
				}
				
				if (!tableExists)
				{
					statement.executeUpdate(createTable);
				
				}
				
				
				
				
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	
	
}
