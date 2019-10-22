package com.codeclan.employeelab.repositories;

import com.codeclan.employeelab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
