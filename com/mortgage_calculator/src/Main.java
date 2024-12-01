package com;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        int principal = scanner.nextInt();
        System.out.println("Principal: " + NumberFormat.getCurrencyInstance().format(principal));

        System.out.print("Enter Annual Interest Rate: ");
        double intRate = scanner.nextDouble() / (double) PERCENT;
        System.out.println("Annual Interest Rate: " + NumberFormat.getPercentInstance().format(intRate));

        System.out.print("Enter Mortgage Duration in Years: ");
        int duration = scanner.nextInt();
        System.out.println("Duration: " + duration);

        double monthlyIntRate = intRate / MONTHS_IN_YEAR;
        int durationMonths = duration * MONTHS_IN_YEAR;

        double numerator, denominator, mortgagePayment;
        numerator = principal * monthlyIntRate * Math.pow((1 + monthlyIntRate), durationMonths);
        denominator = Math.pow((1 + monthlyIntRate), durationMonths) - 1;

        mortgagePayment = Math.round(numerator / denominator);

        System.out.println("Monthly Mortgage Amount: " + NumberFormat.getCurrencyInstance().format(mortgagePayment));

    }
}
