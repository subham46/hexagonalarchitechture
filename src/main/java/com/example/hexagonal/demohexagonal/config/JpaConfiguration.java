package com.example.hexagonal.demohexagonal.config;

import com.example.hexagonal.demohexagonal.infrastructure.BankJpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = BankJpaRepository.class)
public class JpaConfiguration {
}
