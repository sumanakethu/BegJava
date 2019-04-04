package com.Suarez;
import java.util.*;
public class names {
    public static void main (String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println ("Enter your full name.");
        String initial= input.nextLine ();
        System.out.print(initial.charAt(0) + ". Diddy ");
        String first= initial.substring(0, initial.indexOf(' '));
        String last= initial.substring(initial.indexOf(' ')+1);
        System.out.print(last.toUpperCase()+ " " + first + "-izzle");
    }
}
