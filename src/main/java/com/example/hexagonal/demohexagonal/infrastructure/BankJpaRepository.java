package com.example.hexagonal.demohexagonal.infrastructure;
import com.example.hexagonal.demohexagonal.infrastructure.entity.UserJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankJpaRepository extends JpaRepository<UserJpaEntity, Long>{

}
