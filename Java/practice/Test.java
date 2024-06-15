import java.util.Scanner;

public class Test {
  enum Days{SUN, MON, TUE, WED, THU, FRI, SAT};

  public static void main(String args[]){
    Days a;
    System.out.println("What's your favorite day? ");
    Scanner keyboard = new Scanner(System.in);
    a = Days.valueOf(keyboard.next());

    System.out.println("Your favorite day is " + a);
  }
}
