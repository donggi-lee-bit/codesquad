package com.company.MyShell;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Shell {

  public boolean start;
  public String[] arr;

  public Shell() {
    this.start = true;
  }

  private String getCommand() {
    String str = Input.input("hosh> ");
    arr = str.split(" ");
    return arr[0];
  }

  public void command() {
    switch (getCommand()) {
      case "ls":
        ls();
        break;
      case "cp":
        cp();
        break;
      case "cd":
        cd();
        break;
    }
  }

  public static void cp() {

  }

  public static void cd() {

  }

  // list segements
  public void ls() {
    //String path = System.getProperty("user.dir") + "/" + this.getClass().getName().replace(".", "/").replace(this.getClass().getSimpleName(), "");
    File file = new File(
        "/Users/donggilee/Desktop/codesquad/clonedir/codesquad-cocoa-java/src/com/company/구현과제/셸구현/com/company/");
    File files[] = file.listFiles();

    for (int i = 0; i < files.length; i++) {
      System.out.print(files[i] + " ");
    }
  }

  private static void readFile(String a) {

    try {
      FileReader fr = new FileReader(a);
      BufferedReader br = new BufferedReader(fr);

      while (true) {
        String line = br.readLine();
        if (line == null) {
          break;
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void fileWriter(String filename) throws IOException {
    FileWriter f1 = new FileWriter("filename.txt");
    f1.write("Hello Java");
    f1.close();
  }

}
