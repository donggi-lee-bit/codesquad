package com.donggi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cube {

    List<LinkedList<String>> cubeBoard = new LinkedList<>();

    void currentCube() {
        cubeBoard.add(new LinkedList<>());
        cubeBoard.get(0).add("R ");
        cubeBoard.get(0).add("R ");
        cubeBoard.get(0).add("W ");

        cubeBoard.add(new LinkedList<>());
        cubeBoard.get(1).add("G ");
        cubeBoard.get(1).add("C ");
        cubeBoard.get(1).add("W ");

        cubeBoard.add(new LinkedList<>());
        cubeBoard.get(2).add("G ");
        cubeBoard.get(2).add("B ");
        cubeBoard.get(2).add("B ");

    }

    Cube() {
        printCube();
        Scanner sc = new Scanner(System.in);
        System.out.print("CUBE> ");
        String[] command = sc.nextLine().split(" ");
        mix();
    }

    private void mix() {
    }

    private void printCube() {
        currentCube();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cubeBoard.size(); i++) {
            for (int j = 0; j < cubeBoard.get(i).size(); j++) {
                sb.append(cubeBoard.get(i).get(j));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
