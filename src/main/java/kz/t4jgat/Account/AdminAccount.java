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

    @Override
    public void setBalance(double balance) {

    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public String getName() {
        return name;
    }
}
