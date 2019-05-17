package com.Suarez;
import java.util.*;
public class inputCheck {
    public static void main(String[] args)
    {
        String email;
        Scanner scan= new Scanner (System.in);
        do {
            System.out.println("Please enter your email.");
            email= scan.next();
            }
        while(email.indexOf("@")<0);
    }
}
