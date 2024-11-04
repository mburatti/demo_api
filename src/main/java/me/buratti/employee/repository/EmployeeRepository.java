package me.buratti.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import me.buratti.demo_api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
