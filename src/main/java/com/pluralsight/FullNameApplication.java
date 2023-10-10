package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine();
        if (middleName.length() > 0) middleName += middleName.charAt(0);
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();

        String fullName;

        if (middleName.length() > 0 && suffix.length() > 0) {
            fullName = firstName + " " + middleName.toUpperCase() + "." + " " + lastName + ", " + suffix;
        } else if(middleName.length() > 0) {
            fullName = firstName + " " + middleName.toUpperCase() + "." + " " + lastName;
        } else if (suffix.length() > 0) {
            fullName = firstName + " " + lastName + ", " + suffix;
        } else {
            fullName = firstName + " " + lastName;
        }

        System.out.println(fullName);
    }
}
