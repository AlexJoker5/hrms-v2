package com.main.java.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "account_id")
	private UUID accountId;
	
	@Column(name = "emp_id")
	private UUID empId;
	
	private String password;
	
	private String role;
	
	private String status;

}
