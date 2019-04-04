package com.Suarez;
/*
sumana kethu
3/25/19
program: print out a diamond shape using two methods. top and bot
 */
public class DiamondStars {
    public static final int SIZE = 7;

    public static void main(String[] args) {
        diamondMethod("/", " ", "\\");    // Calling the Diamond Method
    reverseDiamond();
    }

    public static void diamondMethod(String beg, String inside, String end)    // Defining the Diamond with print ln statements
    {
        top(beg, inside, end);
        bot(end, inside, beg);
    }

    public static void reverseDiamond() {
        bot("\\", " ", "/");
        top("/", " ", "\\");
    }

    public static void top(String beg, String inside, String end) {
        for (int counter = 1; counter <= SIZE; counter++) {
            for (int space = 1; space <= -counter + SIZE; space++) {
                System.out.print(" ");
            }
            System.out.print(beg);
            for (int space = 1; space <= 2 * counter - SIZE / 3; space++) {
                System.out.print(inside);
            }
            System.out.println(end);
        }

    }
    public static void bot(String beg, String inside, String end) {
        for (int counter = 1; counter <= SIZE; counter++) {
            for (int space = 1; space <=counter-1; space++) {
                System.out.print(" ");
            }
            System.out.print(beg);
            for (int space = 1; space <= (SIZE-counter)*2; space++) {
                System.out.print(inside);
            }
            System.out.println();

        }
    }
}
