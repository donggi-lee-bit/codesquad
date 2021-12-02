package com.company;

import java.util.Scanner;

public class b2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m;
        h = sc.nextInt();
        m = sc.nextInt();

        if (m < 45) {
            if (h == 0) {
                h = 23;
            }
            else
                h--;
            m += 15;
            System.out.println(h);
            System.out.println(m);
        }
        else if (m >= 45) {
            m -= 45;
            System.out.println(h);
            System.out.println(m);
        }
    }
}
