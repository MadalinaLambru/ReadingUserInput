package com.Madalina;

import java.util.Scanner;

//Read 10 numbers from the console entered by the user and print the sum of those numbers.
//        -Create a Scanner.
//        -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
//        -If hasNextInt() returns false, print the message gInvalid Number. Continue reading until you have read 10 numbers.
//        -Use the nextInt() method to get the number and add it to the sum.
//        -Before the user enters each number, print the message gEnter number #x:h where x represents the count, i.e. 1, 2, 3, 4, etc.
//        -For example, the first message printed to the user would be gEnter number #1:h, the next gEnter number #2: h, and  so on.
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (count < 10) {
            int order = count + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;

            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); //handle end of line
        }
        System.out.println("sum is = " + sum);

        scanner.close();
    }
}
