package com.donggi;

import com.donggi.ClockCalendar.MyCalendar;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        start();
    }

    private static void start() {
        MyCalendar myCalendar = new MyCalendar();
        myCalendar.checkCalClock(input());
    }

    private static String input() {
        System.out.println("clock: 시계 출력, cal: 달력 출력");
        return MyCalendar.sc.next();
    }
}
