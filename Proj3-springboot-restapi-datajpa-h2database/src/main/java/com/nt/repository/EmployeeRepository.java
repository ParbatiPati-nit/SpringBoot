package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.enity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}