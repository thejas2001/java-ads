package org.example;

// Java program to illustrate the
// concept of Abstraction
abstract class Shape1 {
    String color;

    // these are abstract methods
    abstract double area();
    public abstract String toString();

    // abstract class can have the constructor
    public Shape1(String color)
    {
        System.out.println("Shape1 constructor called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor() { return color; }
}
class Circle1 extends Shape1 {
    double radius;

    public Circle1(String color, double radius)
    {

        // calling Shape1 constructor
        super(color);
        System.out.println("Circle1 constructor called");
        this.radius = radius;
    }

    @Override double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override public String toString()
    {
        return "Circle1 color is " + super.getColor()
                + "and area is : " + area();
    }
}
class Rectangle1 extends Shape1 {

    double length;
    double width;

    public Rectangle1(String color, double length,
                     double width)
    {
        // calling Shape1 constructor
        super(color);
        System.out.println("Rectangle1 constructor called");
        this.length = length;
        this.width = width;
    }

    @Override double area() { return length * width; }

    @Override public String toString()
    {
        return "Rectangle1 color is " + super.getColor()
                + "and area is : " + area();
    }
}
public class interfac {
    public static void main(String[] args)
    {
        Shape1 s1 = new Circle1("Red", 2.2);
        Shape1 s2 = new Rectangle1("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
