package com.Suarez;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class finalProject {
        public static void main (String[]args) throws IOException {
            finalProjectClient objectclass= new finalProjectClient();
            objectclass.setpoints (0); //tracks points earned

            System.out.println("Welcome to the vocabulary quiz! A definition will be printed, and you will have to enter the correct word that matches the definition.");
            System.out.println("For every question you get right, you earn 1 point.");
        File actualFile = new File("/Users/sumanakethu/IdeaProjects/BeginningJava/src/com/Suarez/file"); //file to document user info
        FileWriter fw= new FileWriter(actualFile); //keeps track of user information in file
        System.out.println("What is your name?");
        Scanner inputt = new Scanner(System.in);
        String name = inputt.nextLine();
        fw.write(name+"\n");
        System.out.println("Have you played before?");
        Scanner scann = new Scanner(System.in);
        String playedbefore = scann.nextLine();
        if (playedbefore.equalsIgnoreCase("yes")||playedbefore.equalsIgnoreCase("y")) {
            fw.write("has played before");
        }
            else
                {
                    fw.write("has not played before");
            }


        fw.close();

            objectclass.loop(); //while loop from client class
            System.out.print("Congrats! You got ");
        objectclass.getpoints(); //accessor method to get points points
        System.out.println("/14 questions right!");
    }
    }

