package com.nhn.edu.springboot.accountApi;

import com.nhn.edu.springboot.accountApi.repository.AccountRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;
    @Test
    void testStudentRepository() {
        //given
        Account sangwoo = new Account(1L, "sangwoo", 10000L);
        Account joohyeon = new Account(2L,"joohyeon",20000L);
        Account sungjoon = new Account(3L,"sungjoon",33333L);
        accountRepository.save(sangwoo);
        accountRepository.save(joohyeon);
        accountRepository.save(sungjoon);

        //when
        Optional<Account> actual= accountRepository.findById(1L);
        //then
        Assertions.assertThat(actual).isPresent();
        Assertions.assertThat(actual.get()).isEqualTo(sangwoo);

    }
}