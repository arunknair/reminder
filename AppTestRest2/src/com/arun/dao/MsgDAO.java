package com.arun.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.arun.base.BaseDAO;

public class MsgDAO extends BaseDAO{

	public void getSimpleCount() {
		System.out.println("getSimpleCount start");
		PreparedStatement ps = null;
		ResultSet rs = null;
		try 
		{
			ps = getSimpleCountQuery();
			rs = ps.executeQuery();
			int k=0;
			if(rs.next())
			{
				k= rs.getInt(1);
			}
			System.out.println("No Login Records : " + k);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		System.out.println("getSimpleCount end");
	}

	private PreparedStatement getSimpleCountQuery() throws SQLException {
		StringBuilder query = new StringBuilder();
		query.append("SELECT count(*) FROM LOGIN_TBL");
		System.out.println("Query Used : " + query.toString());
		PreparedStatement ps = getConnection().prepareStatement(query.toString());
		return ps;
	}

}
