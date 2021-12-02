package com.company.재귀의기초;

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //int num = sc.nextInt();

    int num = 10;
    System.out.println(myFactorial(num));
  }
  public static int myFactorial(int n) {
    return n * myFactorial(n - 1);
  }
}