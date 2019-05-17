package com.Suarez;
import java.io.*;
import java.util.*;
public class readingFile {
    public static void main(String[] args) throws IOException {
        File fileinput = new File("/Users/sumanakethu/IdeaProjects/BeginningJava/src/com/Suarez/input");
        Scanner input = new Scanner(fileinput);
        int count = 0;
        while (input.hasNextLine()) {
            String lines = input.nextLine();
            Scanner line = new Scanner(lines);
            // System.out.println(lines);
            while (line.hasNext()) {
                if (line.hasNextInt()) {
                    int word = line.nextInt();
                    // System.out.println("in the INT loop");
                    count++;
                } else {
                    String word = line.next();
                }
            }

        }
        System.out.println("There are " + count + " numbers");
    }
}
