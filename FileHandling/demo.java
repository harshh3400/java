import java.io.File;
//import java.io.FileWriter;
//import java.io.IO;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class demo {
  public static void main(String[] args) {
    File f1 = new File("demo.txt");
    try {
      f1.createNewFile();
    } catch (IOException e) {
    }
    // try {
    // FileWriter w1 = new FileWriter("demo.txt");
    // w1.write("This is file");
    // w1.close();
    // } catch (IOException e) {
    // System.out.println(e.getMessage());
    // }
    try {
      File f2 = new File("demo.txt");
      Scanner sc = new Scanner(f2);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    try {
      File f3 = new File("demo.txt");
      f3.delete();
    } catch (FileSystemNotFoundException e) {
      System.out.println(e.getMessage());
    }

  }
}