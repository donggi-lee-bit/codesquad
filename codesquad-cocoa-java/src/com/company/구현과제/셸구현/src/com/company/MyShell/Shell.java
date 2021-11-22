package com.company.MyShell;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Shell {

  public boolean start;
  public String[] arr;
  static String path = "/Users/donggilee/Desktop/codesquad/clonedir/codesquad-cocoa-java/src/com/company/구현과제/셸구현/src/com/company/";


  public Shell() {
    this.start = true;
  }

  private String getCommand() {
    String str = Input.input("dosh> ");
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
        mkdir(arr[1]);
        break;
      case "rm":
        rm(arr[1]);
        break;
      case "~":
        root();
        break;
//      case "mv":
//        mv();
//        break;
      case "hclock":
        hclock();
        break;
      case "cal":
        cal();
        break;
      default:
        command();
        break;
    }
  }

  private void cal() {
    MyCalendar.getCal();
  }

  private void hclock() {
    MyClock.clock();
  }

  private void root() {
    Path path = Paths.get(Shell.path);
    Path root = path.getRoot();
    System.out.println(root);
  }

  // path 변경 시 ls 출력 기능 추가
  private void ls() {
    File dir = new File(Shell.path);
    String[] filenames = dir.list();
    for (int i = 0; i < filenames.length; i++) {
      System.out.println(filenames[i]);
    }
  }

  //  private void mv() {
//
//  }
  // 만들 디렉토리 이름 받아와서 파일 만들기
  // 경로 이동했을떄도 그 위치에 만들 수 있게
  private void mkdir(String directory) {
    try {
      Path directoryPath = Paths.get(Shell.path + directory);
      Files.createDirectory(directoryPath);
    } catch (FileAlreadyExistsException e) {
      e.printStackTrace();
    } catch (NoSuchFileException e) {
      e.printStackTrace();
    } catch (IOException e) {
      System.err.format("상위 디렉토리가 존재하지 않습니다. ");
    }
  }
  // 경로 유동성
  public static void rm(String name) {
    try {
      Files.delete(Path.of(Shell.path + name));
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
// 경로 이동
  public static void pwd() {
    System.out.println(path);
  }
  // 경로 이동, 입력 값 받기
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
}
