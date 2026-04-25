/*
Poly->Many
morphism->forms
 *Types of Polymorphism:
1]Compile-time Polymorphism (Static Binding / Method Overloading)
->Same method name, but different parameter list (number or type).
->Resolved at compile time.

2]Runtime Polymorphism (Dynamic Binding / Method Overriding)
->Subclass provides a specific implementation of a method defined in the parent class.
->Resolved at runtime, using dynamic method dispatch.
 */
public class ploymorphism {
    public static void main(String[] args) {
        calculator c1=new calculator();
        c1.add(1f, 02f);//method overloading
        c1.add(2,3);

        //method overriding
        Dog d1=new Dog();
        d1.sound();

    }
}
class calculator{
    //method overloading
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(float a,float b)
    {
        System.out.println(a+b);
    }
    void add(double a,double b)
    {
        System.out.println(a+b);
    }
}


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}


       
