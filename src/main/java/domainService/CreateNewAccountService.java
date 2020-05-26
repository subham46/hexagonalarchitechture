package domainService;

import domain.UserAccount;
import port.inport.CreateNewAccountPort;
import port.outport.NewAccountSaveRepository;

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
