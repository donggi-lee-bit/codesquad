package com.donggi;

import java.util.Scanner;

public class BaseballGame {

    Scanner sc = new Scanner(System.in);
    String[] numberArray;
    int[] computerNumber = new int[3];
    int[] realNumberArray = new int[3];
    int ball;
    int strike;

    BaseballGame() {
        ComputerNumber();

        System.out.print("세 개의 숫자를 입력해주세요 : ");
        numberArray = sc.nextLine().split(" |");

        for (int i = 0; i < numberArray.length; i++) {
            realNumberArray[i] = Integer.parseInt(numberArray[i]);
        }

        for (int i = 0; i < computerNumber.length; i++) {
            for (int j = 0; j < realNumberArray.length; j++) {
                Integer.compare(computerNumber[i], realNumberArray[j]);
                System.out.printf("compare 몇번하나 보자 ㅡㅡ i : %d j : %d \n", computerNumber[i], realNumberArray[j]);
            }
        }


    }

    void ComputerNumber() {
        for (int i = 0; i < computerNumber.length; i++) {
            computerNumber[i] = (int) (Math.random() * 9);
            System.out.println("컴퓨터 숫자는 : " + computerNumber[i]);
        }
    }
}
