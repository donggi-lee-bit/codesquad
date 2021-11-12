package com.company.생활코딩;

public class ExceptionApp {

  public static void main(String[] args) {
    System.out.println(1);
    int[] scores = {10, 20, 30};
    try {
      System.out.println(2);
//      System.out.println(scores[3]);
      System.out.println(3);
      System.out.println(2 / 0);
      System.out.println(4);
    } catch (Exception e) {
      System.out.println("뭔가 이상하네요. 오류가 발생했네. 아래에 있던 오류메세지의 조상 격인 Exception 하나로 퉁 칠 수가 있네. ");
    }
    System.out.println(5);

  }

}
