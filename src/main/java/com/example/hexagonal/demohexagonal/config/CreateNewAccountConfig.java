package com.example.hexagonal.demohexagonal.config;

import com.example.hexagonal.demohexagonal.domain.domainService.CreateNewAccountService;
import com.example.hexagonal.demohexagonal.domain.port.inport.CreateNewAccountPort;
import com.example.hexagonal.demohexagonal.domain.port.outport.NewAccountSaveRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateNewAccountConfig {

    @Bean
    CreateNewAccountPort createNewAccountPort(NewAccountSaveRepository newAccountSaveRepository){
        return new CreateNewAccountService(newAccountSaveRepository);
    }

}
