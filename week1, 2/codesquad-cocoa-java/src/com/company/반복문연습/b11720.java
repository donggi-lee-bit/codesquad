package com.company;

import java.util.Scanner;

public class b11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;
        String a = sc.next();

        for (int i = 0; i < N; i++) {
            sum += a.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}