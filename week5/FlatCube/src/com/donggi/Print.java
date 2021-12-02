package com.donggi;

public class Print {

    public void printBoard(String[][] boardArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray[i].length; j++) {
                sb.append(boardArray[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
