package FlagDrawing;

import javax.swing.*;
import java.awt.*;

public class Flags{
  public  static  void  main(String[]  args){
    JFrame theGUI = new JFrame();
    theGUI.setSize(300, 200);
theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel northPanel = new JPanel();  
    northPanel.setBackground(Color.black);
    JPanel eastPanel = new JPanel();  
    eastPanel.setBackground(Color.red);
    JPanel centerPanel = new JPanel();  
    centerPanel.setBackground(Color.yellow);
    Container pane = theGUI.getContentPane();
    pane.setLayout(new GridLayout(3, 1));
    pane.add(northPanel);
    pane.add(eastPanel);
    pane.add(centerPanel);
    theGUI.setVisible(true);
  }
}