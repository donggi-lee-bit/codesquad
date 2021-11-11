package 홀짝게임;

import java.util.ArrayList;
import java.util.List;

public class Validation {

  public static void checkBetPoint() {
    //inputOnlyInteger();
  }

  public static void checkBetString() {

  }

//  public static void incorrectString(String input) {
//    List<String> arr = new ArrayList<>();
//    arr.add("홀");
//    arr.add("짝");
//
//    if (arr.contains() {
//      printErrorMessage();
//    }
//  }

//  public static void inputOnlyInteger(String errorInput) {
//    UserInput in = new UserInput();
//
//    if (errorInput) {
//      in.inputBet();
//    }
//  }

  public static void inputYourPoint() {
    UserInput in = new UserInput();

    if (GameMachine.inputUserPoint > GameMachine.point || GameMachine.inputUserPoint > Computer.computerPoint) {
      Validation.printErrorMessage();
      in.inputBet();
    }
  }

  public static void printErrorMessage() {
    System.out.println("올바르지 않은 형식입니다.");
  }
}
