package com.donggi;

import java.awt.Button;
import java.awt.Frame;

public class ButtonTest2 {

  public static void main(String[] args) {
    Frame f = new Frame("Login");
    f.setSize(300, 200);
    f.setLayout(null); // 레이아웃 매니저 설정 해제 -> 이렇게 하면 버튼 사이즈를 수동 설정 가능
    Button b = new Button("확 인");
    b.setSize(100, 50); // button size
    b.setLocation(100, 75); // button location in frame

    f.add(b);
    f.setVisible(true);
  }

}
