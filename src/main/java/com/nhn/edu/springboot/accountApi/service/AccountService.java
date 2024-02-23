package com.nhn.edu.springboot.accountApi.service;

import com.nhn.edu.springboot.accountApi.Account;
import com.nhn.edu.springboot.accountApi.dto.AccountDto;
import com.nhn.edu.springboot.accountApi.request.AccountRegisterRequest;

import java.util.List;

public interface AccountService {
    List<AccountDto> getAccounts();

    Account createAccount(AccountRegisterRequest accountRegisterRequest);

    AccountDto getAccount(String id);

    void deleteAccount(String id);

    void updatePasswordById(String id, String password);
}
