package kz.t4jgat.DataSources;

import kz.t4jgat.Account.Account;
import kz.t4jgat.Notifications.Observer;
import kz.t4jgat.Transactions.Transaction;

import javax.xml.crypto.Data;
import java.util.List;

public interface DataSource {
    void addTransaction(Account account, Transaction transaction);
    List<Transaction> getData();
    void setUser(Account user);
}
