package com.database.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.database.DAO.employeeDAO;
import com.database.Model.Employee;
import com.database.Model.Trainer;
import com.database.Util.DBoperation;

public class DBimplement implements employeeDAO {

	@Override
	public boolean addUser(Employee user) {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.addData(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean updateUser(Employee user) {

		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.updateData(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteUser(Employee user) {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.deleteData(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}


	@Override
	public Employee getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getFilteredData(Employee user) {
		// TODO Auto-generated method stub
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.getFilteredData(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	
	
	public boolean innerJoinData(Employee user, Trainer trainer) {
		// TODO Auto-generated method stub
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.innerJoinData(user, trainer);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

//	@Override
//	public boolean joinData(Employee user, Trainer trainer) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	public boolean leftJoinData(Employee user, Trainer trainer) {
		// TODO Auto-generated method stub
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.leftJoinData(user, trainer);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean rightJoinData(Employee user, Trainer trainer) {
		// TODO Auto-generated method stub
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.rightJoinData(user, trainer);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean fullJoinData(Employee user, Trainer trainer) {
		// TODO Auto-generated method stub
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.fullJoinData(user, trainer);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean selfJoinData(Employee user, Trainer trainer) {
		// TODO Auto-generated method stub
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.selfJoinData(user, trainer);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}


	public boolean getInData(Employee user) {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.getInData(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean getBetweenData(Employee user) {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.getBetweenData(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean getAliasesData(Employee user) {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.getAliasesData(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	



}
