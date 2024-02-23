package com.nhn.edu.springboot.accountApi;

import com.nhn.edu.springboot.accountApi.repository.AccountRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

//@SpringBootTest
//class AccountRepositoryTest {
//
//    @Autowired
//    AccountRepository accountRepository;
//    @Test
//    void testStudentRepository() {
//        //given
//        Account sangwoo = new Account("1", "sangwoo", "10000", "");
//        Account joohyeon = new Account("2","joohyeon","20000", "");
//        Account sungjoon = new Account("3","sungjoon","33333", "");
//        accountRepository.save(sangwoo);
//        accountRepository.save(joohyeon);
//        accountRepository.save(sungjoon);
//
//        //when
//        Optional<Account> actual= accountRepository.findById("1");
//        //then
//        Assertions.assertThat(actual).isPresent();
//        Assertions.assertThat(actual.get()).isEqualTo(sangwoo);
//
//    }
//}