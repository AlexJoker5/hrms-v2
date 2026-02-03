package com.main.java.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.java.common.CommonConstants;
import com.main.java.controller.empInfo.EmployeeInfoForm;
import com.main.java.entity.Account;
import com.main.java.entity.EmployeeInfo;
import com.main.java.repository.AccountRepo;
import com.main.java.repository.EmployeeInfoRepo;
import com.main.java.service.EmployeeInfoService;

@Service
public class EmployeeInfoServiceImpl implements EmployeeInfoService{
	
	@Autowired
	EmployeeInfoRepo empInfoRepo;
	
	@Autowired
	AccountRepo accountRepo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	@Transactional
	public void createEmployee(EmployeeInfoForm form) {
		
		EmployeeInfo empInfo = new EmployeeInfo();
		
		empInfo.setEmployeeCode(form.getEmployeeCode());
		empInfo.setJoinDate(form.getJoinDate());
		empInfo.setResignDate(null);
		empInfo.setStatus(CommonConstants.EMP_INACTIVE);
		
		EmployeeInfo createdEmpInfo = empInfoRepo.save(empInfo);
		
		
		Account account = new Account();
		
		account.setEmpId(createdEmpInfo.getEmpId());
		account.setPassword(passwordEncoder.encode(form.getPassword()));
		account.setRole(CommonConstants.ROLE_EMPLOYEE);
		account.setStatus(CommonConstants.ACC_INVITED);
		
		accountRepo.save(account);
		
	}

}
