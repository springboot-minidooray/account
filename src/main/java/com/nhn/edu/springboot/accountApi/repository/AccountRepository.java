package com.nhn.edu.springboot.accountApi.repository;

import com.nhn.edu.springboot.accountApi.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, String> {

}
