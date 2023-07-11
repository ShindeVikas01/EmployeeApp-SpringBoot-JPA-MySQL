package com.infinity.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infinity.employeeapp.entity.EmployeeEntity;
import com.infinity.employeeapp.model.EmployeeModel;
import com.infinity.employeeapp.service.IEmployeeInterface;

@RestController
@RequestMapping("/employeeapp")
public class EmployeeController {

	@Autowired
	IEmployeeInterface iemployee;
	@GetMapping("/home")
	public String home() {
		return "Welcome to Employee App";
	}
	
	@PostMapping("/addemployee")
	public String addemployee(@RequestBody EmployeeModel employeemodel) {
		return iemployee.addemployee(employeemodel);
	}
	@GetMapping("/getallemployee")
	public ResponseEntity<List<EmployeeEntity>> getallemployee(){
		return new ResponseEntity<List<EmployeeEntity>>(iemployee.getallemployee(), HttpStatus.ACCEPTED);
	}
	@GetMapping("/getemployeebyid/{eid}")
	public EmployeeEntity getemployeebyid(@PathVariable("eid") int eid) {
		return iemployee.getemployeebyid(eid);
	}
}
