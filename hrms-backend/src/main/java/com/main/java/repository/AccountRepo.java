package com.main.java.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.java.entity.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, UUID>{

}
