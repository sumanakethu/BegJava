package com.Suarez;

public class point {
    private int x;
    private int y;

    public void SetX(int x1) {
        x = x1;
    }

    public void SetY(int y1) {
        y = y1;
    }

    public int GetX() {
        return x;
    }

    public int GetY() {
        return y;
    }

    public void setLocation(int x1, int y1) {
        x = x1;
        y = y1;
    }

    public String toString() {
        return "Point = ( " + x + " , " + y + " )";
    }

    public static double distance(point p1, point p2) {
        double VarX = Math.pow(p1.x - p2.x, 2);
        double VarY = Math.pow(p1.y - p2.y, 2);
        return Math.sqrt(VarX + VarY);
    }

    public boolean isVertical(point other) {
        if (x == other.x) {
            return true;
        } else {
            return false;
        }
    }

    public double slope(point other) {

        {
            if (x == other.x)
                return -.000000001;
        }
        return (double)(other.y - y) / (other.x - x);
    }

    public int manhattanDistance(point other) {
        {
            return Math.abs((other.x - x) + (other.y - y));
        }
    }

    public boolean isCollinear(point p2, point p3) {
        boolean T1 = isVertical(p2);
        boolean T2 = isVertical(p3);
        if (T1 && T2) {
            return true;
        }
        double s1 = slope(p2);
        double s2 = slope(p3);
        {
            if (Math.abs(s1 - s2) < 0.001) {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}