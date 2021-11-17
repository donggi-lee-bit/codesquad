package com.company.MyShell;

import java.util.Scanner;

public class Input {

  public static Scanner sc = new Scanner(System.in);

  public static String input(String str) {
    System.out.print(str);
    return sc.next();
  }
}
