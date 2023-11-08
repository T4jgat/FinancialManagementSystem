package kz.t4jgat.Transactions;

// abstract decorator for additions of transaction
abstract class TransactionDecorator implements Transaction {
    // we declare the instance of transaction
    protected Transaction transaction;

    // we give value of transaction using any concrete implementations of transaction
    public TransactionDecorator(Transaction transaction) {
        this.transaction = transaction;
    }
}