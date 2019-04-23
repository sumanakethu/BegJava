package com.Suarez;
public class box {
    private double length;
    private double width;
    private double height;

    box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }
    public void SetLength (double input) {
        length= input;
    }
    public void SetWidth (double input) {
        width= input;
    }
    public void SetHeight (double input) {
        height= input;
    }
    public double GetLength() {
        return length;
    }
    public double GetWidth() {
        return width;
    }
    public double GetHeight() {
        return height;
    }
    public double CalculateVolume () {
        return length*width*height;
    }
    public double CalculateArea () {
        return length*width;
    }
    public String toString() {
        return "The dimensions are" + Double.toString(width) + "x" + Double.toString(length) + "x" + Double.toString(height);
    }
}

