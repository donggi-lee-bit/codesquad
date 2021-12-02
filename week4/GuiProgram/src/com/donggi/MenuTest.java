package com.donggi;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuTest {

  public static void main(String[] args) {
    Frame f = new Frame("Frame with Menu");
    f.setSize(300, 200);

    MenuBar mb = new MenuBar();
    Menu mFile = new Menu("File");

    MenuItem miNew = new MenuItem("New");
    MenuItem miOpen = new MenuItem("Open");
    Menu mOthers = new Menu("Others");
    MenuItem miExit = new MenuItem("Exit");

    mFile.add(miNew);
    mFile.add(miOpen);
    mFile.add(mOthers);
    mFile.addSeparator();
    mFile.add(miExit);

    MenuItem miPrint = new MenuItem("Print...");
    MenuItem miPreview = new MenuItem("Print Preview");
    MenuItem miSetup = new MenuItem("Print Setup...");
    mOthers.add(miPreview);
    mOthers.add(miPrint);
    mOthers.add(miSetup);

    Menu mEdit = new Menu("Edit");

  }

}
