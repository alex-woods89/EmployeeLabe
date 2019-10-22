package com.codeclan.employeelab;

import com.codeclan.employeelab.models.Department;
import com.codeclan.employeelab.models.Employee;
import com.codeclan.employeelab.models.Project;
import com.codeclan.employeelab.repositories.DepartmentRepository;
import com.codeclan.employeelab.repositories.EmployeeRepository;
import com.codeclan.employeelab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeelabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartmentAndProject(){
		Project project = new Project("Secret Project", 100);
		Department department = new Department("IT");
		Employee employee = new Employee("Tony", "Brown", 123, department);

		departmentRepository.save(department);
		employeeRepository.save(employee);

		project.addEmployee(employee);
		projectRepository.save(project);
	}



}
