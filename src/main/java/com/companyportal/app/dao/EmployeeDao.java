package com.companyportal.app.dao;

import java.util.ArrayList;

import com.companyportal.app.entity.Employee;

public interface EmployeeDao {

	void saveEmployeeData(Employee employee);

	ArrayList<Employee> getEmployeesData();

}
