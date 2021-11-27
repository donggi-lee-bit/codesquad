package com.donggi;

import com.donggi.GameMachine.Input;

public class Main {

    public static void main(String[] args) {
	// write your code here
        start();
    }

    private static void start() {
        Input input = new Input();

        while (true) {
            input.myInput();
        }
    }
}
