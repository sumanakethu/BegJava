package com.Suarez;

public class boxClient {
    public static void main(String[] args) {
        box b1 = new box(5, 6, 7);
        box b2 = new box(12, 14, 17);
        double volume;
        volume = b1.CalculateVolume();
        System.out.println("The volume of the 1st box is " + volume);
        volume = b2.CalculateVolume();
        System.out.println("The volume of the 2nd box is " + volume);
        double area;
        area = b1.CalculateArea();
        System.out.println("The area of the 1st box is " + area);
        area= b2.CalculateArea();
        System.out.println("The area of the 2nd box is " + area);

    }
}

