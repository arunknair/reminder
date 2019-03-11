package com.arun.startup;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;

@WebListener
public class AppListener implements ServletContextListener{

	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("contextDestroyed(ServletContextEvent arg0) ########################");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println(" ------- contextInitialization started ------- ");
		System.out.println("Trying to instantiate DataSource");
		initDataSource();
		System.out.println(" ------- contextInitialization ended ------- ");
	}

	private void initDataSource() {
		try 
		{
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:jboss/reminderDS");
			Resources resource = Resources.getInstance();
			resource.setDataSource(ds);
		} 
		catch (NamingException e) 
		{
			System.out.println("NamingException caught here");
			e.printStackTrace();
		}
	}
}
