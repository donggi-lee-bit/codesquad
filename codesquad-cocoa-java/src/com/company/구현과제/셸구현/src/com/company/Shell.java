package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Shell {

  // list segements
  public static String ls() {
    String path = System.getProperty("user.dir");
    return path;
  }
  // copy
  public static String cp(String a, String b) {
    fileWriter(b);
    readFile(a);
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
