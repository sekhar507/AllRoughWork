package com.journaldev.spring.jdbc.dao;

import java.util.List;

import com.journaldev.spring.jdbc.model.Employee;

//CRUD operations
public interface EmployeeDAO {
	
	//Create
	public void save(Employee employee);
	
}
