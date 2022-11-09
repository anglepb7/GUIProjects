package GUI.PaintApp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class ColorText{
 //create a JFrame Objects 4 buttons and 4 labels
  private ColorButton button1, button2, button3, button4;
  private JLabel label1, label2, label3, label4;
 //create elements in the Constructor
  public ColorText(){    
   JFrame frame = new JFrame("Coloring App");
   frame.setSize(500, 500);
   frame.setLayout(new GridLayout(2,1));
    //create panel for labels   and set Layout
   JPanel labelPanel = new JPanel();
   labelPanel.setLayout(new GridLayout(4,1));
   //create each label with given prompts
   label1 = new JLabel("The is going to  "); 
   //add each label to panel for labels
   labelPanel.add(label1);
   label2 = new JLabel("be the end   "); 
   //add each label to panel for labels
   labelPanel.add(label2);
   label3 = new JLabel("of the worst  "); 
   //add each label to panel for labels
   labelPanel.add(label3);
   label4 = new JLabel("and the beginning of the light  "); 
   //add each label to panel for labels
   labelPanel.add(label4);
    //create panel for buttons and set Layout
   JPanel buttonPanel = new JPanel();
   buttonPanel.setLayout(new GridLayout(2, 2));
   //create each button
   button1= new ColorButton();
   //add each button to panel for buttons
   buttonPanel.add(button1);
   button2= new ColorButton();
   //add each button to panel for buttons
   buttonPanel.add(button2);
   button3= new ColorButton();
   //add each button to panel for buttons
   buttonPanel.add(button3);
   button4= new ColorButton();
   //add each button to panel for buttons
   buttonPanel.add(button4);
    //create actionListener for each button  and call changeText(ColorButton b)
   button1.addActionListener(e->changeText(button1));
   button2.addActionListener(e->changeText(button2));
   button3.addActionListener(e->changeText(button3));
   button4.addActionListener(e->changeText(button4));
   //add  panel for label to current window
   frame.add(labelPanel);
   frame.add(buttonPanel);
   //add panel for button to current window
   //show the window
   frame.setVisible(true);
 }
 public void changeText(ColorButton b){
   label1.setForeground(b.getColor());
   label2.setForeground(b.getColor());
   label3.setForeground(b.getColor());
   label4.setForeground(b.getColor());
 }
}