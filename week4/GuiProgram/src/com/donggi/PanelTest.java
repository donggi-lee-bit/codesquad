package com.donggi;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest {

  public static void main(String[] args) {
    Frame f = new Frame("Panel");
    f.setSize(300, 200);
    f.setLayout(null);

    Panel p = new Panel();
    p.setBackground(Color.lightGray);
    p.setSize(100, 100);
    p.setLocation(50, 50);

    p.add(new Button("첫번째"));
    p.add(new Button("두번째"));
    p.add(new Button("새번째"));
    p.add(new Button("네번째"));

//    p.add(ok);
    f.add(p);
    f.setVisible(true);
  }

}
