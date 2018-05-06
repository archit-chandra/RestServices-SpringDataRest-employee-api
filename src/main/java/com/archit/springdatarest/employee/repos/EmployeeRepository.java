package com.archit.springdatarest.employee.repos;

import com.archit.springdatarest.employee.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
