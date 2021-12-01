package com.donggi;

public class Command {

    Input input = new Input();

    public void cubeCommand() {

        switch (input.command) {
            case "U":
                System.out.println("U를 입력하였습니다");
                break;
            case "U'":
                System.out.println("U'를 입력하였습니다");
                break;
            case "R":
                System.out.println("R를 입력하였습니다");
                break;
            case "R'":
                System.out.println("R'를 입력하였습니다");
                break;
            case "L":
                System.out.println("L를 입력하였습니다");
                break;
            case "L'":
                System.out.println("L'를 입력하였습니다");
                break;
            case "B":
                System.out.println("B를 입력하였습니다");
                break;
            case "B'":
                System.out.println("B'를 입력하였습니다");
                break;
            case "Q":
                System.out.println("Q를 입력하였습니다");
                break;
        }
    }
}
