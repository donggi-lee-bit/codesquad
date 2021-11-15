package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        start();
        print();
    }


    public static void start() {
        System.out.print("hosh> ");
    }

    public static void print() {
        System.out.println("hosh> " + Input.input());
        print();
    }
}
