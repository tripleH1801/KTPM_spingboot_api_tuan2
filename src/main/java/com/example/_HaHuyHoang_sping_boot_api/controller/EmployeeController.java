package com.example._HaHuyHoang_sping_boot_api.controller;

import com.example._HaHuyHoang_sping_boot_api.entity.Employee;
import com.example._HaHuyHoang_sping_boot_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee")
    public Employee getEmployeeById(@RequestParam("id") int id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public void addEmployee(@RequestBody Employee e) {
        employeeService.addEmployee(e);
    }

    @PutMapping
    public void saveUpdateGv(@RequestBody Employee e) {
        Employee employe = employeeService.getEmployeeById(e.getId());
        if(employe == null) {
            System.out.println("Employee not found!!!");
            return;
        }
        employeeService.updateEmployee(e);
        System.out.println("update successfully");
    }

    @DeleteMapping
    public void deleteGv(@RequestParam("id") int id) {
        employeeService.deleteEmployee(id);
    }
}
