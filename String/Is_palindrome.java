public class Is_palindrome {
    public static void is_Palindrome(String test){
        int low=0;
        int end=test.length()-1;
        boolean result=true;
        while(low<end){
            if(test.charAt(low)!=test.charAt(end)){
                result=false;
                break;
            }
            low++;
            end--;
        }
        if(result==false){
            System.out.println("String is not Palindrome!");
        }
        else{
            System.out.println("String is Palindrome!");
        }
    }
    public static void main(String[] args) {
        is_Palindrome("racecar");
    }
}
