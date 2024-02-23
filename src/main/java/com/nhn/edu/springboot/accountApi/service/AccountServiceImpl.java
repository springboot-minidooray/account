package com.nhn.edu.springboot.accountApi.service;

import com.nhn.edu.springboot.accountApi.Account;
import com.nhn.edu.springboot.accountApi.dto.AccountDto;
import com.nhn.edu.springboot.accountApi.repository.AccountRepository;
import com.nhn.edu.springboot.accountApi.request.AccountRegisterRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AccountServiceImpl implements AccountService{
    AccountRepository accountRepository;

    public AccountServiceImpl (AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<AccountDto> getAccounts() {
        return accountRepository.findAllBy();
    }

    @Override
    @Transactional
    public Account createAccount(AccountRegisterRequest accountRegisterRequest) {
        boolean present = accountRepository.findById(accountRegisterRequest.getId()).isPresent();
        if(present) throw new IllegalStateException("already exist " +accountRegisterRequest.getId());
        return accountRepository.save(new Account(
                accountRegisterRequest.getId(),
                accountRegisterRequest.getEmail(),
                accountRegisterRequest.getPassword(),
                "신규"
        ));
    }

    @Override
    @Transactional(readOnly = true)
    public AccountDto getAccount(String id) {
        return accountRepository.findDtoById(id).orElse(null);
    }


    @Override
    @Transactional
    public void deleteAccount(String id) {
    accountRepository.deleteById(id);
    }

    @Override
    public void updatePasswordById(String id, String password) {

        Account account = accountRepository.findById(id).orElseThrow();

        account.setPassword(password);
    }
}
