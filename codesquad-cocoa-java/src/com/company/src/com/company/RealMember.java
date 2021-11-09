package com.company;

import java.util.ArrayList;
import java.util.List;

public class RealMember {

  public static void main(String[] args) {
    List<String> arr = new ArrayList<>();
    arr.add("Jerry");
    arr.add("K");
    arr.add("Mk");
    arr.add("Tany");
    arr.add("donggi");
    arr.add("mandoo");
    arr.add("taksu");
    arr.add("피오");
    arr.add("후");
    arr.add("땃쥐");
    arr.add("노리");

    RealMember member = new RealMember("Jerry");
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RealMember(String name) {
    this.name = name;
  }
}
