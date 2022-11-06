package javaoopsconcepts.inheritanceStudy;

public class Pitbull extends Dog {

    public Pitbull() {
        System.out.println("Pitbull default constructor");
    }

    public Pitbull(String name) {
        super(name);
        System.out.println("Pitbull parameterized constructor");
    }

    public static void main(String[] args) {
        Animal an = new Pitbull();
        Dog pitbull =  new Pitbull("Bruno");
        pitbull.bark();
        pitbull.eats();
        pitbull.sleeps();
    }
}
