package kz.t4jgat.Account;

public class UserAccountFactory implements AccountFactory {
    @Override
    public Account createAccount() {
        return new UserAccount();
    }
}
