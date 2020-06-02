package com.example.hexagonal.demohexagonal.infrastructure;

import com.example.hexagonal.demohexagonal.domain.entity.UserAccount;
import com.example.hexagonal.demohexagonal.domain.port.outport.NewAccountSaveRepository;
import com.example.hexagonal.demohexagonal.infrastructure.entity.UserJpaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class BankRepository implements NewAccountSaveRepository {

    private BankJpaRepository bankJpaRepository;

    @Autowired
    public BankRepository(BankJpaRepository bankJpaRepository) {
        this.bankJpaRepository = bankJpaRepository;
    }

    @Override
    public void save(UserAccount u){
        UserJpaEntity UJE = new UserJpaEntity(u.getAccountId(),u.getName(),u.getBalance());

        bankJpaRepository.save(UJE);
    }
}
