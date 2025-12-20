public class Main {
  public static void main(String[] args) {
    int age = 15;

    if (age<18) {
      System.out.println("child");
      
      // Nested if
      if (age>=18) {
        System.out.println("adult");
      }
      else (age>=30) {
        System.out.println("senior citizen");
      }
    }
  }
}
