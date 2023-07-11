package com.infinity.employeeapp.service;

import java.util.List;

import com.infinity.employeeapp.entity.EmployeeEntity;
import com.infinity.employeeapp.model.EmployeeModel;

public interface IEmployeeInterface {
	
	public String addemployee(EmployeeModel employeeModel);
	public List<EmployeeEntity> getallemployee();
	public EmployeeEntity getemployeebyid(int eid);
}
