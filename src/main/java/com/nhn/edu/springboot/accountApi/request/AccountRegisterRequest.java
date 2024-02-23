package com.nhn.edu.springboot.accountApi.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AccountRegisterRequest {
    private String id;
    private String email;
    private String password;
}
