package 홀짝게임;

import java.util.Scanner;

public class UserInput {

  public String input() {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    return str;
  }

  public int inputInteger() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    return num;
  }
}
