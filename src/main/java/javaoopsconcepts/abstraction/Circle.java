package javaoopsconcepts.abstraction;

public class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("Constructor of Circle is called");
        this.radius = radius;
    }

    @Override
    protected double area() {
        return 3.14*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle color is " + super.color + "and circle area is" +area();
    }
}
