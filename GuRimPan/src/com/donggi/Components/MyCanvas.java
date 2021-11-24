package com.donggi.Components;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MyCanvas extends Canvas {
  int x = 50, y = 50;
  public void update(Graphics g) {
    paint(g);
  }

  public void paint(Graphics g) {
    g.setColor(Color.DARK_GRAY);
    g.fillOval(x, y, 10, 10);
  }

}
