package com.donggi.Components;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyDrawing extends Frame {

  MyCanvas can;
  public MyDrawing() {
    super("test");
    setLayout(new FlowLayout());

    can = new MyCanvas();
    can.setSize(300, 300);
    add(can);
    can.setBackground(Color.lightGray);

    MyHandler handler = new MyHandler();
    try {
      can.addMouseListener((MouseListener) handler);
    } catch (ClassCastException e) {
      e.printStackTrace();
    }

    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }

}
