package 홀짝게임;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Validation {

  public static void inputYourPoint() {
    UserInput in = new UserInput();

    try {
      if (GameMachine.inputUserPoint > GameMachine.point
          || GameMachine.inputUserPoint > Computer.computerPoint) {
        Validation.printErrorMessage();
        in.inputBet();
      }
    } catch (Exception e) {
      Validation.printErrorMessage();
    }
  }

  public static void printErrorMessage() {
    System.out.println("올바르지 않은 형식입니다.");
  }
}
