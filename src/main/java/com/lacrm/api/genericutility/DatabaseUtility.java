package com.lacrm.api.genericutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility {

	Connection con;
	public void connectToDB()
	{
		try {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		 con=DriverManager.getConnection("jdbc:mysql://49.249.28.218:3307/ninza_hrm","root@%","root");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public boolean checkDataFromDB(String query,int colNum,String expectedData) throws SQLException
	{
		boolean flag=false;
		
		ResultSet result=con.createStatement().executeQuery(query);
		while(result.next()) {
			
				if(result.getString(colNum).equals(expectedData))
				{
					flag=true;
					break;
				}
			}
		
		if(flag)
		{
			System.out.println(expectedData+"=====Data verified in DB=====");
			return true;
		}
		else
		{
			System.out.println(expectedData+"=====Data not verified in DB=====");
			return false;
		}
	}
	public void updataDataInDB(String query)
	{
		
	}
	public void closeDB()
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
