package com.company;

import java.util.Scanner;

public class Input {

  public static String input() {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String ls = "ls";

    if (str.equals(ls)) {
      str = Shell.ls();
    }
    return str;
  }
}
