/*
 * // 📘 Interfaces in Java

// - All methods in an interface are public, abstract, and without implementation
//   ⚠️ (Note: This is true only for abstract methods; since Java 8, interfaces can also have default, static, 
and private methods with implementation)

// - Interfaces are used to achieve total abstraction
//   ✅ This means no method implementation is provided (unless using default/static methods)

// - Variables in an interface are always:
//     → public
//     → static
//     → final
//   ✅ These are constants and cannot be changed once assigned

 */
interface Animal {

    // This is implicitly: public static final int LEGS = 4;
    int LEGS = 4;

    // This is implicitly: public abstract void sound();
    void sound();

    // Java 8+ default method (has body)
    default void sleep() {
        System.out.println("Animal sleeps...");
    }

    // Java 8+ static method
    static void info() {
        System.out.println("Interface: Animal");
    }

    // Java 9+ private method
    /*private void helper() {
        System.out.println("Private helper inside interface");
    }*/
}

// ✔️ Implementing class must override all abstract methods
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();   // Calls overridden method
        d.sleep();   // Calls default method

        // Static method is called using interface name
        Animal.info();

        // Cannot access private method from here
        // d.helper(); // ❌ Compile-time error
    }
}