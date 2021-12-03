package com.donggi;

public class Command {

    static boolean isGoing = true;

    Board board = new Board();

    Command() {

        Input input = new Input();

        switch (input.userInput()) {
            case "U":
                board.currentBoard("U");
                break;
            case "U'":
                board.currentBoard("U'");
                break;
            case "R":
                board.currentBoard("R");
                break;
            case "R'":
                board.currentBoard("R'");
                break;
            case "L":
                board.currentBoard("L");
                break;
            case "L'":
                board.currentBoard("L'");
                break;
            case "B":
                board.currentBoard("B");
                break;
            case "B'":
                board.currentBoard("B'");
                break;
            case "Q":
                System.out.println("Bye~");
                quit();
                break;
            default:
                System.out.println("잘못된 입력이옵니다.");
        }
    }

    private void quit() {
        isGoing = false;
    }
}
