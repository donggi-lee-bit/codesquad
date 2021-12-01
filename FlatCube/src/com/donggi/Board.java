package com.donggi;

public class Board {

    public void currentBoard() {

        Print print = new Print();

        String[][] boardArray = new String[][]{
                {"R", "R", "W"},
                {"G", "C", "W"},
                {"G", "B", "B"}
        };

        print.printBoard(boardArray);
    }
}
