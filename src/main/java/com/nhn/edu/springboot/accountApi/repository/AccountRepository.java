package com.nhn.edu.springboot.accountApi.repository;

import com.nhn.edu.springboot.accountApi.Account;
import com.nhn.edu.springboot.accountApi.dto.AccountDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, String> {
    Optional<AccountDto> findDtoById(String id);
    List<AccountDto> findAllBy();

}
