package com.donggi;

import java.util.*;

public class BaseballGame {

    Scanner sc = new Scanner(System.in);
    String[] numberArray;
    int[] realNumberArray = new int[3];
    int ball;
    int strike;

    static Set<Integer> computerNumberSet = new HashSet<>();
    ArrayList<Integer> computerNumberArrayList = new ArrayList<>(computerNumberSet);

    BaseballGame() {

        System.out.print("세 개의 숫자를 입력해주세요 : ");
        numberArray = sc.nextLine().split(" |");

        for (int i = 0; i < numberArray.length; i++) {
            realNumberArray[i] = Integer.parseInt(numberArray[i]);
        }

        for (int i = 0; i < computerNumberArrayList.size(); i++) {
            for (int j = 0; j < realNumberArray.length; j++) {

                numberCompareBall(i, j);

                numberCompareStrike(i, j);

            }
        }

        if (ball == 0 && strike == 0) {
            System.out.println("낫싱");
        }

        System.out.println("ball : " + ball);
        System.out.println("strike : " + strike);
    }

    private void numberCompareStrike(int i, int j) {
        if (i == j && Integer.compare(computerNumberArrayList.get(i), realNumberArray[j]) == 0) {
            strike++;
        }
    }

    private void numberCompareBall(int i, int j) {
        if (i != j && Integer.compare(computerNumberArrayList.get(i), realNumberArray[j]) == 0) {
            ball++;
        }
    }

    public static void ComputerNumber() {
        while (computerNumberSet.size() < 3) {
            int randomNumber = (int) (Math.random() * 9) + 1;
            computerNumberSet.add(randomNumber);
        }
        System.out.println(computerNumberSet);
    }
}
