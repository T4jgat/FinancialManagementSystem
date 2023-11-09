package kz.t4jgat.Account;

public class AdminAccountFactory implements AccountFactory{
    @Override
    public Account createAccount(String name, String email, double balance) {
        return new AdminAccount();
    }
}
