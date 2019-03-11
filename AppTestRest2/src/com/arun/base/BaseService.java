package com.arun.base;

import java.sql.Connection;
import java.sql.SQLException;

import com.arun.startup.Resources;

public class BaseService {
	
	private Connection connection;
	
	public Connection createConnection()
	{
		try 
		{
			if(connection == null || connection!=null && connection.isClosed())
			{
				connection = Resources.getInstance().getConnection();
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return connection;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	

}
