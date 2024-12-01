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
        double int_rate = scanner.nextDouble() / (double) PERCENT;
        System.out.println("Annual Interest Rate: " + NumberFormat.getPercentInstance().format(int_rate));

        System.out.print("Enter Mortgage Duration in Years: ");
        int duration = scanner.nextInt();
        System.out.println("Duration: " + duration);

        double monthly_int_rate = int_rate / MONTHS_IN_YEAR;
        int duration_months = duration * MONTHS_IN_YEAR;

        double numerator, denominator, mortgage_payment;
        numerator = principal * monthly_int_rate * Math.pow((1 + monthly_int_rate), duration_months);
        denominator = Math.pow((1 + monthly_int_rate), duration_months) - 1;

        mortgage_payment = Math.round(numerator / denominator);

        System.out.println("Monthly Mortgage Amount: " + NumberFormat.getCurrencyInstance().format(mortgage_payment));

    }
}
