package com.donggi;

import java.util.LinkedList;
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
            command = sc.nextLine().split(""); // 조건식 L' 처럼 '이 들어갈 경우 잘라줄 조건 추가해야함
            mix();
        }
    }

    private void mix() {

        for (int i = 0; i < command.length; i++) {
            if (command[i].equals("U")) {
                String pop = cubeBoard.get(0).removeFirst();
                cubeBoard.get(0).addLast(pop);
            }

            if (command[i].equals("U'")) {
                String pop = cubeBoard.get(0).removeLast();
                cubeBoard.get(0).addFirst(pop);
            }

            if (command[i].equals("R")) {
                String pop = cubeBoard.get(0).removeLast();
                cubeBoard.get(0).addLast(cubeBoard.get(1).removeLast());
                cubeBoard.get(1).addLast(cubeBoard.get(2).removeLast());
                cubeBoard.get(2).addLast(pop);
            }

            if (command[i].equals("R'")) {
                String pop = cubeBoard.get(2).removeLast();
                cubeBoard.get(2).addLast(cubeBoard.get(1).removeLast());
                cubeBoard.get(1).addLast(cubeBoard.get(0).removeLast());
                cubeBoard.get(0).addLast(pop);
            }

            if (command[i].equals("L")) {
                String pop = cubeBoard.get(2).removeFirst();
                cubeBoard.get(2).addFirst(cubeBoard.get(1).removeFirst());
                cubeBoard.get(1).addFirst(cubeBoard.get(0).removeFirst());
                cubeBoard.get(0).addFirst(pop);
            }

            if (command[i].equals("L'")) {
                String pop = cubeBoard.get(0).removeFirst();
                cubeBoard.get(0).addFirst(cubeBoard.get(1).removeFirst());
                cubeBoard.get(1).addFirst(cubeBoard.get(2).removeFirst());
                cubeBoard.get(2).addFirst(pop);
            }

            if (command[i].equals("B")) {
                String pop = cubeBoard.get(2).removeLast();
                cubeBoard.get(2).addFirst(pop);
            }

            if (command[i].equals("B'")) {
                String pop = cubeBoard.get(0).removeFirst();
                cubeBoard.get(0).addLast(pop);
            }

            if (command[i].equals("Q")) {
                System.out.print("Bye~");
                System.exit(0);
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
