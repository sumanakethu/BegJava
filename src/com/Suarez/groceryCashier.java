package com.Suarez;

import java.util.*;

public class groceryCashier {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double total = 0;
        int item= 0;
        String answer;
        System.out.println("Do you have any items to scan? yes or no? ");
        answer= input.next();
        System.out.println();
        double price;
        while (answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("y"))
        {
            System.out.print("price of item?");
            price= input.nextDouble();
            total= total+price;
            item++; //items++ -> items=1
            System.out.println("Do you have another item to scan? yes or no? ");
            answer= input.next();
        }
        System.out.println("The "+ item +" items you bought total " + total);

    }
}
