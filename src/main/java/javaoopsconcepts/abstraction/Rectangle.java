package javaoopsconcepts.abstraction;

public class Rectangle extends Shape {

    private double length, breadth;

    public Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
        System.out.println("Inside the rectangle constructor");
    }


    @Override
    protected double area() {
        return length*breadth;
    }

    @Override
    public String toString() {
        return "Rectangel color is " + super.color + "and rectangle area is" +area();
    }
}
