package com.example.hexagonal.demohexagonal.domain.domainService;

import com.example.hexagonal.demohexagonal.domain.entity.UserAccount;
import com.example.hexagonal.demohexagonal.domain.port.inport.CreateNewAccountPort;
import com.example.hexagonal.demohexagonal.domain.port.outport.NewAccountSaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CreateNewAccountService implements CreateNewAccountPort {

    private NewAccountSaveRepository newAccountSaveRepository;


    public CreateNewAccountService(NewAccountSaveRepository newAccountSaveRepository) {
        this.newAccountSaveRepository = newAccountSaveRepository;
    }

    @Override
    public void create(UserAccount account) {

        newAccountSaveRepository.save(account);



    }
}
