package com.main.java.service;

import java.util.Optional;
import java.util.UUID;

import com.main.java.entity.Account;

public interface AccountService {

	void createUser(Account account);
	
	Optional<Account> findByEmpId(UUID empId);

}
