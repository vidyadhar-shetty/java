package com.js;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Calculator");
        System.out.println("-----------------\n");
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("\nSelect an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        
        double result = 0;
        String operator = "";
        
        switch (choice) {
            case 1:
                result = num1 + num2;
                operator = "+";
                break;
            case 2:
                result = num1 - num2;
                operator = "-";
                break;
            case 3:
                result = num1 * num2;
                operator = "*";
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    operator = "/";
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        
        System.out.println("\nResult: " + num1 + " " + operator + " " + num2 + " = " + result);
    }
}
