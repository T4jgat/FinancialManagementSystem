package kz.t4jgat.Transactions;

// decorator for transactions with fee changes
public class FeeChargedTransactionDecorator extends TransactionDecorator {

    // we get transaction instance from parent class
    public FeeChargedTransactionDecorator(Transaction transaction) {
        super(transaction);
    }

    // overrided amount getter
    @Override
    public double getAmount() {
        return transaction.getAmount() - 5;
    }
}