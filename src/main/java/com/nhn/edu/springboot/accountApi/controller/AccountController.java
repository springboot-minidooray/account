package com.nhn.edu.springboot.accountApi.controller;

import com.nhn.edu.springboot.accountApi.Account;
import com.nhn.edu.springboot.accountApi.dto.AccountDto;
import com.nhn.edu.springboot.accountApi.request.AccountRegisterRequest;
import com.nhn.edu.springboot.accountApi.request.PasswordRequest;
import com.nhn.edu.springboot.accountApi.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @GetMapping("/accounts")
    public List<AccountDto> getAccounts(){
        return accountService.getAccounts();
    }

    @GetMapping("/accounts/{id}")
    public AccountDto getAccount(@PathVariable String id){
        return accountService.getAccount(id);
    }

    // 가입
    @PostMapping("/accounts")
    @ResponseStatus(HttpStatus.CREATED)
    public Account createAccount(@RequestBody AccountRegisterRequest accountRegisterRequest){
        return accountService.createAccount(accountRegisterRequest);
    }

    // 수정
    @PutMapping("/accounts/{id}")
    public void updateAccount(@PathVariable String id,
                              @RequestBody PasswordRequest passwordRequest){
        accountService.updatePasswordById(id,passwordRequest.getPassword());
    }


    // 탈퇴
    @DeleteMapping("/accounts/{id}")
    public String deleteAccount(@PathVariable String id){
        accountService.deleteAccount(id);
        return "{\"result\":\"OK\"}";
    }
}
