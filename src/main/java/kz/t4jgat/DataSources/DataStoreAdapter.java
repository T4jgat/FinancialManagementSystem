package kz.t4jgat.DataSources;

import kz.t4jgat.Account.Account;
import kz.t4jgat.Transactions.Transaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStoreAdapter implements DataSource{

    private LegacyDataStore instance;

    public DataStoreAdapter(LegacyDataStore instance) {
        this.instance = instance;
    }

    @Override
    public void addTransaction(Account account, Transaction transaction) {
    }

    @Override
    public List<Transaction> getData() {
        return new ArrayList<>(Arrays.asList(instance.getData()));
    }

    @Override
    public void setUser(Account user) {

    }
}