package com.surya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
