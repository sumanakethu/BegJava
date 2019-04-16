package com.Suarez;

import java.util.Random;

public class num53 {
    public static void main(String[] args) {
        Random randy = new Random();
        int randy1= randy.nextInt(101);
        int randy2 = randy.nextInt(101);
        double smaller= Math.min (randy1, randy2);
        System.out.println(smaller);
    }
}
