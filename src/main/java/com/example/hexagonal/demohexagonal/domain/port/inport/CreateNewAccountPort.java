package com.example.hexagonal.demohexagonal.domain.port.inport;

import com.example.hexagonal.demohexagonal.domain.entity.UserAccount;

public interface CreateNewAccountPort {
    void create(UserAccount account);
}
