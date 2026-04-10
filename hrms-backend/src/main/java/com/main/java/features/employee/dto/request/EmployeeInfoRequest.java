package com.main.java.features.employee.dto.request;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
public class EmployeeInfoRequest {

	/*
	 * Employee ID
	 */
	private UUID empId;

	/*
	 * Employee Code (E.g. EMP001)
	 * It's used in employee's card
	 * 6 digits Employee System ID
	 */
	@NotEmpty(message = "Employee ID must not be empty")
	@Size(max = 6)
	private String employeeCode;

	/*
	 * Employee Status (E.g. Active, Resigned, Terminated)
	 */
	@NotEmpty(message = "Status must not be empty")
	@Size(max = 15, message = "Status length must not be greater than 15")
	private String status;

	@NotEmpty(message = "Join Date must not be empty")
	private LocalDateTime joinDate;
	
	private LocalDateTime resignDate;

	@NotEmpty(message = "Password must not be empty")
	@Size(min = 8, max = 32, message = "Password must be between 8 and 32 characters")
	@Pattern(
			regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
			message = "Password must contain at least one digit, one lowercase, one uppercase, and one special character"
	)
	private String password;

	@NotEmpty(message = "Role must not be empty")
	private String role;

}
