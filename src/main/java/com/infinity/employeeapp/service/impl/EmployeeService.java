package com.infinity.employeeapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinity.employeeapp.entity.EmployeeEntity;
import com.infinity.employeeapp.model.EmployeeModel;
import com.infinity.employeeapp.repo.EmployeeRepo;
import com.infinity.employeeapp.service.IEmployeeInterface;

@Service
public class EmployeeService implements IEmployeeInterface {

	@Autowired
	EmployeeRepo emprepo;
	@Override
	public String addemployee(EmployeeModel employeeModel) {
		EmployeeEntity employeeEntity= new EmployeeEntity();
		employeeEntity.setEid(employeeModel.getEid());
		employeeEntity.setName(employeeModel.getName());
		employeeEntity.setDepartment(employeeModel.getDepartment());
		employeeEntity.setSalary(employeeModel.getSalary());
		employeeEntity.setDoj(employeeModel.getDoj());
		employeeEntity.setAge(employeeModel.getAge());
		emprepo.save(employeeEntity);
		return "Data Added Successfully";
	}
	@Override
	public List<EmployeeEntity> getallemployee() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}
	@Override
	public EmployeeEntity getemployeebyid(int eid) {
		// TODO Auto-generated method stub
		return emprepo.getEmployeeEmployeeEntityByEid(eid);
	}

}
