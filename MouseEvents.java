import java.awt.*;
import java.awt.event.*;



class Ev extends Frame implements MouseListener,MouseMotionListener{
  Label Status = new Label("Start       ");
    public Ev(){

       setLayout(new FlowLayout());
       setVisible(true);
       setSize(600,600);
      addMouseListener(this);
      addMouseMotionListener(this);
    
      add(Status);

    }
    public void mouseEntered(MouseEvent me){
      Status.setText("Entered");
      repaint();
    }
    public void mouseExited(MouseEvent me){
        Status.setText("Exited");
        repaint();
    }
    public void mousePressed(MouseEvent me){
        Status.setText("Pressed");
        repaint();
    }
    public void mouseReleased(MouseEvent me){
        Status.setText("Released");
        repaint();
    }
    public void mouseMoved(MouseEvent me){
        Status.setText("Moving");
        repaint();
    }
    public void mouseDragged(MouseEvent me){
        Status.setText("Dragging");
        repaint();
    }
    public void mouseClicked(MouseEvent me ){
        Status.setText("Clicked");
        repaint();
    }







}



class MouseEvents{
    public static void main(String[] args) {
        new Ev();
    }
}