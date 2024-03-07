package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Calculator operations
        Calculator calculator = new Calculator();
        double sum = calculator.add(num1, num2);
        double average = calculator.mean(num1, num2);
        double subtraction = calculator.subtract(num1,num2);

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + average);
        System.out.println("Subttraction: " + subtraction);
    }
}
