package kz.t4jgat.Account;

public class AdminAccount implements Account{
    private String name;
    private int id;

    @Override
    public String getAccountType() {
        return "Type: Admin Account\n" +
                "Name: " + name + "\n" +
                "ID: " + id;
    }
}
