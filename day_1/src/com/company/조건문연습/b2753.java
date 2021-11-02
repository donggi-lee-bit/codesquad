package com.company;

import java.util.Scanner;

public class b2753 {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (((num % 4 == 0) && (num % 100 != 0)) || (num % 400 == 0)) {
            System.out.println("1");
        }
        else
            System.out.println("0");
    }
}
