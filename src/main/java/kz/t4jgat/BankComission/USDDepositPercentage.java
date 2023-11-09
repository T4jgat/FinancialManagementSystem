package kz.t4jgat.BankComission;

import java.text.Format;

public class USDDepositPercentage implements DepositPercentageStrategy {

    @Override
    public double calculateComission(double balance) {
        return balance * 1.06;
    }
}