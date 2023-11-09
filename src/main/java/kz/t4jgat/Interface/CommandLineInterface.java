package kz.t4jgat.Interface;

import kz.t4jgat.Account.*;
import kz.t4jgat.BankComission.DepositPercentageStrategy;
import kz.t4jgat.BankComission.KZTDefaultDepositPercentage;
import kz.t4jgat.BankComission.USDDepositPercentage;
import kz.t4jgat.DataSources.*;
import kz.t4jgat.Notifications.Observer;
import kz.t4jgat.Transactions.BasicTransaction;
import kz.t4jgat.Transactions.TaxedTransactionDecorator;
import kz.t4jgat.Transactions.Transaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CommandLineInterface {
    private String action = "";
    private AccountFactory accountFactory = null;
    private Scanner sc = new Scanner(System.in);


    public void runCLI() {
        // Data sources
        DataSource newDataSource = DataStore.getInstance();
        DataSource oldDataSource = new DataStoreAdapter(new LegacyDataStore());

        while (!action.equals("e")) {
            System.out.print("""
                    [1] Login as user
                    [2] Login as admin
                    [e] Exit
                    >>\s""");
            action = sc.next();

            if (action.equals("1")) {

                // User creating
                Account account = createAccountBySpecifies("user");
                newDataSource.setUser(account);

                // create deposit for user
                createDepositForUser(account);

                System.out.print("""
                        ========= Action =========
                        [1] add transaction
                        >>\s""");
                action = sc.next();
                if (action.equals("1")) {
                    System.out.print("Amount of transaction: ");
                    double amount = sc.nextDouble();
                    Transaction transaction = new TaxedTransactionDecorator(new BasicTransaction(amount));
                    newDataSource.addTransaction(account, transaction);
                }
            } else if (action.equals("2")) {
                while (!action.equals("q")) {
                    Account account = createAccountBySpecifies("admin");

                    System.out.print("""
                            [1] Create discount
                            [q] Exit
                            >>\s""");
                    action = sc.next();

                    if (action.equals("1")) {
                        System.out.print("Title: ");
                        String title = sc.next();
                        Discount discount = new BasicDiscount(title);
                        ((DataStore) newDataSource).addDiscount(discount);
                    }
                }
            }
        }
    }


    private Account createAccountBySpecifies(String specifies) {
        String name = "", email = "";
        double balance = 0;
        if (specifies.equalsIgnoreCase("user")) {
            accountFactory = new UserAccountFactory();

            System.out.print("Name: ");
            name = sc.next();

            System.out.print("Email: ");
            email = sc.next();

            System.out.print("Balance (for create deposit): ");
            balance = sc.nextDouble();
        } else if (specifies.equalsIgnoreCase("admin")) {
            name = "Admin";
            email = "admin@mail.ru";
            accountFactory = new AdminAccountFactory();
        } else {
            throw new RuntimeException(specifies + " is unknown");
        }
        return accountFactory.createAccount(name, email, balance);
    }


    private void createDepositForUser(Account account) {
        DepositPercentageStrategy depositPercentageStrategy = null;

        System.out.print("""
                        ========= Select your currency =========
                        [1] USD
                        [2] KZT
                        >>\s""");

        action = sc.next();

        if (action.equals("1"))
            depositPercentageStrategy = new USDDepositPercentage();
        else if (action.equals("2"))
            depositPercentageStrategy = new KZTDefaultDepositPercentage();

        assert depositPercentageStrategy != null;
        account.setBalance(depositPercentageStrategy.calculateComission(account.getBalance()));
        String formatBalance = String.format("%.2f", account.getBalance());
        System.out.println("Congratulations! Now your balance is " + formatBalance);
    }

}
