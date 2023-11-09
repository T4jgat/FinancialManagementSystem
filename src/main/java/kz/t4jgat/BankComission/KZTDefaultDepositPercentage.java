package kz.t4jgat.BankComission;

public class KZTDefaultDepositPercentage implements DepositPercentageStrategy {
    @Override
    public double calculateComission(double balance) {
        return balance * 1.14;
    }
}