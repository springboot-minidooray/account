package com.nhn.edu.springboot.accountApi;

import com.nhn.edu.springboot.accountApi.service.AccountService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AccountApiApplicationTests {

	@Autowired
	AccountService accountService;

	@Test
	void testContextLoads() {
		// when
		List<Account> actual = accountService.getAccounts();
		// then
		Assertions.assertThat(actual).hasSize(2);
	}

}
