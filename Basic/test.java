public class test {
  test() {
    System.out.println("Hello");
  }

  public static void main(String arg[]) {
    String a = "Hello";
    a.concat("World");
    System.out.println(a);
    try {
      int b = 10 / 0;
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("Programe Executed !");
    }
  }
}

class MyThread extends Thread {
  public void run() {
    try {
      Thread.sleep(2000); // Blocked state
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Thread resumed");
  }
}
