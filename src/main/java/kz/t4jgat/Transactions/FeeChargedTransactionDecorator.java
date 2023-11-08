package kz.t4jgat.Transactions;

public class FeeChargedTransactionDecorator extends TransactionDecorator {
    public FeeChargedTransactionDecorator(Transaction transaction) {
        super(transaction);
    }

    @Override
    public double getAmount() {
        return transaction.getAmount() - 5;
    }
}