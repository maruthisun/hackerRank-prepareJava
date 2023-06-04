package main.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nfUS.format(payment);
        NumberFormat nfIN = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = nfIN.format(payment);
        NumberFormat nfCH = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nfCH.format(payment);
        NumberFormat nfFR = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nfFR.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
