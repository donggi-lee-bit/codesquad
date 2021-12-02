package com.company.별찍기;

import java.util.Scanner;

public class b2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = num - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
