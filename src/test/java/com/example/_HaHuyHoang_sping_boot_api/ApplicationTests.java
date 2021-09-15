package com.example._HaHuyHoang_sping_boot_api;

import com.example._HaHuyHoang_sping_boot_api.entity.Employee;
import com.example._HaHuyHoang_sping_boot_api.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private EmployeeService employeeService;

	@Test
	public void getAllEmployee(){
		System.out.println(employeeService.getAllEmployee());
	}

	@Test
	public void addEmployee(){
		employeeService.addEmployee(new Employee());
	}
}
