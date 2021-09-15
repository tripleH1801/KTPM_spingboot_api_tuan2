package com.example._HaHuyHoang_sping_boot_api.service;

import com.example._HaHuyHoang_sping_boot_api.entity.Employee;
import com.example._HaHuyHoang_sping_boot_api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceEmpl implements EmployeeService{
    @Autowired
    private EmployeeRepository REPOSITORY;

    @Override
    public Employee getEmployeeById(int id) {
        return REPOSITORY.getById(id);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return REPOSITORY.findAll();
    }

    @Override
    public void addEmployee(Employee e) {
        REPOSITORY.save(e);
    }

    @Override
    public void updateEmployee(Employee e) {
        REPOSITORY.save(e);
    }

    @Override
    public void deleteEmployee(int id) {
        REPOSITORY.deleteById(id);
    }
}
