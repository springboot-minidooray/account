package com.nhn.edu.springboot.accountApi.service;

import com.nhn.edu.springboot.accountApi.Account;
import com.nhn.edu.springboot.accountApi.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService{
    AccountRepository accountRepository;

    public AccountServiceImpl (AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    @Transactional
    public Account createAccount(Account account) {
        boolean present = accountRepository.findById(account.getId()).isPresent();
        if(present) throw new IllegalStateException("already exist " +account.getId());
        return accountRepository.save(account);
    }

    @Override
    @Transactional(readOnly = true)
    public Account getAccount(String id) {
        return accountRepository.findById(id).orElseThrow();
    }

    @Override
    @Transactional
    public void deleteAccount(String id) {
    accountRepository.deleteById(id);
    }
}
