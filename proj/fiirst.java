

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class fiirst {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("First java GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setResizable(false);
        
        frame.setSize(420,420);
        frame.setVisible(true);
      ImageIcon image = new ImageIcon("ico.png");
      frame.setIconImage(image.getImage());
      frame.getContentPane().setBackground(new Color(0x234443));
    }
}
