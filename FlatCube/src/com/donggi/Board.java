package com.donggi;

public class Board {
    public static void main(String[] args) {
        Board board = new Board();
        board.myBoard();

    }

    public void myBoard() {

        Print print = new Print();

        String[][] boardArray = new String[][]{
                {"R ", "R ", "W "},
                {"G ", "C ", "W "},
                {"G ", "B ", "B "}
        };

        // 오른쪽으로 한 칸 밀기
//        String[][] tempArray = new String[1][1];
//        tempArray[0][0] = boardArray[0][0];
//        boardArray[0][0] = boardArray[0][2];
//        boardArray[0][1] = tempArray[0][0];
//        boardArray[0][2] = boardArray[0][1];

        // 왼쪽으로 한 칸 밀기
        String[][] tempArray = new String[1][1];
        tempArray[0][0] = boardArray[0][0];
        boardArray[0][0] = boardArray[0][1];
        boardArray[0][1] = boardArray[0][2];
        boardArray[0][2] = tempArray[0][0];

        print.printBoard(boardArray);
    }
}
