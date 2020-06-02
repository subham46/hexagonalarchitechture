package com.example.hexagonal.demohexagonal.infrastructure.entity;


import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "Account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserJpaEntity {

    @Id
    @GeneratedValue
    private Long accountId;
    private String name;
    private Long balance;

    public UserJpaEntity(long accountId, String name, long balance) {
        this.accountId=accountId;
        this.name=name;
        this.balance=balance;
    }
}
