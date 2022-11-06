package javaoopsconcepts.abstraction;

public abstract class Shape {

    protected String color;

    public Shape(String color) {
        System.out.println("Constructor of shape is called");
        this.color = color;
    }

    //i create a concrete method

    public String getcolor() {
        return color;
    }

    //abstractmethods

    protected abstract double area();
    public  abstract String toString();

}


