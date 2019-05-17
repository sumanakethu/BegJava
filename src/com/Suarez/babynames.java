package com.Suarez;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class babynames {
    public static void main(String[] args) throws IOException {
        File fileinput = new File("/Users/sumanakethu/IdeaProjects/BeginningJava/src/com/Suarez/names");
        Scanner input = new Scanner(fileinput);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name you need.");
        int number= 0;
        String name = scan.next();
        System.out.println(input.nextLine());
        while (input.hasNextLine())
        {
            Scanner control = new Scanner(input.nextLine());
            String temp = control.next();
            System.out.println();
            if (name.equalsIgnoreCase(temp))
            {
                System.out.print(control);
                while (control.hasNextInt())
                {
                    number = number + control.nextInt();
                    System.out.println();
                }
            }
        }
        System.out.println("The baby's name is " + name + " and the number of babies with that name from 1900-2000 is " + number);
        System.out.println("The average of the numbers is " + number/11 + " babies/year");
    }
    }
