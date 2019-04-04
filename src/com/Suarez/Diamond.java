package com.Suarez;
/*
sumana kethu
3/25/19
program: print out a diamond shape
 */
public class Diamond {

    public static void main(String[] args) {
        diamondMethod();    // Calling the Diamond Method
        diamondMethod();
        diamondMethod();
    }
    public static void diamondMethod()    // Defining the Diamond with print ln statements
    {
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/    \\");
        System.out.println("\\    /");
        System.out.println(" \\  /");
        System.out.println("  \\/");
    }



}