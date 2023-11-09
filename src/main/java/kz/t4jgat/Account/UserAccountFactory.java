package kz.t4jgat.Account;

public class UserAccountFactory implements AccountFactory {
    @Override
    public Account createAccount(String name, String email, double balance) {
        return new UserAccount(name, email, balance);
    }
}
