package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

  public static void main(String[] args) throws IOException {
    // class : System, Math, FileWriter
    // instance : f1, f2


    // Math 라고 하는 클래스에, PI 라는 변수가 있다.
    System.out.println(Math.PI);
    // floor(바닥)로 소수점을 내려주는 Math의 method이다.
    System.out.println(Math.floor(1.8));
    // ceil(천장)로 소수점을 올려주는 Math의 method이다.
    System.out.println(Math.ceil(1.8));

    // FileWrite 클래스
    FileWriter f1 = new FileWriter("data.txt");
    f1.write("Hello");
    f1.write(" Java");
    f1.write(" Hello World!");
    f1.write(" Hi, How are you ?");
    f1.close();

    FileWriter f2 = new FileWriter("data2.txt");
    f2.write("Hello");
    f2.write(" Java2");
    f2.write(" Hello World!");
    f2.write(" Hi, How are you ?");
    f2.close();
  }

}
