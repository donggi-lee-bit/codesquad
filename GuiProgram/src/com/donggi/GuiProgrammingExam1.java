package com.donggi;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;

public class GuiProgrammingExam1 {

  //text 영역과, button 기능 넣기
  public static void main(String[] args) {
    Frame f = new Frame("Hello Cocoa");
    f.setSize(400, 65);
    f.setLayout(new FlowLayout());

    Label lid = new Label("ID:", Label.RIGHT);
    Label lpwd = new Label("Password", Label.RIGHT);

    TextField id = new TextField(10);
    TextField pwd = new TextField(10);
    pwd.setEchoChar('*');

    f.add(lid);
    f.add(id);
    f.add(lpwd);
    f.add(pwd);

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();

    f.setLocation(screenSize.width / 2 - 150, screenSize.height / 2 - 100);
    f.setVisible(true);
  }
}
