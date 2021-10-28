// Importing awt
import java.awt.*; 
// Importing awt events
import java.awt.event.*;

// Creating class Btn which extends Frame and Implements ActionListener
class Btn extends Frame implements ActionListener{
// Defining message of type String 
    String message;
// Defining status of class Label
    Label status = new Label("Button not clicked");
// Defining the constructor
    public Btn(){
// Setting the layout 
        setLayout(new FlowLayout());
// Defining button1 of class Button 
        Button button1 = new Button("Click Me");
// Setting hte frme to visible 
        setVisible(true);
// Setting the size of Frame 
        setSize(600,600);
// Adding the window event listener for closing the window 
        addWindowListener(new WindowAdapter(){
        
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
               System.exit(0);
           }
    });
//    Adding the button to the frame 
    add(button1);
//    adding the Label to the frame 
    add(status);    
//    Adding the ActionListener to the buttton 
    button1.addActionListener(this);

}
// Ovverriding the method actionPreformed of ActionListener interface 
public void actionPerformed(ActionEvent e){
//  Definingstr of class string and initialising it with the event command   
    String str = e.getActionCommand();
//  checking if the action command is a button click or not   
    if(str.contentEquals("Click Me")){

        message = "Button Clicked";
//  Setting the text of label to message    
        status.setText(message);
   
       
    }
 
}
}



public class ButtonPush {
    public static void main(String[] args) {
        // creating the instance of Btn
        new Btn();
    }
}
