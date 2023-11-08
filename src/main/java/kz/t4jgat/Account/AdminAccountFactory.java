package kz.t4jgat.Account;

public class AdminAccountFactory implements AccountFactory{
    @Override
    public Account createAccount() {
        return new AdminAccount();
    }
}
