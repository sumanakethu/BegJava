package com.Suarez;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class finalProjectClient {
    private int points;
    public void setpoints(int points1) {
        points= points1; //mutator to set points
    }
    public void getpoints() {
        System.out.print(points); //accessor to get points
    }
    public void loop()throws IOException{
        File fileinput = new File("/Users/sumanakethu/IdeaProjects/BeginningJava/src/com/Suarez/finalProjectFile");
        Scanner file = new Scanner(fileinput);
        while (file.hasNextLine()) {
            String line = file.nextLine(); //while loop to check if there's a next line
            String definition = line.substring(0, line.indexOf('-')); //prints everything before the "-" which is the definition
            System.out.println(definition);
            String word = line.substring(line.indexOf('-') + 2); //prints everything after the "- " which is the correct word
            Scanner scan = new Scanner(System.in);
            System.out.println("Write the word that matches this definition.");
            String input = scan.next(); //scans user input
            if (input.equalsIgnoreCase(word)) { //if the input equals the word, it's correct
                System.out.println("You're right!");
                points++; //adds a point
                System.out.println();
            } else {
                System.out.println("You're wrong, the correct answer is " + word + "."); //if the input doesn't equal the word, it's wrong
                System.out.println();
            }
        }
    }
}
