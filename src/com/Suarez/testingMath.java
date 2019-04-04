package com.Suarez;
/*
Sumana Kethu
4/2/19
 */
import java.util.*;
public class testingMath {
  public static void main (String[] args) {
      double Num1= 45.50;
      double Num2= -350;
      double Num3= 0.056;
      double Addition= Num1+Num2+Num3;
      double Multi= Num1*Num2*Num3;
      Multi= Math.round (Multi);
      Multi= Multi/100;
      double Maxi= Math.max (Num1, Num2);
      Maxi= Math.max (Maxi, Num3);
      double Mini= Math.min (Num1, Num2);
      Mini= Math.min (Mini, Num3);
      System.out.println ("This sum is " + Addition + "\n The multiplication is " + Multi);
      System.out.println ("The maximum number is " + Maxi + "\n The minimum number is " + Mini);
      double rooty= Math.sqrt (Math.abs (Multi));
      System.out.println ("The square root of multi is " + rooty);
      System.out.println ("A random number is " + Math.random ());
      Random randy= new Random (10);
      int randy2= randy.nextInt(11) +10;
      System.out.println ("2nd random number is " + randy2);
      int randy3= randy.nextInt(31) +40;
      System.out.println ("3nd random number is " + randy3);
    }
}
