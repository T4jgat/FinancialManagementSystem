package kz.t4jgat.DataSources;

import kz.t4jgat.Account.Account;
import kz.t4jgat.Account.UserAccount;
import kz.t4jgat.Notifications.Observed;
import kz.t4jgat.Notifications.Observer;
import kz.t4jgat.Transactions.Transaction;

import java.util.ArrayList;
import java.util.List;

// Data store for transactions
public class DataStore implements Observed, DataSource {

    // private instance of DataStore class
    private static DataStore instance;

    // private list of transactions
    private List<Transaction> data;

    private List<Discount> discounts = new ArrayList<>();

    private List<Observer> users = new ArrayList<>();
    {
        for (int i = 0; i < 3; i++) {
            users.add(new UserAccount("user"+i, "user"+i+"email.ru", i+0.54));
        }
    }

    // initialize new data store
    private DataStore() {
        data = new ArrayList<>();
    }

    // singleton initializing method
    public static DataStore getInstance() {
        if (instance == null) {
            synchronized (DataStore.class) {
                if (instance == null) {
                    instance = new DataStore();
                }
            }
        }
        return instance;
    }

    @Override
    public void setUser(Account user) {
        users.add((Observer) user);
    }


    // add new transaction to the list
    public void addDiscount(Discount discount) {
        discounts.add(discount);
        notifyObservers();
    }

    @Override
    public void addTransaction(Account account, Transaction transaction) {
        data.add(transaction);
        String formatAmount = String.format("%.2f", transaction.getAmount());
        System.out.println("\n=== " +
                account.getName() + " made a transaction for the amount " + formatAmount
                + " ===\n");
    }

    // get list of transactions
    public List<Transaction> getData() {
        return data;
    }

    @Override
    public void addObserver(Observer observer) {
        this.users.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.users.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : users) {
            observer.handleEvent(this.discounts);
        }
    }
}
