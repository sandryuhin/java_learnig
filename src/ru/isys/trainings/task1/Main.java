package ru.isys.trainings.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter your name please: ");

        Scanner scanner = new Scanner(System.in);

        String someString = scanner.nextLine();
        System.out.println("Hello, " + someString);

        scanner.close();

    }

}
