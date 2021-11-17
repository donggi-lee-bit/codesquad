package com.company;

import com.company.MyShell.Input;
import com.company.MyShell.Shell;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Shell shell = new Shell();
        while (shell.start) {
            shell.command();
        }
    }
}
