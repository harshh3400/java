public class multilevel_Inheritance {
    public static void main(String[] args) {
        Labrador lab = new Labrador();

        // Calling methods from all interfaces
        lab.eat();   // from Animal
        lab.bark();  // from Dog
        lab.weep();  // from Puppy
    }

}
/*interface herivores{
    void eats();
}

interface carivores{
    void eats();
}
class bear implements herivores,carivores{
    void eats()
    {
        System.out.println("Bear eats grass as well as meat!");
    }
}*/

// Interface 1: Top-level interface
interface Animal {
    void eat(); // abstract method
}

// Interface 2: Inherits from Animal
interface Dog extends Animal {
    void bark(); // another abstract method
}

// Interface 3: Inherits from Dog
interface Puppy extends Dog {
    void weep(); // another abstract method
}

// Concrete class implements the last interface in the chain
class Labrador implements Puppy {
    public void eat() {
        System.out.println("Labrador eats dog food");
    }

    public void bark() {
        System.out.println("Labrador barks loudly");
    }

    public void weep() {
        System.out.println("Labrador puppy weeps softly");
    }
}

// Main class

    


