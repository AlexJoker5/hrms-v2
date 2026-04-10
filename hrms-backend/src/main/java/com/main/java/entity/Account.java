package com.main.java.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "account")
@Getter
@Setter
public class Account extends BaseEntity{
	
	@Column(name = "emp_id")
	private UUID empId;
	
	private String password;
	
	private String role;
	
	private String status;

}
