package com.Suarez;

public class pointClient
{
    public static void main (String [] args)
    {
        point p1= new point ();
        point p2= new point ();
        point p3= new point ();
        p1.SetX (3);
        p1.SetY (7);
        p2.SetX (-3);
        p2.SetY (-8);
        p3.SetX (4);
        p1.setLocation(2,5);
        double distance= point.distance(p1, p2);
        System.out.println(p1.toString());
        System.out.println(p1.toString());
        System.out.println("The distance is " + distance);
        System.out.println(p1.isVertical(p2));
        System.out.println("The slope is " + p1.slope(p2));
        System.out.println("The Manhattan distance is " + p1.manhattanDistance(p2));
        System.out.println(p1.isCollinear(p2, p3));
    }
}
