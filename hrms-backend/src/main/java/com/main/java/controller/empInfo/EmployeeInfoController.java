package com.main.java.controller.empInfo;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.java.exceptions.AlreadyExistsException;
import com.main.java.repository.AccountRepo;
import com.main.java.service.employeeInfo.EmployeeInfoServiceImpl;


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
	
	@PostMapping("/register")
	public String registerEmployeeInfo(@RequestBody EmployeeInfoForm empInfo) {
		
		if(empInfo.getEmpId() != null && accountRepo.findByEmpId(empInfo.getEmpId()).isPresent()) {
			throw new AlreadyExistsException(messageSource.getMessage(
					"employee_already_exists", 
					new Object[] { empInfo.getEmpId() },
					Locale.getDefault()));
		}
		
		try {
			empInfoServiceImpl.createEmployee(empInfo);
		} catch (Exception e) {
			throw e;
		}
		
		
		return "";
	}

}
