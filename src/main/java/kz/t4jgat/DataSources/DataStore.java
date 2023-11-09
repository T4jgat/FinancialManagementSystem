package kz.t4jgat.DataSources;

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

    private List<Discounts> discounts;

    private List<Observer> users = new ArrayList<>();

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

    // add new transaction to the list
    public void addTransaction(Transaction transaction) {
        data.add(transaction);
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
