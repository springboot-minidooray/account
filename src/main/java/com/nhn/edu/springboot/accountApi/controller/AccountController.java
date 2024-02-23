package com.nhn.edu.springboot.accountApi.controller;

import com.nhn.edu.springboot.accountApi.Account;
import com.nhn.edu.springboot.accountApi.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @GetMapping("/accounts")
    public List<Account> getAccounts(){
        return accountService.getAccounts();
    }

    @GetMapping("/accounts/{id}")
    public Account getAccount(@PathVariable String id){
        return accountService.getAccount(id);
    }

    // 가입
    @PostMapping("/accounts")
    @ResponseStatus
    public Account createAccount(@RequestBody Account account){
        return accountService.createAccount(account);
    }
    // 탈퇴
    @DeleteMapping("/accounts/{id}")
    public String deleteAccount(@PathVariable String id){
        accountService.deleteAccount(id);
        return "{\"result\":\"OK\"}";
    }
}
