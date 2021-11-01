package com.company;

import java.util.Scanner;

public class b9498 {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num >= 90 && num <= 100) {
            System.out.println("A");
        }
        else if (num >= 80 && num <= 89) {
            System.out.println("B");
        }
        else if (num >= 70 && num <= 79) {
            System.out.println("C");
        }
        else if (num >= 60 && num <= 69) {
            System.out.println("D");
        }
        else
            System.out.println("F");
    }
}
