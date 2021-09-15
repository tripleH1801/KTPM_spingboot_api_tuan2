package com.example._HaHuyHoang_sping_boot_api.service;

import com.example._HaHuyHoang_sping_boot_api.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee getEmployeeById(int id);
    public List<Employee> getAllEmployee();
    public void addEmployee(Employee e);
    public void updateEmployee(Employee e);
    public void deleteEmployee(int id);
}
