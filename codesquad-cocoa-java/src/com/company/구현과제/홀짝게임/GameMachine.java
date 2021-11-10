package 홀짝게임;

public class GameMachine {

  static int point = 100;
  static int inputUserPoint = 0;

  public static void gameOddEven() {
    UserInput in = new UserInput();
    int cnt = 0;

    if (in.inputOddEven().equals(Computer.computerOddEven())) {
      System.out.println("You Win!!!!!!!!!!");
      cnt++;
      getUpDownPoint(cnt);
    } else {
      System.out.println("Lose.");
      getUpDownPoint(cnt);
      conditionsToEndTheGame();
    }
  }

  public static void conditionsToEndTheGame() {
    UserInput in = new UserInput();

    if (point > 0) {
      inputUserPoint = in.inputBet();
    } else {
      System.out.println("패배");
    }
  }

  public static void getUpDownPoint(int n) {
    Computer com = new Computer();
    UserInput in = new UserInput();

    if (n == 1) {
      point += inputUserPoint;
      System.out.printf("게임에서 이겼습니다. 당신의 점수는 \'%d\'입니다. \n", point);
      com.currentComputerPoint(n);
      inputUserPoint = in.inputBet();
    } else {
      point -= inputUserPoint;
      System.out.printf("졌습니다. 당신의 점수는 \'%d\'입니다. \n", point);
      com.currentComputerPoint(n);
    }
  }
}
