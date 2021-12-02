package com.donggi;

import java.util.LinkedList;
import java.util.List;

public class Board {
    public static void main(String[] args) {
//        Board board = new Board();
//
//        board.myBoard();

        List<LinkedList<String>> listArray = new LinkedList<LinkedList<String>>();
        List<String> list1 = new LinkedList<String>();
        List<String> list2 = new LinkedList<>();
        List<String> list3 = new LinkedList<>();

        list1.add("R ");
        list1.add("R ");
        list1.add("W ");

        listArray.add((LinkedList<String>) list1);

        list2.add("G ");
        list2.add("C ");
        list2.add("W ");

        listArray.add((LinkedList<String>) list2);

        list3.add("G ");
        list3.add("B ");
        list3.add("B ");

        listArray.add((LinkedList<String>) list3);

        for (int i = 0; i < listArray.size(); i++) {
            for (int j = 0; j < listArray.get(i).size(); j++) {
                System.out.print(listArray.get(i).get(j));
            }
            System.out.println();
        }

    }

    public void myBoard() {

        Print print = new Print();

        String[][] boardArray = new String[][]{
                {"A ", "B ", "C "},
                {"G ", "C ", "W "},
                {"G ", "B ", "B "}
        };




        // 오른쪽으로 한 칸 밀기
        String[][] tempArray = new String[1][1];
        tempArray[0][0] = boardArray[0][2];
        boardArray[0][2] = boardArray[0][1];
        boardArray[0][1] = boardArray[0][0];
        boardArray[0][0] = tempArray[0][0];

//        // 왼쪽으로 한 칸 밀기
//        String[][] tempArray = new String[1][1];
//        tempArray[0][0] = boardArray[0][0];
//        boardArray[0][0] = boardArray[0][1];
//        boardArray[0][1] = boardArray[0][2];
//        boardArray[0][2] = tempArray[0][0];

        print.printBoard(boardArray);
    }
}
