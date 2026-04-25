public class typeconversion {
    /*
    -Type conversion in Java means changing one data type into another.
    -byte → short → int → long → float → double
         ↑     ↑     ↑      ↑      ↑
      (automatic promotion)
    -implict conversion
     */
    public static void main(String args[]){
    int a = 10;
    double b = a;  // int → double
    System.out.println(b);  // Output: 10.0
    }
}
