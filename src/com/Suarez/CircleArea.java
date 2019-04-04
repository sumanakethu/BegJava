package com.Suarez;
/*
Sumana Kethu
March 20, 2019
Program: We are going to calculate the area of a circle
we must declare a float constant for Pi, a floar Radius and a double for Area
*/

public class CircleArea {
    public static void main (String[] args) {
        final float MYPI = 3.14f;
        double radius = 10.0;
        double area;
        area = MYPI * radius;
        System.out.print (" The area of the Circle of radius \t" + radius + "in is \t" + area + "\"square inches\"");
    }
}
