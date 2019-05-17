package com.Suarez;
/*
Sumana Kethu
4/16/19
writing a program that generates two random numbers between 0 and 100 and prints the smaller of the two numbers.
 */
import java.util.Random;

public class num53 {
    public static void main(String[] args) {
        Random randy = new Random();
        int randy1= randy.nextInt(101);
        int randy2 = randy.nextInt(101);
        int smaller= Math.min (randy1, randy2);
        System.out.println("The two random numbers are " + randy1 + " and " + randy2);
        System.out.println("The smaller number is " + smaller);
    }
}
