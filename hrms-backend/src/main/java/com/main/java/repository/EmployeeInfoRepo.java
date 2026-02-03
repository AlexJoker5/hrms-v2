package com.main.java.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.java.entity.EmployeeInfo;

@Repository
public interface EmployeeInfoRepo extends JpaRepository<EmployeeInfo, UUID>{

}
