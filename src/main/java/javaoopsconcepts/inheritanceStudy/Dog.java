package javaoopsconcepts.inheritanceStudy;

public class Dog extends Animal {

    public Dog() {
        super();
        System.out.println("Dog default constructor");
    }

    public Dog(String name) {
        super(name);
        System.out.println("Dog parameterized constructor");
    }

    public void bark(){
        System.out.println(super.name + "barks");
    }

    public static void main(String[] args) {
        Animal an = new Dog();
        Dog dog = new Dog("Hachu");
        dog.eats();
        dog.sleeps();
        dog.bark();
    }

    }

