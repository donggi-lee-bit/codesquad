package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        start();
        printUser();
    }


    public static void start() {
        System.out.println("hosh> ");
    }
    public static void printUser() {
        System.out.println("hosh>" + " " + input());
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
