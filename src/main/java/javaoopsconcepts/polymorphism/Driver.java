package javaoopsconcepts.polymorphism;

import java.awt.*;
import java.util.Random;

public class Driver {

    public static void main(String[] args) {
        Shape shape = null;
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Random random = new Random();
        switch(random.nextInt(4)){
            case 0:
                shape=circle;
                break;
            case 1:
                shape=rectangle;
                break;
            case 2:
                shape=triangle;
                break;
            case 3:
                shape=new Shape(); // this prints i am shape
                break;
        }
         shape.draw();

    }
}
