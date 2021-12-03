package com.donggi;

import java.util.LinkedList;
import java.util.List;

public class Board {
    public static void main(String[] args) {
        Board board = new Board();

        board.myBoard();


    }

    public void myBoard() {

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

        Print print = new Print(listArray);

    }
}
