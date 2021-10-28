import java.awt.event.*;
import java.awt.*;

class Key extends Frame implements KeyListener {
    Label Status = new Label("Start       ");
    public Key(){
       
    
           setLayout(new FlowLayout());
           setVisible(true);
           setSize(600,600);
           addKeyListener(this);
        
          add(Status);
    
  
    }
    public void keyPressed(KeyEvent k){
        Status.setText("Pressed");
        repaint();
    }
    public void keyReleased(KeyEvent k){
        Status.setText("Released");
        repaint();
    }
    public void keyTyped(KeyEvent k ){
        Status.setText("Typed");
        repaint();
    }
}
public class KE {
    public static void main(String[] args) {
        new Key();
    }
}
