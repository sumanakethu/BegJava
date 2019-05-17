package com.Suarez;
/*
Sumana Kethu
4/16/19
writing a programs that reads a telephone number and prints it in the format of (###)###-####.
 */
import java.util.Scanner;

public class num66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers.");
        String number = input.nextLine();
        String digit1 = number.substring(0, 3);
        String digit2 = number.substring(3, 6);
        String digit3 = number.substring(6, 10);
        System.out.println("(" + digit1 + ")" + digit2 + "-" + digit3);
    }
}
