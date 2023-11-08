package kz.t4jgat.Transactions;

// taxed transaction decorator
public class TaxedTransactionDecorator extends TransactionDecorator {

    // we get transaction instance from parent class
    public TaxedTransactionDecorator(Transaction transaction) {
        super(transaction);
    }

    // overrided amount getter
    @Override
    public double getAmount() {
        return transaction.getAmount() * 1.1;
    }
}