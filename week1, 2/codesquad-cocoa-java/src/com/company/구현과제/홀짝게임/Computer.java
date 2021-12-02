package 홀짝게임;

import java.util.Random;

public class Computer {
  static int computerPoint = 120;
  static int numStage = 1;


  public static String computerOddEven() {
    Random rand = new Random();
    int randomInt = rand.nextInt(20) + 1;
    String odds = "홀";
    String evens = "짝";

    if (randomInt % 2 == 0) {
      System.out.println(randomInt);
      return evens;
    } else {
      System.out.println(randomInt);
      return odds;
    }
  }

  public int currentComputerPoint(int score) {


    if (score == 1 && computerPoint > 0) {
      computerPoint -= GameMachine.inputUserPoint;

      if (computerPoint == 0) {
        newStage();
      } else {
        System.out.printf("상대 점수는 \'%d\' 입니다. \n", computerPoint);
      }
    } else {
      computerPoint += GameMachine.inputUserPoint;
      System.out.printf("상대 점수는 \'%d\' 입니다. \n", computerPoint);
    }
    return computerPoint;
  }

  public void newStage() {

    if (numStage != 8) {
      ++numStage;
    } else {
      System.out.println("============ 플레이어의 승리입니다 ============");
    }
    computerPoint = GameMachine.point * ((int) (Math.pow(1.2, numStage)));
    int current = currentComputerPoint(computerPoint);
    System.out.printf("stage %d 새롭게 시작한 컴퓨터의 점수는 : %d \n", numStage, current);
  }
}
