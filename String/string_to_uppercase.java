public class string_to_uppercase {
    public static StringBuilder to_uppercase(String a){
        StringBuilder sb=new StringBuilder("");
        sb.append(Character.toUpperCase(a.charAt(0)));
        for(int i=1;i<a.length();i++)
        {
            if(a.charAt(i)==' ' && i<a.length()-1){
                sb.append(a.charAt(i));
                i++;
                sb.append(Character.toUpperCase(a.charAt(i)));
            }else{
                sb.append(a.charAt(i));
            }
        }
        return sb;
    }
    public static void main(String[] args) {
        String demo="hi , i am harshad !";
        System.out.println(to_uppercase(demo));
    }
}
