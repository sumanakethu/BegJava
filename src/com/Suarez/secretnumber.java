package com.Suarez;

import java.util.Random;
import java.util.Scanner;

public class secretnumber {
    public static void main(String[] args) {
        Random randy = new Random();
        int secret = randy.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        int guess = input.nextInt();
        if (guess > 100 || guess < 1)
            {
                System.err.println("You're wrong.");
            }
        else
            if (secret == guess)
            {
                System.out.println("Congratulations.");
            }
        else
            if (guess > secret + 3 || guess > secret - 3)
            {
                System.err.println("You missed by a mile.");
            }
        else
            {
                System.out.println("You were close.");
                System.out.println("Better luck next time.");
            }
        System.out.println("The random number was " + secret);
    }
}
