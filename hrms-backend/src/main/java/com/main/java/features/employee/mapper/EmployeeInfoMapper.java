package com.main.java.features.employee.mapper;

import com.main.java.entity.EmployeeInfo;
import com.main.java.features.employee.dto.request.EmployeeInfoRequest;
import com.main.java.features.employee.dto.response.EmployeeInfoResponse;
import com.main.java.mapper.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeInfoMapper extends BaseMapper<EmployeeInfo, EmployeeInfoRequest, EmployeeInfoResponse> {
}
