import java.awt.event.*;
import java.awt.*;

class test extends Frame implements KeyListener{
test(){
  addKeyListener(this);
}
 public void keyPressed(KeyEvent k){
 System.out.println("pressed");
}
public void keyReleased(KeyEvent k){
  System.out.println("released");
}
public void keyTyped(KeyEvent k ){
System.out.println("typing");
}
  public static void main(String[] args) {
    
    new test();    
}
}