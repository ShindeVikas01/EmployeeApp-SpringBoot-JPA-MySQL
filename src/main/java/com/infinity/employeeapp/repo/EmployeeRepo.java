package com.infinity.employeeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infinity.employeeapp.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer>{

}
