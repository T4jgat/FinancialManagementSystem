package kz.t4jgat.Notifications;

import kz.t4jgat.Transactions.Transaction;

import java.util.List;

public interface Observer {
    void handleEvent(List<Transaction> transactionList);
}
