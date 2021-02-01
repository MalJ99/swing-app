import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    

    //frame 1
    JFrame frame1 = new JFrame ("Opening");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame1.setSize(500,500);
    frame1.setVisible(true);
    
    //frame 2
    JFrame frame2 = new JFrame("Toppings!");
    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame2.setSize(500,500);
    frame2.setVisible(false);

    //frame 3
    JFrame frame3 = new JFrame("Ramen");
    frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame3.setSize(500,500);
    frame3.setVisible(false);

    //panel 1
    JPanel panel1= new JPanel(new GridLayout(10,2,20,20));

    //panel 2
    JPanel panel2= new JPanel(new GridLayout(10,2,20,20));
    
    //panel 3
    JPanel panel3 = new JPanel(new BorderLayout(10,10));
    ImageIcon ramen = new ImageIcon("ramen.jpg", "Your Ramen");
    //label 1
    JLabel ramenLabelPic = new JLabel(ramen);
    //label 2 
    JLabel label2 = new JLabel("Your ramen looks very nice go take a look!");
    //textfield1 
    //JTextField textField1 = new JTextField(10);
    //every text field i create makes a bug and my first frame doesnt show my button
    //frame 1 button
    JButton button1= new JButton("Show Ramen!");
    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e) {
      frame1.setVisible(false);
      frame2.setVisible(true);
      }
    });
    
    //frame 2 button
    JButton button2 = new JButton("Toppings");
    button2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e) {
      //arrayList
      ArrayList toppings = new ArrayList();
      toppings.add("Beef Flank");
      toppings.add("eggs");
      toppings.add("Naruto");
      toppings.add("Seaweed");
      toppings.add("Peppers.");

      System.out.println(toppings);
      }
    });

    //frame 2 button 2
    JButton button3 = new JButton("Show me my ramen");
    button3.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e) {
        frame2.setVisible(false);
        frame3.setVisible(true);      }
    });

    panel1.add(button1);
    panel2.add(button2);
    panel2.add(button3);
    panel3.add(ramenLabelPic);
    panel2.add(label2);
    //panel2.add(textField1);
    
    frame1.getContentPane().add(panel1);
    frame2.getContentPane().add(panel2);
    frame3.getContentPane().add(panel3);

  }
}
