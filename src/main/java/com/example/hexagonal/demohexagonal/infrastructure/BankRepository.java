package com.example.hexagonal.demohexagonal.infrastructure;

import com.example.hexagonal.demohexagonal.domain.domainService.CreateNewAccountService;
import com.example.hexagonal.demohexagonal.domain.entity.UserAccount;
import com.example.hexagonal.demohexagonal.domain.port.outport.NewAccountSaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankRepository implements NewAccountSaveRepository {

    private BankJpaRepository bankJpaRepository;

    public BankRepository(BankJpaRepository bankJpaRepository) {
        this.bankJpaRepository = bankJpaRepository;
    }

    @Override
    public void save(UserAccount account) {
        bankJpaRepository.save(account);
    }
}
