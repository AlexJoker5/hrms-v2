package com.main.java.service.account;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.java.entity.Account;
import com.main.java.repository.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepo accountRepo;

	@Override
	public void createUser(Account account) {
		accountRepo.save(account);
	}

	@Override
	public Optional<Account> findByEmpId(UUID empId) {
		return accountRepo.findByEmpId(empId);
	}
	
}
