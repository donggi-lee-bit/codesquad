package com.company.pushouttheword;

import com.company.Main;

import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);
    Machine machine = new Machine();

    public void userInput() {
        // trim() 으로 공백 지워야겠다
        System.out.print("하나의 단어를 입력해주세요 : ");
        String inputWord = sc.nextLine();

        System.out.print("숫자를 입력해주세요 : ");
        int inputCount = sc.nextInt();

        System.out.print("단어를 이동시키고자 하는 방향을 입력해주세요 : ");
        String inputDir = sc.next().toUpperCase();


//        check(inputWord, inputCount, inputDir);

        machine.game(inputWord, inputCount, inputDir);
    }

//    private void check(String word, int count, String dir) {
//
//        checkWord(word);
//        checkCount(count);
//        checkDir(dir);
//    }

//    private String checkWord(String word) {
//        if (word.split(" ").length == 1) {
//            return word;
//        } else {
//            System.out.println("잘못된 형식의 입력입니다.");
//            Main.start();
//            return word;
//        }
//    }

//    private int checkCount(int count) {
//        if (-100 <= count && count < 100) {
//            return count;
//        } else {
//            System.out.println("잘못된 형식의 입력입니다.");
//            Main.start();
//            return count;
//        }
//    }
//
//    private String checkDir(String dir) {
//        if (dir.equals("r") || dir.equals("R") || dir.equals("l") || dir.equals("L")) {
//            return dir;
//        } else {
//            System.out.println("잘못된 형식의 입력입니다.");
//            Main.start();
//            return dir;
//        }
//    }
}
