package com.companyportal.app.dao.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.companyportal.app.dao.EmployeeDao;
import com.companyportal.app.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	private ArrayList<Employee> employeeList = new ArrayList<Employee>();

	@Override
	public void saveEmployeeData(Employee employee) {
		employeeList.add(employee);
	}

	@Override
	public ArrayList<Employee> getEmployeesData() {
		return employeeList;
	}

}
