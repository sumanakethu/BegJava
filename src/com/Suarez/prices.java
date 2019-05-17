package com.Suarez;

import java.util.Scanner;

public class prices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        int item = 0;
        double price;
        String answer;
        do
            {

            System.out.print("price of item?");
                price= scan.nextDouble();
                total= total+price;
                item++;
                System.out.println("Do you have another item to scan? yes or no? ");
                answer= scan.next();
        }
        while (answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("y"));

        System.out.println("The "+ item +" items you bought total " + total);
    }
}
