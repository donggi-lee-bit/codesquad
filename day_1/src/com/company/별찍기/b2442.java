package com.company.별찍기;

import java.util.Scanner;

public class b2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        for (int i = 1; i < num + 1; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
