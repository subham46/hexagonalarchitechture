package com.example.hexagonal.demohexagonal.domain.port.outport;

import com.example.hexagonal.demohexagonal.domain.entity.UserAccount;

public interface NewAccountSaveRepository {
      void save(UserAccount userAccount);
}
