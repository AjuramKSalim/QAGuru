package javaoopsconcepts.abstraction;

public class Driver {

    public static void main(String[] args) {
        Shape circle = new Circle("RED",10.5d);
        Shape rectangle = new Rectangle("GREEN",20,10);
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());

    }
}
