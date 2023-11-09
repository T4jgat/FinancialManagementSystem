package kz.t4jgat.DataSources;

import kz.t4jgat.Transactions.Transaction;

import java.util.List;

public interface OldDataStore {
    void addTransaction(Transaction transaction);
    Transaction[] getData();
}
