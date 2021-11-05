package com.company.구현과제;

import java.util.Scanner;

public class MakeIndianName {

  public static void main(String[] args) {

    System.out.println("태어난 생년월일을 입력해주세요 (예: 1994-04-08) : ");

    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    int splitNumBox[] = SplitNum(str);
    int getYear = splitNumBox[0];
    FindIndian(CalculateNum(getYear), splitNumBox[1], splitNumBox[2]);
    Print(FindIndian(CalculateNum(getYear), splitNumBox[1], splitNumBox[2]));
  }

  // int 배열 만들어서 split한 거 반복문으로 집어넣고 싶은데 왜 안될까
  public static int[] SplitNum(String s) {
    String[] mySplit = s.split("-|\\.");

    int a = Integer.parseInt(mySplit[0]);
    int b = Integer.parseInt(mySplit[1]);
    int c = Integer.parseInt(mySplit[2]);

    return new int[] {a, b, c};
  }

  public static void Print(String a[]) {
    System.out.printf("당신은 %s %s %s입니다.", a[0], a[1], a[2]);
  }

  public static String[] FindIndian(int a, int b, int c) {
    String[] yearName = {"시끄러운", "푸른", "어두운", "조용한", "웅크린", "백색", "지혜로운", "용감한", "날카로운",
        "욕심많은"};

    String[] monthName = {" ", "늑대", "태양", "양", "매", "황소", "불꽃", "나무", "달빛",
        "말", "돼지", "하늘", "바람"};

    String[] dayName = {" ", "와(과) 함께 춤을", "의 기상", "는(은) 그림자 속에", "",
        "", "", "의 환생", "의 죽음", "아래에서", "를 보라.",
        "이(가) 노래하다.", "그림자", "의 일격", "에게 쫓기는 남자", "의 행진", "의 왕",
        "의 유령", "을 죽인 자", "은(는) 맨날 잠만 잔다", "처럼", "의 고향", "의 전사", "은(는) 나의 친구",
        "의 노래", "의 정령", "의 파수꾼", "의 악마", "와(과) 같은 사나이", "을(를) 쓰러뜨린 자", "의 혼", "은(는) 말이 없다"};

    return new String[] {yearName[a], monthName[b], dayName[c]};
  }

  public static int CalculateNum(int n) {
    return n % 10;
  }
}