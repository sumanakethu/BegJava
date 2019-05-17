package com.Suarez;
import java.util.Scanner;
public class date {
    public static void main (String [] args)
    {
       Scanner scan= new Scanner (System.in);
        System.out.print("Enter a date >");
        String date= scan.nextLine ();
        System.out.println(date.charAt(0));
        System.out.println(date.toLowerCase());
        String year= date.substring(date.indexOf(' ')+5);
        System.out.println(year);
    }
}
