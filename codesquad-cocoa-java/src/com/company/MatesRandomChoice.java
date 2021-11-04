package com.company;


import java.util.HashSet;
import java.util.Scanner;

public class MatesRandomChoice {
  public MatesRandomChoice() {
  }

  // 셔플 사용해보기
  public static void main(String[] args) {
    String[] RandomNames = {"Jerry", "K", "Mk", "Tany", "donggi", "mandoo", "taksu", "노리", "땃쥐", "피오", "후"};

    System.out.println("몇 명인가요?");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    HashSet nameSet= new HashSet();

    while (nameSet.size() < num) {
      int random = (int) (Math.random() * (RandomNames.length));
      nameSet.add(RandomNames[random]);
    }
    System.out.println(nameSet);
  }
}