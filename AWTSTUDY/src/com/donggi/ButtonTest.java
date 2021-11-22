package com.donggi;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class ButtonTest {

  public static void main(String[] args) {
    Frame f = new Frame("login");
    f.setSize(300, 200);

    Button b = new Button("확인할고얌");
    b.setSize(100, 50);

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();

    f.setLocation(screenSize.width / 2 - 150, screenSize.height / 2 - 100);

    f.add(b);
    f.setVisible(true);
  }

}
