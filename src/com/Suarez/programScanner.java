package com.Suarez;

import java.util.Scanner;

public class programScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the low number.");
        int low = input.nextInt();
        System.out.println("Enter the high number.");
        int high = input.nextInt();
        int sum = 0;
        for (int i=low; i<= high; i++)
        {
            sum+=i;
        }
        System.out.println("low = " + low);
        System.out.println("high = " + high);
        System.out.println("sum = " + sum);
    }
}
