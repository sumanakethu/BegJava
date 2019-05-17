package com.Suarez;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class shoppingFile {
    public static void main(String[] args) throws IOException {
        File fileinput = new File("/Users/sumanakethu/IdeaProjects/BeginningJava/src/com/Suarez/shopping");
        Scanner input = new Scanner(fileinput);

        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineBreaker = new Scanner(line);
            String product = lineBreaker.next();
            double total = 0;
            int count = 0;

            {
                while (lineBreaker.hasNextDouble()) {
                    total = total + lineBreaker.nextDouble();
                    count++;
                }
            }
            System.out.printf("The average price of %-10s product is $%.2f \n", product, total / count);
        }
    }
}
