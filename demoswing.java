import javax.swing.*;
public class demoswing
{
public static void main(String[]args)
{
JFrame f=new JFrame("this is title");
f.setSize(400,500);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel l=new JLabel("welcome",JLabel.CENTER);
f.add(l);
f.setVisible(true);
}
}
