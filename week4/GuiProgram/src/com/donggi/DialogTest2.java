package com.donggi;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest2 {

  public static void main(String[] args) {
    Frame f = new Frame("Parent");
    f.setSize(300, 200);

    final Dialog info = new Dialog(f, "information", true);
    info.setSize(140, 90);
    info.setLocation(50, 50);
    info.setLayout(new FlowLayout());

    Label msg = new Label("This is modal Dialog", Label.CENTER);
    Button ok = new Button("OK");

    ok.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) { // OK 버튼을 누르면 수행
//        info.setVisible(false); // Dialog를 안보이게 한다
        info.dispose(); // Dialog를 메모리에서 없앤다
      }
    });
    info.add(msg);
    info.add(ok);
    f.setVisible(true);
    info.setVisible(true); // Dialog를 화면에 보이게 한다

  }

}
