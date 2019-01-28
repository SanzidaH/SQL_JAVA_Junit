package com.database.DAO;

import java.sql.ResultSet;
import java.util.List;

import com.database.Model.Employee;
import com.database.Model.Trainer;

public interface employeeDAO {
	
	boolean addUser(Employee user);

	boolean updateUser(Employee user);

	boolean deleteUser(Employee user);

	Employee getUser(int userId);
	
	//ResultSet getData(); 
	
	boolean getFilteredData(Employee user);
	
	boolean innerJoinData(Employee user, Trainer trainer);
	boolean leftJoinData(Employee user, Trainer trainer);
	boolean rightJoinData(Employee user, Trainer trainer);
	boolean selfJoinData(Employee user, Trainer trainer);
	boolean fullJoinData(Employee user, Trainer trainer);
	
	boolean getInData(Employee user);
	boolean getBetweenData(Employee user);
	boolean getAliasesData(Employee user);


}
