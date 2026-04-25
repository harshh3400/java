
/*
✅ What is Abstraction?
Abstraction is the process of hiding internal implementation details and showing only the functionality to the user.

✅ Real-life Example:
You use a TV remote to change channels, but you don't know the internal wiring. That's abstraction!

✅ How to Achieve Abstraction in Java?
 Java supports abstraction using:
    ->Abstract classes
    ->Interfaces

✅Abstract Class in Java
An abstract class:

->Is a class that cannot be instantiated
->Can have abstract methods (without body) and non-abstract methods (with body)
->Is used to provide a common base class for subclasses


 */
// Abstract class
abstract class Vehicle {
    abstract void start(); // abstract method

    void fuelType() {
        System.out.println("Petrol or Diesel or Electric");
    }
}

// Subclass 1
class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key or button.");
    }
}

// Subclass 2
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a kick or self-start.");
    }
}

// Main class
public class Abstraction {
    public static void main(String[] args) {
        Vehicle v1 = new Car();  // upcasting
        v1.start();
        v1.fuelType();

        Vehicle v2 = new Bike(); // upcasting
        v2.start();
        v2.fuelType();

        Car c1=new Car();
        c1.start();
        c1.fuelType();
    }
}
