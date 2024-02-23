package com.nhn.edu.springboot.accountApi.service;

import com.nhn.edu.springboot.accountApi.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAccounts();

    Account createAccount(Account account);

    Account getAccount(String id);

    void deleteAccount(String id);
}
