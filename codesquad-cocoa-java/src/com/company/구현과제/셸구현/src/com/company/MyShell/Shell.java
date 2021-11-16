package com.company.MyShell;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;

public class Shell {

  public boolean start;
  public String[] arr;
  static String path = "/Users/donggilee/Desktop/codesquad/clonedir/codesquad-cocoa-java/src/com/company/구현과제/셸구현/src/com/company/";


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
      case "pwd":
        pwd();
        break;
      case "mkdir":
        mkdir();
        break;
      case "rm":
        rm();
        break;
      default:
        command();
        break;
    }
  }

  private void mkdir() {
    try {
      Files.createDirectory(Path.of(Shell.path));
    } catch (IOException e) {
      System.err.format("상위 디렉토리가 존재하지 않습니다. ");
    }
  }

  public static void rm() {
    try {
      Files.delete(Path.of(
          "/Users/donggilee/Desktop/codesquad/clonedir/codesquad-cocoa-java/src/com/company/구현과제/셸구현/src/com/company/exdir"));
    } catch (NoSuchFileException x) {
      System.err.format("해당 없음");
    } catch (DirectoryNotEmptyException x) {
      System.err.format("해당 없음");
    } catch (IOException x) {
      System.err.println(x);
    }
  }

//  public static void mkdir() {
//    path
//  }

  public static void pwd() {
    System.out.println(path);
  }

  public static void cp() {
    try {
      File file = new File(Shell.path + "text_file.txt");
      File newFile = new File(Shell.path + "new_text_file.txt");
      Files.copy(file.toPath(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException e) {
      e.printStackTrace();
    }

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
