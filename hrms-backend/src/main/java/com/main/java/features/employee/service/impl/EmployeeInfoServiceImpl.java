package com.main.java.features.employee.service.impl;

import com.main.java.features.employee.dto.response.EmployeeInfoResponse;
import com.main.java.features.employee.service.EmployeeInfoService;
import com.main.java.service.impl.BaseServiceImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.main.java.features.employee.dto.request.EmployeeInfoRequest;
import com.main.java.entity.EmployeeInfo;
import com.main.java.repository.AccountRepo;
import com.main.java.repository.EmployeeInfoRepo;

@Service
public class EmployeeInfoServiceImpl extends BaseServiceImpl<EmployeeInfo, EmployeeInfoRequest, EmployeeInfoResponse>
		implements EmployeeInfoService {

	private final EmployeeInfoRepo empInfoRepo;
	private final AccountRepo accountRepo;
	private final BCryptPasswordEncoder passwordEncoder;

	protected EmployeeInfoServiceImpl(EmployeeInfoRepo empInfoRepo, AccountRepo accountRepo, BCryptPasswordEncoder passwordEncoder) {
		super(empInfoRepo);
		this.empInfoRepo = empInfoRepo;
		this.accountRepo = accountRepo;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	protected EmployeeInfo mapRequestToEntity(EmployeeInfoRequest employeeInfoRequest) {
		return null;
	}

	@Override
	protected EmployeeInfoResponse mapEntityToResponse(EmployeeInfo entity) {
		return null;
	}

	@Override
	protected void updateEntityFromRequest(EmployeeInfo entity, EmployeeInfoRequest employeeInfoRequest) {

	}
}
