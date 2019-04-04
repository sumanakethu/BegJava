package com.Suarez;
/*
sumana kethu
3/25/19
program: print out a diamond shape using two methods. top and bot
 */
public class UnitedStates {

    public static void main(String[] args) {
        diamondMethod();    // Calling the Diamond Method
        reverseDiamond();
        top();
        square();
        unitedStates();
        square();
        top();

    }

    public static void diamondMethod()    // Defining the Diamond with print ln statements
    {
        top();
        bot();
    }

    public static void reverseDiamond() {
        bot();
        top();
    }

    public static void top() {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }

    public static void bot() {
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }
    public static void square () {
       System.out.println("+------+");
       System.out.println("|      |");
       System.out.println("|      |");
       System.out.println("+------+");
    }
    public static void unitedStates () {
        System.out.println("|United|");
        System.out.println("|States|");
    }

}



