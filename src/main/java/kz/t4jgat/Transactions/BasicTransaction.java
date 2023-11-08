package kz.t4jgat.Transactions;

// Basic transaction without any additions
public class BasicTransaction implements Transaction {

    // Amount variable
    private double amount;

    // basic transaction constructor
    public BasicTransaction(double amount) {
        this.amount = amount;
    }

    // returns amount of transaction
    @Override
    public double getAmount() {
        return amount;
    }
}

