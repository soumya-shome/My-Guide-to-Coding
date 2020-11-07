public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println("i = " + i);

      try {
        Thread.sleep(1000);

      } catch (InterruptedException ie) {
        ie.printStackTrace();
      }
    }
  }
}