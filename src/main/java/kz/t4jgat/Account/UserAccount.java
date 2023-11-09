package kz.t4jgat.Account;

import kz.t4jgat.DataSources.Discounts;
import kz.t4jgat.Notifications.Observer;
import kz.t4jgat.Transactions.Transaction;

import java.util.List;

public class UserAccount implements Account, Observer {
    private String name;
    private String email;

    @Override
    public String getAccountType() {
        return "Type: User Account\n" + "Name: " + name + "\n" +
                "Email: " + email;
    }

    @Override
    public void handleEvent(List<Discounts> discountsList) {
        Discounts discount = discountsList.get(discountsList.size()-1);
        System.out.println("* Dear, " + name + "you made a purchase for the amount: " + discount.getDiscountType());
    }
}
