package com.Suarez;
import java.util.Scanner;
public class simplecalculator {
    public static void main(String[] args) {
        double fp1, fp2;
        String operation;
        Scanner scan= new Scanner (System.in);
        System.out.println("Welcome to the Calculator");
        System.out.print("Enter the first operand:");
        fp1= scan.nextDouble();
        System.out.print("Enter the second operand:");
        fp2= scan.nextDouble();
        System.out.println("\nOperations are: ");
        System.out.print("Enter your selection: ");
        operation= scan.next();
        operation= operation.toUpperCase();
        switch (operation) {
            case "ADD":
            case "+":
                System.out.printf("The sum is" + (fp1+fp2));
                System.out.printf("The sum is %f + %f which equals %f", fp1, fp2, fp1+fp2);
                break;
            case "SUBTRACT":
            case "-":
                System.out.println("The difference is " + (fp1-fp2));
                System.out.printf("The difference is %f - %f which equals %f", fp1, fp2, fp1-fp2);
                break;
            case "MULTIPLY":
            case "*":
                System.out.println("The product is " + (fp1*fp2));
                System.out.printf("The product is %.2f * %.2f which equals %.2f", fp1, fp2, fp1*fp2);
                break;
            case "DIVIDE":
            case "/":
                if (fp2==0.0)
                System.out.println("Dividing by 0 is not allowed");
                else
                    System.out.printf("The quotient is" + (fp1/fp2));
                System.out.printf("The quotient is %f/%f which equals %f", fp1, fp2, fp1/fp2);
                break;
            default:
                System.out.println(operation+ " is not valid.");
        }
    }
}
