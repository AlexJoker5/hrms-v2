package com.main.java.features.employee.controller;

import com.main.java.features.employee.dto.request.EmployeeInfoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.java.repository.AccountRepo;
import com.main.java.features.employee.service.impl.EmployeeInfoServiceImpl;


@RestController
@RequestMapping("/api/employee")
@CrossOrigin(origins = "http://localhost:5173")
public class EmployeeInfoController {
	
	@Autowired
	private AccountRepo accountRepo;
	
	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private EmployeeInfoServiceImpl empInfoServiceImpl;
	
	@GetMapping("/register")
	public String getRegisterForm() {
		return "Register Form";
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> registerEmployeeInfo(@RequestBody EmployeeInfoRequest empInfo) {
	    System.out.println("Register endpoint hit!");
		
		try {
			empInfoServiceImpl.create(empInfo);
		} catch (Exception e) {
			throw e;
		}
		return ResponseEntity.ok("Employee created successfully");
	}

}
