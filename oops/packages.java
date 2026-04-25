/*
1] What is a Package in Java?
->A package is a namespace that organizes a set of related classes, interfaces, and sub-packages.

2] Types of Packages
->Built-In packages (e.g
java.lang	Core classes (String, Math, Object, etc.)
java.util	Collections, Date, Scanner, etc.)


 */

public class packages {
    
}
/*
Creating a package
File: MyClass.java
package mypackage;

public class MyClass {
    public void display() {
        System.out.println("Hello from my custom package!");
    }
}

Use the Package in Another Class:
java
Copy
Edit
// File: Test.java
import mypackage.MyClass;

public class Test {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
 */

 /*
  * Explanation of Each Component:(import java.util.*;)
Part	 Meaning
import	:-A Java keyword used to bring built-in or user-defined packages/classes into your current Java file.
java	:-This is the top-level package provided by the Java Standard Library (JDK).
util	:-A sub-package of java — it contains utility classes like ArrayList, HashMap, Scanner, etc.
* (asterisk)	:-This is a wildcard that means "import all classes and interfaces in the java.util package".

;	:-The semicolon is used to end the import statement, just like any other Java statement.

  */