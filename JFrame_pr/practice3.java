package JFrame_pr;

import java.awt.Color;

import javax.swing.*;


public class practice3 {
    public static void main(String[] arg){
        JFrame f = new JFrame("Practice");
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.yellow);
    }
}
