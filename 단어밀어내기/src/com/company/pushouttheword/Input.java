package com.company.pushouttheword;

import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);
    Machine machine = new Machine();

    public void userInput() {
        System.out.println("단어, 이동할 횟수, 방향을 입력해주세요");
        String input = sc.nextLine();
        String[] inputArray;
        inputArray = input.split(" ");

        String word = inputArray[0];
        int count = Integer.parseInt(inputArray[1]);
        String dir = inputArray[2].toUpperCase();

        machine.game(word, count, dir);
    }
}
