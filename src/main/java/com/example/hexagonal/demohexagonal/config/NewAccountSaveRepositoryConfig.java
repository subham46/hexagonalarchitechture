package com.example.hexagonal.demohexagonal.config;

import com.example.hexagonal.demohexagonal.domain.port.outport.NewAccountSaveRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = NewAccountSaveRepository.class)
public class NewAccountSaveRepositoryConfig {
}
