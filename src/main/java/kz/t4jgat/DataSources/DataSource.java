package kz.t4jgat.DataSources;

import kz.t4jgat.Transactions.Transaction;

import javax.xml.crypto.Data;
import java.util.List;

public interface DataSource {
    DataStore getInstance();
    void addTransaction(Transaction transaction);
    List<Transaction> getData();
}
