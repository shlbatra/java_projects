// package com;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        double monthlyIntRate = 0;
        int durationMonths = 0;
        double numerator = 0, denominator = 0, mortgagePayment = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Principal amount ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000) {
                System.out.println("Principal: " + NumberFormat.getCurrencyInstance().format(principal));
                break;
            } else
                System.out.print("Enter Principal amount between $1K and $1M ");
        }

        while (true) {
            System.out.print("Enter Annual Interest Rate: (>=1 and <=30)");
            int intRate = scanner.nextInt();
            if (intRate >= 1 && intRate <= 30) {
                System.out.println("Annual Interest Rate: " + intRate);
                monthlyIntRate = intRate / (double) MONTHS_IN_YEAR / (double) PERCENT;
                break;
            } else
                System.out.println("Enter Annual Interest Rate between 1% and 30%");
        }

        while (true) {
            System.out.print("Enter Mortgage Duration in Years: (Between 1 and 30): ");
            int duration = scanner.nextInt();
            if (duration >= 1 && duration <= 30) {
                System.out.println("Duration: " + duration);
                durationMonths = duration * MONTHS_IN_YEAR;
                break;
            } else
                System.out.println("Enter Duration between 1 and 30 years");
        }

        numerator = principal * monthlyIntRate * Math.pow((1 + monthlyIntRate), durationMonths);
        denominator = Math.pow((1 + monthlyIntRate), durationMonths) - 1;
        mortgagePayment = Math.round(numerator / denominator);

        System.out.println("Monthly Mortgage Amount: " + NumberFormat.getCurrencyInstance().format(mortgagePayment));

    }
}
