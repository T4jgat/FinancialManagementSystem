package kz.t4jgat.BankComission;

public class USDDepositPercentage implements DepositPercentageStrategy {
    @Override
    public double calculateComission(double balance) {
        return balance * 0.06;
    }
}