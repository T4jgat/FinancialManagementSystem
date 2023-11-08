package kz.t4jgat;

import kz.t4jgat.Transactions.Transaction;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

// Data store for transactions
public class DataStore {

    // private instance of DataStore class
    private static DataStore instance;

    // private list of transactions
    private List<Transaction> data;

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
}
