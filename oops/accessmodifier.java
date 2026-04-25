public class accessmodifier {
    public static void main(String[] args) {
        person p1=new person();
        p1.setAge(15);
        System.out.println(p1.getAge());
    }
}
class person{
    private int age;

    void setAge(int newAge){
        age=newAge;
    }
    int getAge()
    {
        return age;
    }
}

/*---------------------------------------------

| Access Modifier | within class | within package | outside package by subclass | outside package |
|-----------------|--------------|----------------|-----------------------------|-----------------|
| private         | Yes (Y)      | No (N)         | No (N)                      | No (N)          |
| default         | Yes (Y)      | Yes (Y)        | No (N)                      | No (N)          |
| protected       | Yes (Y)      | Yes (Y)        | Yes (Y)                     | No (N)          |
| public          | Yes (Y)      | Yes (Y)        | Yes (Y)                     | Yes (Y)         |

---------------------------------------------
*/
