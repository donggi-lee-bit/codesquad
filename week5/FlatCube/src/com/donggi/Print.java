package com.donggi;

import java.util.LinkedList;
import java.util.List;

public class Print {

    Print() { }

    Print(List<LinkedList<String>> boardArray) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < boardArray.size(); i++) {
            for (int j = 0; j < boardArray.get(i).size(); j++) {
                sb.append(boardArray.get(i).get(j));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
