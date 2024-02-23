package com.nhn.edu.springboot.accountApi;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Account {

    @Id
    public String id;
    public String email;
    public String password;

}
