package com.main.java.controller.empInfo;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeInfoForm {
	
	/*
	 * Employee ID (E.g. 012345)
	 * 6 digits Employee System ID
	 */
	private UUID empId;
	
	/*
	 * Employee Code (E.g. EMP001) 
	 * It's used in employee's card
	 */
	private String employeeCode;
	
	/*
	 * Employee Status (E.g. Active, Resigned, Terminated)
	 */
	private String status;
	
	private LocalDateTime joinDate;
	
	private LocalDateTime resignDate;
	
	private String password;
	
	private String role;
	
	
	
	
	
	

}
