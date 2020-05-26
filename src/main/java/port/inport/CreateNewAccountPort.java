package port.inport;

import domain.UserAccount;

import javax.jws.soap.SOAPBinding;

public interface CreateNewAccountPort {
    void create(UserAccount account);
}
