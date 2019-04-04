package com.Suarez;
/*
sumana kethu
3/25/19
program: print out a diamond shape using two methods. top and bot
 */
public class Diamond2For {
    public static final int SIZE = 7;

    public static void main(String[] args) {
        diamondMethod();    // Calling the Diamond Method
        //    reverseDiamond();

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
        for (int counter = 1; counter <= SIZE; counter++) {
            for (int space = 1; space <= -counter + SIZE; space++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int space = 1; space <= 2 * counter - SIZE / 3; space++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }

//        System.out.println("  /\\");
//        System.out.println(" /  \\");
//        System.out.println("/    \\");
    }

    public static void bot() {
        for (int counter = 1; counter <= SIZE; counter++) {
            for (int space = 1; space <=counter-1; space++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int space = 1; space <= (SIZE-counter)*2; space++) {
                System.out.print(" ");
            }
            System.out.println("/");

//        System.out.println("\\    /");
//        System.out.println(" \\  /");
//        System.out.println("  \\/");
        }
    }
}
