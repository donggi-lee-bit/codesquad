package com.donggi.GameMachine;

import java.util.Scanner;

public class Input {

  public static void myInput() {
    Scanner sc = new Scanner(System.in);
    String moveCharacter = sc.next();

    switch (moveCharacter) {
      case "w":
        System.out.println(moveCharacter);
        break;
      case "a":
        System.out.println(moveCharacter);
        break;
      case "s":
        System.out.println(moveCharacter);
        break;
      case "d":
        System.out.println(moveCharacter);
        break;
    }
  }

}
