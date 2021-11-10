package 홀짝게임;

import java.util.Random;

public class Computer {
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

  public static void computerPoint(int score) {

    if (score == 1 && computerPoint > 0) {
      computerPoint -= inputPoint;

      if (computerPoint == 0) {
        newStage();
      } else {
        System.out.printf("상대 점수는 \'%d\' : \n", computerPoint);
      }
    } else {
      computerPoint += inputPoint;
      System.out.printf("상대 점수는 \'%d\' : \n", computerPoint);
    }
  }
}
