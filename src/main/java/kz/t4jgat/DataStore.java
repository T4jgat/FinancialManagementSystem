package kz.t4jgat;

import kz.t4jgat.Transactions.Transaction;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    private static DataStore instance;
    private List<Transaction> data;

    private DataStore() {
        data = new ArrayList<>();
    }

    public static DataStore getInstance() {
        if (instance == null) {
            instance = new DataStore();
        }
        return instance;
    }

    public void addTransaction(Transaction transaction) {
        data.add(transaction);
    }

    public List<Transaction> getData() {
        return data;
    }
}
