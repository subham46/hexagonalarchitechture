package com.example.hexagonal.demohexagonal.adapter;

import com.example.hexagonal.demohexagonal.domain.entity.UserAccount;
import com.example.hexagonal.demohexagonal.domain.port.inport.CreateNewAccountPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController{


    private CreateNewAccountPort createNewAccountPort;

    @Autowired
    public AccountController(CreateNewAccountPort createNewAccountPort) {
        this.createNewAccountPort = createNewAccountPort;
    }

    @PostMapping(value = "/newaccount")
    public void createAccount(@RequestBody  UserAccount userAccount){
        createNewAccountPort.create(userAccount);
    }

}
