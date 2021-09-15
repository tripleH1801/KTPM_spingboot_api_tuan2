package com.example._HaHuyHoang_sping_boot_api.repository;

import com.example._HaHuyHoang_sping_boot_api.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
