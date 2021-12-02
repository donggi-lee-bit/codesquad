package com.company.pushouttheword;

public class Machine {

    public void game(String word, int count, String dir) {
        checkMinusCount(count, dir);
        int countResult = Math.abs(count) % word.length();

        pushItToTheLeftOrRight(dir, countResult, word);
    }

    private void pushItToTheLeftOrRight(String dir, int count, String word) {
        StringBuilder sb = new StringBuilder();

        Print print = new Print();

        if (dir.equals("L")) {
            int start = count;
            sb.append(word.substring(start, word.length()));
            sb.append(word.substring(0, start));

            print.myPrint(sb.toString());
        }

        if (dir.equals("R")) {
            int newCount = word.length() - count;
            sb.append(word.substring(newCount, word.length()));
            sb.append(word.substring(0, newCount));

            print.myPrint(sb.toString());
        }
    }

    private String checkMinusCount(int count, String dir) {
        if (count < 0 && dir.equals("R")) {
            dir = "L";
            return dir;
        }

        if (count < 0 && dir.equals("L")) {
            dir = "R";
            return dir;
        }
        return dir;
    }
}
