package 홀짝게임;

public class GameMachine {

  static int point = 100;
  static int inputUserPoint = 0;

  public static void myOddEven() {
    System.out.println("홀, 짝 중 하나를 입력하세요 : ");
    UserInput in = new UserInput();
    Computer com = new Computer();

    String input = in.input();
    int cnt = 0;

    if (input.equals(Computer.computerOddEven())) {
      System.out.println("You Win!!!");
      cnt++;
      point += inputUserPoint;
      System.out.printf("게임에서 이겼습니다. 당신의 점수는 \'%d\'입니다. \n", point);
      com.currentComputerPoint(cnt);
      inputUserPoint = in.inputInteger();

    } else {
      System.out.println("Lose.");
      cnt--;
      point -= inputUserPoint;
      System.out.printf("졌습니다. 당신의 점수는 \'%d\'입니다. \n", point);
      com.currentComputerPoint(cnt);

      if (point > 0) {
        inputUserPoint = in.inputInteger();
      } else {
        System.out.println("패배");
      }
    }
  }
}
