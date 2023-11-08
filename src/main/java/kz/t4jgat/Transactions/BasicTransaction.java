package kz.t4jgat.Transactions;

class BasicTransaction implements Transaction {
    private double amount;

    public BasicTransaction(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}

