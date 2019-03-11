package com.arun.startup;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class Resources {
	private static Resources resource = null;
	private DataSource dataSource;
	private Connection connection;

	private Resources() {

	}

	public static Resources getInstance() {
		if (resource == null) {
			synchronized (Resources.class) {
				resource = new Resources();
			}
		}
		return resource;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public Connection getConnection()
	{
		if(connection == null && dataSource!= null)
		{
			try 
			{
				connection = dataSource.getConnection();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return connection;
	}
}
