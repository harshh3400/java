public class string_shortest_path {
    public static double shotest_path(String a){
        int x=0;
        int y=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='N'){
                y++;
            }
            else if(a.charAt(i)=='S'){
                y--;
            }
            else if(a.charAt(i)=='W'){
                x--;
            }
            else{
                x++;
            }
        }
        return Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        System.out.println(shotest_path("WNEENESENNN"));
    
    }
}
