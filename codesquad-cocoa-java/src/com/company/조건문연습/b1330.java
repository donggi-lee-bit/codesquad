package com.company;

import java.util.Scanner;

public class b1330 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(">");
        }
        if (num1 < num2) {
            System.out.println("<");
        }
        if (num1 == num2) {
            System.out.println("==");
        }

    }
}
