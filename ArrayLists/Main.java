class MyTask extends Thread {
  public void run() {
    for (int i = 1; i <= 3; i++) {
      System.out.println(Thread.currentThread().getName() + " - Count: " + i);
      try {
        Thread.sleep(500);
      } catch (Exception e) {
      }
    }
  }
}

public class Main {
  public static void main(String[] args) {
    MyTask t1 = new MyTask();
    MyTask t2 = new MyTask();

    t1.start(); // Starts Thread-0
    t2.start(); // Starts Thread-1

    System.out.println("Main thread is also running!");
  }
}
