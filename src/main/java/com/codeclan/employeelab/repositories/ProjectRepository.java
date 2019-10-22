package com.codeclan.employeelab.repositories;

import com.codeclan.employeelab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
