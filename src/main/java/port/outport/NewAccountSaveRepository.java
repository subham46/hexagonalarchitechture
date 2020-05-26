package port.outport;

import domain.UserAccount;

public interface NewAccountSaveRepository {
      void save(UserAccount account);
}
