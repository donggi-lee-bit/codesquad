package com.company;

import java.util.Scanner;

public class Input {

  public static String input() {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String[] arr = str.split(" ");
    String ls = "ls";
    String cp = "cp";

    if (str.equals(ls)) {
      str = Shell.ls();
    } else if (arr[0].equals(cp)) {
      str = Shell.cp(arr[1], arr[2]);
    }
    return str;
  }

}
