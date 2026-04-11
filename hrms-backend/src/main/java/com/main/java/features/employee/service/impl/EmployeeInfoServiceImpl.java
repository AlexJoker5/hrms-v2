package com.main.java.features.employee.service.impl;

import com.main.java.features.employee.dto.response.EmployeeInfoResponse;
import com.main.java.features.employee.mapper.EmployeeInfoMapper;
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
//	private final AccountRepo accountRepo;
//	private final BCryptPasswordEncoder passwordEncoder;
	private final EmployeeInfoMapper mapper;

	protected EmployeeInfoServiceImpl(EmployeeInfoRepo empInfoRepo, EmployeeInfoMapper mapper) {
		super(empInfoRepo);
		this.empInfoRepo = empInfoRepo;
//		this.accountRepo = accountRepo;
//		this.passwordEncoder = passwordEncoder;
		this.mapper = mapper;
	}

	@Override
	protected EmployeeInfo mapRequestToEntity(EmployeeInfoRequest request) {
		return mapper.toEntity(request);
	}

	@Override
	protected EmployeeInfoResponse mapEntityToResponse(EmployeeInfo entity) {
		return mapper.toResponseDto(entity);
	}

	@Override
	protected void updateEntityFromRequest(EmployeeInfoRequest request, EmployeeInfo entity) {
		mapper.updateEntityFromRequestDto(request, entity);
	}
}
