package com.donggi;

import java.util.Scanner;

public class Input {

    Scanner sc = new Scanner(System.in);

    String userInput() {
        String command = sc.next().toUpperCase();
        return command;
    }



}
