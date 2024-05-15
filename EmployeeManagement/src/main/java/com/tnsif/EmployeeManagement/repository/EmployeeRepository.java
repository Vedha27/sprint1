package com.tnsif.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.EmployeeManagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
