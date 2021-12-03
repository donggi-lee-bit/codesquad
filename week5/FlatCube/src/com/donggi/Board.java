package com.donggi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Board {

    List<LinkedList<String>> listArray = new LinkedList<>();
    Deque<String> list1 = new LinkedList<>();
    List<String> list2 = new LinkedList<>();
    List<String> list3 = new LinkedList<>();

    public void currentBoard(String command) {

        myBoard();

        //         가장 윗줄을 오른쪽으로 한 칸 밀기
        if (command.equals("U'")) {
            String listpop = list1.removeLast();
            list1.addFirst(listpop);
        }

        // 가장 윗줄을 왼쪽으로 한 칸 밀기
        String listpop = list1.removeFirst();
        list1.addLast(listpop);

        new Print(listArray);
    }

    public void myBoard() {

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
    }
}
