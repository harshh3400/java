// Base class
class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Single Inheritance (Student -> Person)
class Student extends Person {
    String grade;

    void study() {
        System.out.println(name + " is studying in grade " + grade);
    }
}

// Multilevel Inheritance (HeadBoy -> Student -> Person)
class HeadBoy extends Student {
    void lead() {
        System.out.println(name + " is leading the student council.");
    }
}

// Hierarchical Inheritance (Teacher -> Person)
class Teacher extends Person {
    String subject;

    void teach() {
        System.out.println(name + " teaches " + subject);
    }
}

// Another class under Hierarchical Inheritance (Clerk -> Person)
class Clerk extends Person {
    void manageRecords() {
        System.out.println(name + " is managing school records.");
    }
}

// Another class under Hierarchical Inheritance (Librarian -> Person)
class Librarian extends Person {
    void manageLibrary() {
        System.out.println(name + " is managing the school library.");
    }
}

// Main class to run the program
public class Inheritance {
    public static void main(String[] args) {
        // Single Inheritance
        Student s = new Student();
        s.name = "Amit";
        s.age = 15;
        s.grade = "10th";
        s.displayInfo();
        s.study();

        System.out.println();

        // Multilevel Inheritance
        HeadBoy hb = new HeadBoy();
        hb.name = "Rahul";
        hb.age = 16;
        hb.grade = "12th";
        hb.displayInfo();
        hb.study();
        hb.lead();

        System.out.println();

        // Hierarchical Inheritance
        Teacher t = new Teacher();
        t.name = "Mrs. Sharma";
        t.age = 40;
        t.subject = "Math";
        t.displayInfo();
        t.teach();

        System.out.println();

        Clerk c = new Clerk();
        c.name = "Mr. Joshi";
        c.age = 35;
        c.displayInfo();
        c.manageRecords();

        System.out.println();

        Librarian l = new Librarian();
        l.name = "Ms. Meena";
        l.age = 30;
        l.displayInfo();
        l.manageLibrary();
    }
}
