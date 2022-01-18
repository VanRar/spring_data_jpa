package org.vanrar.spring.jpa.spring_data_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vanrar.spring.jpa.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);
}