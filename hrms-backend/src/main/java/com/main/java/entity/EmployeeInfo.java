package com.main.java.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EmployeeInfo extends BaseEntity{
	
	/*
	 * Employee ID (E.g. 012345)
	 * 6 digits Employee System ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "emp_id")
	private UUID empId;
	
	/*
	 * Employee Code (E.g. EMP001) 
	 * It's used in employee's card
	 */
	@Column(name = "emp_code", unique = true)
	private String employeeCode;
	
	/*
	 * Employee Status (E.g. Active, Resigned, Terminated)
	 */
	private String status;
	
	@Column(name = "join_date")
	private LocalDateTime joinDate;
	
	@Column(name = "resign_date")
	private LocalDateTime resignDate;

}
