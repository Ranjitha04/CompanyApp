package com.companyportal.app;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.companyportal.app.entity.Employee;
import com.companyportal.app.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String displayRegistrationForm(Model model) {
		Employee employee = new Employee();	
		
		model.addAttribute("employee", employee);
		return "employeeform";
		
		//return new ModelAndView("employeeform", "employee", employee);
		 
	}
	
	@RequestMapping(value = "/saveData", method = RequestMethod.POST)
	public String saveEmployeeData(@ModelAttribute Employee employee) {
		employeeService.saveEmployeeData(employee);
		
		return "redirect:/employeelist";
	}
	
	@RequestMapping(value = "/employeelist", method = RequestMethod.GET)
	public String getEmployeesData(Model model) {
		ArrayList<Employee> employeeList = employeeService.getEmployeesData();
				
		model.addAttribute("employeeList", employeeList);
		return "employeelist";
	}
}
