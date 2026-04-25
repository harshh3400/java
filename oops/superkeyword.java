// 🔹 Parent class
class Animal {
    String color = "Brown";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal eats food");
    }
}

// 🔹 Child class
class Dog extends Animal {
    String color = "Black";

    Dog() {
        // 🔸 Call parent class constructor
        super(); // This is optional, Java inserts it by default
        System.out.println("Dog constructor called");
    }

    void printColor() {
        // 🔸 Access parent class variable
        System.out.println("Dog color: " + color);          // Black (this class)
        System.out.println("Animal color: " + super.color); // Brown (parent class)
    }

    void eat() {
        System.out.println("Dog eats meat");
        // 🔸 Call parent class method
        super.eat(); // Calls Animal's eat()
    }
}

// 🔹 Main class
public class superkeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
        d.eat();
    }
}
