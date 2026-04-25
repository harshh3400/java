public class static_keyword {

    // 🔹 Static variable (shared among all objects)
    static String college = "MIT Pune";

    // 🔹 Instance variables (unique for each object)
    int id;
    String name;

    // 🔹 Static block (executed once when class is loaded)
    static {
        System.out.println("Static block executed - Class is loaded");
    }

    // 🔹 Constructor
    static_keyword(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 🔹 Static method (can access only static variables/methods directly)
    static void changeCollege(String s) {
        college = s;  // Can modify static variable
        System.out.println("College changed to: " + college);
    }

    // 🔹 Instance method (can access both static and non-static)
    void display() {
        System.out.println(id + " " + name + " " + college);
    }

    // 🔹 Main method (must be static so JVM can call it without object)
    public static void main(String[] args) {

        // Static method can be called without object
        static_keyword.changeCollege("Terna");

        // Creating objects
        static_keyword s1 = new static_keyword(1, "Harshad");
        static_keyword s2 = new static_keyword(2, "Sahil");

        // Display details
        s1.display();
        s2.display();
        static_keyword.changeCollege("VJTI");
        s1.display();
        static_keyword.changeCollege(college);
    }
}
