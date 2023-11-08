package kz.t4jgat.Account;

public class UserAccount implements Account{
    private String name;
    private String email;

    @Override
    public String getAccountType() {
        return "Type: User Account\n" + "Name: " + name + "\n" +
                "Email: " + email;
    }
}
