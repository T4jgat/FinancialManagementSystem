package kz.t4jgat.DataSources;

import kz.t4jgat.Transactions.Transaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStoreAdapter implements DataSource {

    private final LegacyDataStore legacyDataStore;

    public DataStoreAdapter(LegacyDataStore legacyDataStore) {
        this.legacyDataStore = legacyDataStore;
    }

    @Override
    public DataStore getInstance() {
        return null;
    }

    @Override
    public void addTransaction(Transaction transaction) {
    }

    @Override
    public List<Transaction> getData() {
        Transaction[] data = legacyDataStore.getData();
        return new ArrayList<>(Arrays.asList(data));
    }
}