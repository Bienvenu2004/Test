package com.Practice.ScannerPractices;

public class Division {
    public void TimesTable() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int i;
        for (i = 1; i <= 12; i++) {
            System.out.println(number + " - " + i + " = " + number / i);
        }
    }
}
