package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        start();
        printUser();
    }


    public static void start() {
        System.out.print("hosh> ");
    }

    public static void printUser() {
        System.out.println("hosh> " + Input.input());
    }
}
