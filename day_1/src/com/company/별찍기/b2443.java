package com.company.별찍기;

import java.util.Scanner;

public class b2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        for (int i = 1; i < num + 1; i++) {
            for (int j = num - i; j < num - 1; j++) {
                System.out.print(" ");
            }
            for (int k = (num * 2) - (i * 2 - 1); k > 0; k--) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
