package com.Suarez;


import java.util.*;

public class randomNumber {
    public static void main(String[] args) {
        System.out.println ("A random number is " + Math.random ());
        Random randy= new Random (101);
        int randy2= randy.nextInt(101) +0;
        System.out.println ("2nd random number is " + randy2);
        int randy3= randy.nextInt(101) +0;
        System.out.println ("3nd random number is " + randy3);
    }
}
