package com.jspiders.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springmvc.pojo.EmployeePojo;
import com.jspiders.springmvc.repository.EmployeeRepository;
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	public EmployeePojo addEmployee(String name, String email,
									long contact, String designation,
									double salary) {
		EmployeePojo employee =repository.
				addEmployee(name, email, contact, designation, salary);
		return employee;
	}
	}

