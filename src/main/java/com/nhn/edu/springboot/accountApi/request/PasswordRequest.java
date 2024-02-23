package com.nhn.edu.springboot.accountApi.request;

import com.nhn.edu.springboot.accountApi.Account;
import lombok.*;
import org.springframework.web.bind.annotation.RequestBody;



@Getter
@NoArgsConstructor
public class PasswordRequest {
    String password;

}
