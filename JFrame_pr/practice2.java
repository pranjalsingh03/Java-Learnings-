package JFrame_pr;

import javax.swing.*;
import java.awt.*;

public class practice2 {
    public static void main(String[] args){
        JFrame f = new JFrame("Day 2 Practice");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        JLabel l = new JLabel("Day 2 Practice");
        JButton b = new JButton();
        b.setText("Button");
        p.add(l);
        p.add(b);
        f.add(p);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        b.setBounds(150,100,100,50);
        JButton b1 = new JButton();
        b1.setText("Button 1");
        p.add(b1);
        b1.setBounds(180,100,100,50);
        JButton b2 = new JButton();
        b2.setText("Button 2");
        p.add(b2);
        b2.setBounds(190,100,100,50);
        JButton b3 = new JButton();
        b3.setText("Button 3");
        p.add(b3);
        b3.setBounds(200,100,100,50);
        JButton b4 = new JButton();
        b4.setText("Button 4");
        p.add(b4);
        b4.setBounds(200,100,100,50);
        JButton b5 = new JButton();
        b5.setText("Button 5");
        p.add(b5);
        b5.setBounds(200,100,100,50);
        JButton b6 = new JButton();
        b6.setText("Button 6");
        p.add(b6);
        b6.setBounds(200,100,100,50);
        JButton b7 = new JButton();
        b7.setText("Button 7");
        p.add(b7);
        b7.setBounds(200,100,100,50);
        JButton b8 = new JButton();
        b8.setText("Button 8");
        p.add(b8);
        b8.setBounds(200,100,100,50);
        JButton b9 = new JButton();
        b9.setText("Button 9");
        p.add(b9);
        b9.setBounds(200,100,100,50);

    }    
}
