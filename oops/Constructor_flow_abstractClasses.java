public class Constructor_flow_abstractClasses {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.sound();
    }

}
abstract class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }

    abstract void sound(); // abstract method
}

class Dog extends Animal {
    Dog() {
        super(); // optional, compiler adds it
        System.out.println("Dog constructor called");
    }

    void sound() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    Puppy() {
        System.out.println("Puppy constructor called");
    }

    void sound() {
        System.out.println("Puppy yaps");
    }
}


    
