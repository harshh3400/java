public class call {
  public static void main(String[] args) {
    Student s = new Student();
    s.age = 90;
    System.out.println(s.age);
    s.change(s);
    System.out.println(s.age);
  }
}

class Student {
  int age;

  public static void change(Student s) {
    s.age = 100;
  }
}