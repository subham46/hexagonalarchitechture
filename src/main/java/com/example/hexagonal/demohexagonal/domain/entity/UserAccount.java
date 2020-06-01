package com.example.hexagonal.demohexagonal.domain.entity;


import lombok.Getter;
import org.springframework.data.annotation.Id;

@Getter
public class UserAccount {

    @Id
    private long accountId;
    private String name;
    private long balance;

    public UserAccount(long accountId, String name, long balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }


}
