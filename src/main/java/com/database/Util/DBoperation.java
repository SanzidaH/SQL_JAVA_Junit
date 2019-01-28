package com.database.Util;

import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.database.Model.Employee;
import com.database.Model.Trainer;

public class DBoperation {

	public void addData(Employee user) throws SQLException {

		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();

		String insertData = "INSERT INTO [dbo].[Employee_Sanzida1]"
				+ "(Employee_Name,Employee_Salary,Employee_Country, Employee_City,Employee_ZipCode) VALUES"
				+ "(?,?,?,?,?)";

		PreparedStatement preparedStatement = dbConnection.prepareStatement(insertData);

		preparedStatement.setString(1, user.getEmployee_Name());
		preparedStatement.setInt(2, user.getEmployee_Salary());
		preparedStatement.setString(3, user.getEmployee_Country());
		preparedStatement.setString(4, user.getEmployee_City());
		preparedStatement.setString(5, user.getEmployee_ZipCode());
		preparedStatement.execute();
		

	}

	public void updateData(Employee user) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();

		String updateData = "UPDATE [dbo].[Employee_Sanzida1]"
				+ "SET Employee_Name = ?, Employee_Salary = ?, Employee_Country=?, Employee_City=?,"
				+ "Employee_ZipCode=? WHERE Employee_ID = ?";

		PreparedStatement preparedStatement = dbConnection.prepareStatement(updateData);

		preparedStatement.setInt(1, user.getEmployee_ID());
		preparedStatement.setString(2, user.getEmployee_Name());
		preparedStatement.setInt(3, user.getEmployee_Salary());
		preparedStatement.setString(4, user.getEmployee_Country());
		preparedStatement.setString(5, user.getEmployee_City());
		preparedStatement.setString(6, user.getEmployee_ZipCode());
		preparedStatement.execute();

	}

	public void deleteData(Employee user) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();
		String deleteData = "DELETE [dbo].[Employee_Sanzida1] WHERE Employee_ID = ?";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(deleteData);
		preparedStatement.setInt(1, user.getEmployee_ID());
		preparedStatement.execute();

	}

	public boolean getFilteredData(Employee user) throws SQLException {
		
		
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();

		//String getData = "SELECT * FROM [dbo].[Employee_Sanzida1] WHERE Employee_ID=?";
		String str="T%";
		String getLikeData = "SELECT Employee_Name FROM [dbo].[Employee_Sanzida1] WHERE Employee_Name LIKE ?;";
		
		PreparedStatement preparedStatement = dbConnection.prepareStatement(getLikeData);
		
		preparedStatement.setString(1,"str");
		preparedStatement.execute();
		
		return preparedStatement.execute();

	}
	
	
	public boolean innerJoinData(Employee user, Trainer trainer) throws SQLException {
		
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();
		

		String getjoinData = "SELECT  \n" + 
				"Name FROM [dbo].[kona_trainer] \n" + 
				"INNER JOIN [dbo].[Employee_Sanzida1] ON [dbo].[Employee_Sanzida1].Employee_ID = [dbo].[kona_trainer].Employee_ID;";
		
		PreparedStatement preparedStatement = dbConnection.prepareStatement(getjoinData);
		return preparedStatement.execute();
		
	}
	
	public boolean leftJoinData(Employee user, Trainer trainer) throws SQLException {
		
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();
		
		String getjoinData = "SELECT  \n" + 
				"Name FROM [dbo].[kona_trainer] \n" + 
				"LEFT JOIN [dbo].[Employee_Sanzida1] ON [dbo].[Employee_Sanzida1].Employee_ID = [dbo].[kona_trainer].Employee_ID;";
		
		PreparedStatement preparedStatement = dbConnection.prepareStatement(getjoinData);
		return preparedStatement.execute();
		
	}
	
	public boolean rightJoinData(Employee user, Trainer trainer) throws SQLException {
		
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();

		String getjoinData = "SELECT  \n" + 
				"Name FROM [dbo].[kona_trainer] \n" + 
				"RIGHT JOIN [dbo].[Employee_Sanzida1] ON [dbo].[Employee_Sanzida1].Employee_ID = [dbo].[kona_trainer].Employee_ID;";
		
		PreparedStatement preparedStatement = dbConnection.prepareStatement(getjoinData);
		return preparedStatement.execute();
		
	}
	
	public boolean fullJoinData(Employee user, Trainer trainer) throws SQLException {
		
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();
		

		String getjoinData = "SELECT  \n" + 
				"[dbo].[kona_trainer].Name \n" + 
				"FULL OUTER JOIN [dbo].[Employee_Sanzida1] ON [dbo].[Employee_Sanzida1].Employee_ID = [dbo].[kona_trainer].Employee_ID "
				+ "ORDER BY [dbo].[kona_trainer].Name;";
		
		PreparedStatement preparedStatement = dbConnection.prepareStatement(getjoinData);
		return preparedStatement.execute();
		
	}

	public boolean selfJoinData(Employee user, Trainer trainer) throws SQLException {
		
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();
		
		String getjoinData = "SELECT  \n" + 
				"[dbo].[kona_trainer].Name \n" + 
				"FULL OUTER JOIN [dbo].[Employee_Sanzida1] ON [dbo].[Employee_Sanzida1].Employee_ID = [dbo].[kona_trainer].Employee_ID "
				+ "ORDER BY [dbo].[kona_trainer].Name;";
		
		PreparedStatement preparedStatement = dbConnection.prepareStatement(getjoinData);
		return preparedStatement.execute();
		
	} 
	
	public boolean getInData(Employee user)  throws SQLException{
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();

	
		String getLikeData = "SELECT Employee_Name FROM [dbo].[Employee_Sanzida1] WHERE Employee_ID IN (? ,?);";
		
		
		PreparedStatement preparedStatement = dbConnection.prepareStatement(getLikeData);
		
		preparedStatement.setInt(1, 2);
		preparedStatement.setInt(2, 4);
	
		return preparedStatement.execute();
	}
	public boolean getBetweenData(Employee user)  throws SQLException{
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();
		
		String getLikeData = "SELECT Employee_Name \n" + 
				"FROM [dbo].[Employee_Sanzida1]\n" + 
				"WHERE Employee_ID BETWEEN ? AND ?;";
		
		
		PreparedStatement preparedStatement = dbConnection.prepareStatement(getLikeData);
		
		preparedStatement.setInt(1, 2);
		preparedStatement.setInt(2, 4);
		
		return preparedStatement.execute();
	}
	
	public boolean getAliasesData(Employee user)  throws SQLException{
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();

		//String getData = "SELECT * FROM [dbo].[Employee_Sanzida1] WHERE Employee_ID=?";
	
		String getLikeData = "SELECT Employee_Name AS ? FROM [dbo].[Employee_Sanzida1] WHERE Employee_Name LIKE ?;";
		
		PreparedStatement preparedStatement = dbConnection.prepareStatement(getLikeData);
		
		preparedStatement.setString(1,"Name");
		preparedStatement.execute();
		
		//ResultSet rs_cust3 = preparedStatement.executeQuery();
		//ResultSetMetaData rsmd=rs_cust3.getMetaData();
		
		return preparedStatement.execute();
	}

}
