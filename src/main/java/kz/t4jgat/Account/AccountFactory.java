package kz.t4jgat.Account;

public interface AccountFactory {
    Account createAccount(String name, String email, double balance);
}
