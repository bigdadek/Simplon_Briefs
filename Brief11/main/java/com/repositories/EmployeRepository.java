package com.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.models.Employee;

public interface EmployeRepository extends JpaRepository<Employee, Long> {

	Page<Employee> findByNomContains(String keyword, Pageable  pageable);
	
}
