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
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID empId;
	
	private String employeeCode;
	
	/*
	 * Employee Status (E.g. Active, Resigned, Terminated)
	 */
	private String status;
	
	private LocalDateTime joinDate;
	
	private LocalDateTime resignDate;

}
