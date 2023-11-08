package kz.t4jgat.Transactions;

abstract class TransactionDecorator implements Transaction {
    protected Transaction transaction;

    public TransactionDecorator(Transaction transaction) {
        this.transaction = transaction;
    }
}