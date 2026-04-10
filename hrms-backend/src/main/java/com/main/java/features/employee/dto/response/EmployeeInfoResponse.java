package com.main.java.features.employee.dto.response;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class EmployeeInfoResponse {

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
