package com.Suarez;
/*
Sumana Kethu
3/27/19
 */
public class Challenge1 {
    public static final int SIZE = 6;

    public static void main(String[] args) {
        lineMethod();
        top ();
        bottom ();
        lineMethod();
        bottom ();
        top ();
        lineMethod ();
    }

    public static void lineMethod()
        {
            System.out.print("+-");
            for (int space = 1; space <= -1 + SIZE; space++) {
                System.out.print("-");
            }
            System.out.print("---");
            for (int space = 1; space <= -1 + SIZE; space++) {
                System.out.print("-");
            }
            System.out.println("-+");
        }

    public static void top() {
        System.out.print("| ");
           for (int space = 1; space <= SIZE-1; space++)
           {
                System.out.print(" ");
            }
           System.out.print(" * ");
           for (int space = 1; space <= SIZE-1; space++)
           {
               System.out.print(" ");
           }
           System.out.println(" |");


           for(int counter = 1; counter<=SIZE; counter++) {
            System.out.print("| ");

            for (int space = 1; space <= -counter + SIZE; space++) {
                System.out.print(" ");
            }
            System.out.print ("/");
            for (int insideSlash = 1; insideSlash < counter; insideSlash ++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int insideSlash = 1; insideSlash < counter;insideSlash++) {
                System.out.print ("\\");
            }
            System.out.print ("\\");
            for (int space = 1; space <= -counter + SIZE; space++)
            {
                System.out.print(" ");
        }
            System.out.println(" |");
}
}
    public static void bottom () {
     for(int counter=SIZE; counter > 0; counter--) {
         System.out.print("| ");

         for (int space = 1; space <= -counter + SIZE; space++) {
             System.out.print(" ");
         }
         System.out.print("\\");
         for (int insideSlash = 1; insideSlash < counter; insideSlash++) {
             System.out.print("\\");
         }
         System.out.print("*");
         for (int insideSlash = 1; insideSlash < counter; insideSlash++) {
             System.out.print("/");
         }
         System.out.print("/");
         for (int space = 1; space <= -counter + SIZE; space++) {
             System.out.print(" ");
         }
         System.out.println(" |");

     }
        System.out.print("| ");
        for (int space = 1; space <= SIZE-1; space++)
        {
            System.out.print(" ");
        }
        System.out.print(" * ");
        for (int space = 1; space <= SIZE-1; space++)
        {
            System.out.print(" ");
        }
        System.out.println(" |");
    }
}
