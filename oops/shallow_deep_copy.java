public class shallow_deep_copy {
    public static void main(String[] args) {
        int[] marks = {85, 90, 95};
        Student s1=new Student(20,"Harshad",marks);
        Student s2=new Student(s1);
        s1.marks[0]=80;
        s2.display();

    }
}
class Student{
    int age;
    String name;
    int marks[];

    Student(int age,String name,int marks[]){
        this.age=age;
        this.name=name;
        this.marks=marks;
    }
    //Shallow copy constructor
    /*Student(Student s){
        marks=new int[3];
        this.age=s.age;
        this.name=s.name;
        this.marks=s.marks;
    }*/
    // deep copy constructor
    Student(Student s){
        marks=new int[3];
        this.age=s.age;
        this.name=s.name;
        for(int i=0;i<this.marks.length;i++)
        {
            this.marks[i]=s.marks[i];
        }
    }
    void display()
    {
        System.out.println("Age="+this.age);
        System.out.println("Name="+this.name);
        for(int i=0;i<this.marks.length;i++)
        {
            System.out.println("Marks"+i+"="+this.marks[i]);
        }
    }
}