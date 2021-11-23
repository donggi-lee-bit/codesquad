package com.donggi;

public class Student extends Human {

  public Student() {
    System.out.println("1. 자식 클래스로 사용 될 Student 클래스입니다");
  }
  @Override
  public void method1() {
    System.out.println("2. 오버라이드 했습니다. 자식 클래스의 method1 입니다.");
  }

//  public void method2() {
//    System.out.println("111111111111");
//  }

  public void method3() {
    System.out.println("3. 자식 클래스의 method3입니다");
  }
}
