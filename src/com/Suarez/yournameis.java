package com.Suarez;

import java.util.Scanner;

public class yournameis {
    public static void main(String[] args) {
        System.out.println("Enter your name.");
        Scanner input = new Scanner(System.in);
        String name= input.nextLine ();
        System.out.println("Your name is " + name);
    }
}

