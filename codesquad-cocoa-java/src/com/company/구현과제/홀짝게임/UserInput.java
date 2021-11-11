package 홀짝게임;

import java.util.Scanner;

public class UserInput {

  public String input() {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    return str;
  }

  public int inputBet() {
    System.out.println("베팅할 포인트를 입력해주세요 : ");
    Scanner sc = new Scanner(System.in);

    GameMachine.inputUserPoint = sc.nextInt();
    Validation.inputYourPoint();
    return GameMachine.inputUserPoint;
  }

  public String inputOddEven() {
    System.out.println("홀, 짝 중 하나를 입력하세요 : ");
    String str = input();
    //Validation.incorrectString(str);

    return str;
  }
}

