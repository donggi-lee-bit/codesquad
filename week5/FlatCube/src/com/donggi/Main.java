package com.donggi;

public class Main {

    public static void main(String[] args) {

        while (Command.isGoing) {
            try {
                System.out.print("CUBE> ");
                new Command();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
