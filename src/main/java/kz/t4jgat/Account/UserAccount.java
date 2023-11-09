package kz.t4jgat.Account;

import kz.t4jgat.DataSources.Discount;
import kz.t4jgat.Notifications.Observer;

import java.util.List;

public class UserAccount implements Account, Observer {
    private String name;
    private String email;
    private double balance;


    public UserAccount(String name, String email, double balance) {
        this.name = name;
        this.email = email;
        this.balance = balance;
    }
    @Override
    public String getAccountType() {
        return "Type: User Account\n" + "Name: " + name + "\n" +
                "Email: " + email;
    }

    @Override
    public void handleEvent(List<Discount> discountsList) {
        Discount discount = discountsList.get(discountsList.size()-1);
        System.out.println("* Dear, " + name + ", new discount int the store: " + discount.getTitle());
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
