package com.example.springbootgraphql.repository;

import com.example.springbootgraphql.entities.Department;
import com.example.springbootgraphql.entities.Employee;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends
        CrudRepository<Employee, Integer>, JpaSpecificationExecutor<Employee> {
}
