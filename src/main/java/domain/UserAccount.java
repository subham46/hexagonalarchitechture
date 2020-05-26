package domain;



public class UserAccount {

    private long accountId;
    private String name;
    private long balance;

    public UserAccount(long accountId, String name, long balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
