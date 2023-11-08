package kz.t4jgat.DataSources;

import kz.t4jgat.Transactions.BasicTransaction;
import kz.t4jgat.Transactions.Transaction;

public class LegacyDataStore {

    private static LegacyDataStore legacyDataStore;

    private Transaction[] data = new Transaction[10];
    {
        for (int i = 0; i < data.length; i++) {
            data[i] = new BasicTransaction(0.25 + i);
        }
    }

    public Transaction[] getData() {
        return data;
    }
}
