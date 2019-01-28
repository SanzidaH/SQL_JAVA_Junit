package com.database.DAO;

import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.*;

import com.database.Model.Employee;
import com.database.Model.Trainer;
import com.database.Service.DBimplement;

public class employeeDAOTest {

	@Test
	public void testADDdata() {
		Employee employee = new Employee();
		employee.setEmployee_Name("Sanzida");
		employee.setEmployee_Salary(30003);
		employee.setEmployee_Country("Bangladesh");
		//employee.setEmployee_City("Dhaka");
		employee.setEmployee_City("Dhaka");
		employee.setEmployee_ZipCode("1207");

		DBimplement db = new DBimplement();
		assertEquals(true, db.addUser(employee));

	}

	@Test
	public void testUpdateData() {
		Employee employee = new Employee();
		employee.setEmployee_Name("Kona");
		employee.setEmployee_Salary(35000);
		employee.setEmployee_Country("Bangladesh");
		employee.setEmployee_City("Dhaka");
		employee.setEmployee_ZipCode("1207");

		DBimplement db = new DBimplement();
		assertEquals(true, db.updateUser(employee));

	}

	@Test
	public void testDeleteData() {
		Employee employee = new Employee();
		employee.setEmployee_ID(1);
		DBimplement db = new DBimplement();
		assertEquals(true, db.deleteUser(employee));

	}
	
	@Test
	public void testGetFilteredData() throws SQLException {
		DBimplement db = new DBimplement();
		Employee employee = new Employee();
		assertTrue(db.getFilteredData(employee));
		

	}
	
	
	@Test
	public void testInnerJoinData() throws SQLException {
		DBimplement db = new DBimplement();
		Employee employee = new Employee();
		Trainer trainer = new Trainer();
		assertTrue(db.innerJoinData(employee, trainer));

	}
	
	@Test
	public void testLeftJoinData() throws SQLException {
		DBimplement db = new DBimplement();
		Employee employee = new Employee();
		Trainer trainer1 = new Trainer();
		assertTrue(db.leftJoinData(employee, trainer1));

	}

	@Test
	public void testRightJoinData() throws SQLException {
		DBimplement db = new DBimplement();
		Employee employee = new Employee();
		Trainer trainer1 = new Trainer();
		assertTrue(db.rightJoinData(employee, trainer1));

	}
	
	@Test
	public void testFullJoinData() throws SQLException {
		DBimplement db = new DBimplement();
		Employee employee = new Employee();
		Trainer trainer1 = new Trainer();
		assertTrue(db.fullJoinData(employee, trainer1));
	}
	
	@Test
	public void testSelfJoinData() throws SQLException {
		DBimplement db = new DBimplement();
		Employee employee = new Employee();
		Trainer trainer1 = new Trainer();
		assertTrue(db.selfJoinData(employee, trainer1));
		

	}


	
}
