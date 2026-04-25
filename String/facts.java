public class facts{
    public static void main(String[] args) {
        StringBuffer sc=new StringBuffer("Harshad");
        sc.append("Shinde");
        System.out.println(sc.capacity());

        StringBuilder sb=new StringBuilder("Harshad");
        sb.append("Shinde");
        System.out.println(sb.capacity());
        }
    
}
