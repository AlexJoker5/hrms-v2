package com.main.java.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee_info")
@Getter
@Setter
public class EmployeeInfo extends BaseEntity{
	
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
