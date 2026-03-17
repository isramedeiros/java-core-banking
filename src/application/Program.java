package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        // asking for an account number
        System.out.println("Enter account number: ");
        int number = sc.nextInt();

        // asking for an account holder
        System.out.println("Enter account holder");
        sc.nextLine();
        String holder = sc.nextLine();

        // asking if there is any initial deposit
        System.out.println("Is there an in initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        // if yes, then we ask for a value
        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();

            // we give initialDeposit as a parameter
            account = new Account(number, holder, initialDeposit);
        } else {
            // we call the method without initialDeposit ()
            account = new Account(number, holder);
        }

        System.out.printf("Account data: %s ", account);
        System.out.println();

        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();

    }
}