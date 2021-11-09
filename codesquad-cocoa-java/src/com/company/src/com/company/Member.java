package com.company;

import java.util.ArrayList;
import java.util.List;

public class Member {

  public static void main(String[] args) {

    // 생성자

    Member member = new Member("donggi", 20);
    Member member2 = new Member("Jun", 30);
    System.out.println(member2.getName());
    System.out.println(member.getAge());
  }

  private String name;
  private int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }


}
