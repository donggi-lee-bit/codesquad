package com.company.pushouttheword;

import com.company.Main;

import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);
    Machine machine = new Machine();

    public void userInput() {
        String inputWord = getWord();

        int inputCount = getCount();

        String inputDir = getDir();

        if (check(inputWord, inputCount, inputDir)) {
            machine.game(inputWord, inputCount, inputDir);
        }
    }

    private String getWord() {
        System.out.print("하나의 단어를 입력해주세요 : ");
        return sc.nextLine();
    }

    private int getCount() {
        System.out.print("숫자를 입력해주세요 : ");
        return sc.nextInt();
    }

    private String getDir() {
        System.out.print("단어를 밀어낼 방향을 입력해주세요 (ex : l, L, r, R) : ");
        return sc.next().toUpperCase();
    }

    private boolean check(String word, int count, String dir) {
        if (!(checkWord(word))) {
            System.out.println("잘못된 형식의 입력입니다.");
            return false;
        }

        if (!(checkCount(count))) {
            System.out.println("잘못된 형식의 입력입니다.");
            return false;
        }

        if (!(checkDir(dir))) {
            System.out.println("잘못된 형식의 입력입니다.");
            return false;
        }
        return true;
    }

    private boolean checkWord(String word) {
        return (word.length() > 0 && word.split("\\s+").length == 1);
    }

    private boolean checkCount(int count) {
        return -100 <= count && count < 100;
    }

    private boolean checkDir(String dir) {
        return dir.equals("r") || dir.equals("R") || dir.equals("l") || dir.equals("L");
    }
}
