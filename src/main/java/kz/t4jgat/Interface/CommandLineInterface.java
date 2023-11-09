package kz.t4jgat.Interface;

import kz.t4jgat.DataSources.DataSource;
import kz.t4jgat.DataSources.DataStore;
import kz.t4jgat.DataSources.DataStoreAdapter;
import kz.t4jgat.DataSources.LegacyDataStore;

import java.util.Scanner;

public class CommandLineInterface {
    private Scanner sc = new Scanner(System.in);
    public void runCLI() {
        // Data sources
        DataSource newDataSource = DataStore.getInstance();
        DataSource oldDataSource = new DataStoreAdapter(new LegacyDataStore());
//
//        String action = "";
//        while (!action.equals("e")) {
//            action = sc.next();
//            System.out.println("""
//                    [1] Create account
//                    [2""");
//        }
    }

}
