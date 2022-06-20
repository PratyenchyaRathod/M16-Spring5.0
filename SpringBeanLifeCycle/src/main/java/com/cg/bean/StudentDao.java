package com.cg.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao
{
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://127.0.0.1:3306/?user=root";
	private String user ="root";
	private String password="123456789";
	public void selectAllRows() throws ClassNotFoundException, SQLException
	{
		//load the driver
		Class.forName(driver);
		
		//get connection
		Connection con = DriverManager.getConnection(url, user, password);
		
		//execute a query
		Statement s = con.createStatement();
		ResultSet r = s.executeQuery("SELECT * FROM placementdb.student");
		while(r.next())
		{
			int id = r.getInt(1);
			String name = r.getString(3);
			String college = r.getString(4);
			System.out.println("");
		}
		
	}

}
