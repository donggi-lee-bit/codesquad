package com.donggi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cube {

    LinkedList<LinkedList<String>> cubeBoard = new LinkedList<>();
    String[] command;
    boolean run = true;

    Cube() {
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

        Scanner sc = new Scanner(System.in);
        printCube();
        while (run) {
            System.out.print("CUBE> ");
            command = sc.nextLine().split("");
            mix();
        }

    }

    private void mix() {

        for (int i = 0; i < command.length; i++) {
            if (command[i].equals("U")) {
                String pop = cubeBoard.get(0).removeFirst();
                cubeBoard.get(0).addLast(pop);
            }

            if (command[i].equals("Q")) {
                System.out.println("Bye~");
                run = false;
            }

            System.out.println(command[i]);
            printCube();
        }
    }

    private void printCube() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cubeBoard.size(); i++) {
            for (int j = 0; j < cubeBoard.get(i).size(); j++) {
                sb.append(cubeBoard.get(i).get(j));
            }
            sb.append("\n");
        }

        System.out.println(sb);
        sb.setLength(0);
    }
}
