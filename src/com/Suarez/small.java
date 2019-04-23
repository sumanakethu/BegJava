package com.Suarez;
import java.util.*;
public class small {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 number.");
        Double num1 = input.nextDouble();
        System.out.println("Enter another number.");
        Double num2 = input.nextDouble();
        System.out.println("Enter another number.");
        Double num3 = input.nextDouble();
        if (num1 < num2)
            System.out.print("Smallest is number 1.");
        else if (num3 < num2)
            System.out.print("Smallest is num3");
        else
            System.out.print("Smallest is num2");
    }
}
