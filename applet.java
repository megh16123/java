import java.awt.*;
import java.awt.event.*;
// import javax.swing.event.AncestorListener;

// import jdk.internal.org.objectweb.asm.Label;





public class applet extends Frame implements ActionListener {
    
    public applet(){
        FlowLayout f= new FlowLayout();
        setLayout(f);
        setVisible(true);
        setSize(400,600);
        // Label l=new Label("Hardik");
        // Label l2=new Label("Hardik");
        // add(l); 
        // add(l2); 
        Button b= new Button("hhsdbaksd");
        b.addActionListener(this);
        add(b);
        

    }
    public void actionPerformed (ActionEvent e){
        System.out.println("bdhbads");
    }
    public static void main(String[]args){
        new applet();
    }
}