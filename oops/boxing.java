public class boxing {
  public static void main(String[] args) {
    Animal a = new Dog();
    a.sound();
    a.legs();
  }
}

abstract class Animal {
  abstract void sound();

  abstract void legs();

  public void eat() {
    System.out.println("Eating");
  }
}

class Dog extends Animal {
  public void sound() {
    System.out.println("Barking...");
  }

  public void legs() {
    System.out.println("4 Legs");
  }
}
