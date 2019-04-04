package com.Suarez;
/*
Sumana Kethu
3/31/19
program: lanterns
 */
public class Lanterns {
    public static final int SIZE = 3;

    public static void main(String[] args) {
        top();
        topWithoutSpace();
        bot ();
        top();
    }

    public static void top() {
        for (int counter = 1; counter <= SIZE; counter++) {
            for (int space = 1; space <= -counter + SIZE; space++) {
                System.out.print("  ");
            }
            System.out.print("*");
            for (int space = 1; space <= 4 * counter - SIZE / 2; space++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println(" ");
    }

    public static void bot () {
        {
            System.out.println("* | | | | | *");
        }
        System.out.println("*************");
    }

    public static void topWithoutSpace() {
        for (int counter = 1; counter <= SIZE; counter++) {
            for (int space = 1; space <= -counter + SIZE; space++) {
                System.out.print("  ");
            }
            System.out.print("*");
            for (int space = 1; space <= 4 * counter - SIZE / 2; space++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
