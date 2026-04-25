public class Constructor {
    public static void main(String[] args) {
        // Using Default Constructor
        Student s1 = new Student();
        s1.display();

        // Using Parameterized Constructor
        Student s2 = new Student("Harshad", 25);
        s2.display();


        // Using Copy Constructor
        Student s3 = new Student(s2);
        s3.display();

        Student s4=new Student(25);
        s4.display();
    }
}
// Class with multiple constructors
class Student {
    String name;
    int age;

    // 1. Default Constructor
    public Student() {
        System.out.println("Default Constructor Called");
    }

    // 2. Parameterized Constructor
    public Student(String name, int age) {
        System.out.println("Parameterized Constructor Called");
        this.name = name;
        this.age = age;
    }

    public Student(int age){
        this.age=age;
    }

    // 3. Copy Constructor
    public Student(Student s) {
        System.out.println("Copy Constructor Called");
        this.name = s.name;
        this.age = s.age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}







/*
Constructor in Java:

- A constructor is a special method which is invoked automatically at the time of object creation.

Key Points:
-----------------------------
1. Constructors have the same name as the class name.

2. Constructors do not have a return type.
   (Not even void)

3. Constructors are called only once, when the object is created.

4. Memory allocation for the object happens when the constructor is called.


5. Key Notes
->If no constructor is defined, Java automatically provides a default constructor.

->If you define any constructor, Java does NOT give a default one.

->‘this’ keyword is commonly used inside constructors to refer to current object.

->Inheritance: Constructor of base class is called before derived class constructor.


*/