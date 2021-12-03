package com.donggi;

import java.util.Scanner;

public class BaseballGame {

    Scanner sc = new Scanner(System.in);
    String[] numberArray;
    int[] computerNumber = new int[3];

    BaseballGame() {
        ComputerNumber();

        System.out.print("세 개의 숫자를 입력해주세요 : ");
        numberArray = sc.nextLine().split(" |");
        System.out.println(numberArray[0]);
        System.out.println(numberArray[1]);

    }

    void ComputerNumber() {
        for (int i = 0; i < computerNumber.length; i++) {
            computerNumber[i] = (int) (Math.random() * 9);
            System.out.println("컴퓨터 숫자는 : " + computerNumber[i]);
        }
    }
}
