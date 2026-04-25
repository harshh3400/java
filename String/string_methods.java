public class string_methods {
    public static void printletters(String a){
        for(int i=0;i<a.length();i++)
        {
            System.out.print(a.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String a="Hello";
        String b=" World";
        String c=a+b;
        System.out.println(c);
        System.out.println(c.charAt(2));
        printletters(c);
    }
}
