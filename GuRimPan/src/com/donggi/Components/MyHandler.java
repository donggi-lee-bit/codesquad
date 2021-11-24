package com.donggi.Components;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MyHandler extends MouseMotionAdapter {

  MyCanvas can;
  @Override
  public void mouseDragged(MouseEvent e) {
    can.x = e.getX();
    can.y = e.getY();
    can.repaint();
  }

}
