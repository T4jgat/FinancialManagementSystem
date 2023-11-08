package kz.t4jgat.Transactions;

public class TaxedTransactionDecorator extends TransactionDecorator {
    public TaxedTransactionDecorator(Transaction transaction) {
        super(transaction);
    }

    @Override
    public double getAmount() {
        return transaction.getAmount() * 1.1;
    }
}