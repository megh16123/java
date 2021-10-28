import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class Server extends JFrame{
    ServerSocket server;
    Socket socket;
    BufferedReader br ;
    PrintWriter out;
    private JLabel heading = new JLabel("Server End");
    private JTextArea messageArea = new JTextArea();
    private JTextField messageinput = new JTextField();
    private Font font = new Font("Roboto",Font.PLAIN,20);

    public Server(){
      try {
        server = new ServerSocket(7777);
        System.out.println("Server is ready to accept connection");
        System.out.println("waiting...");
       socket =  server.accept();
        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream());
        createGUI();
       handleEvents();
       startReading();
    } catch (IOException e) {
             e.printStackTrace();
    }
    }
    private void handleEvents() {
        messageinput.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
                
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
                
            }


            @Override
            public void keyReleased(KeyEvent e) {
                // System.out.println("key Released"+ e.getKeyCode());
                if(e.getKeyCode() ==10){
                    // System.out.println("you have pressed enter ");

                    String contenToSent = messageinput.getText();
                    if(contenToSent!=""){
                    if(contenToSent.equals("exit")){
                        out.println(contenToSent);
                        out.flush();
                       close();
                    }
                    messageArea.append("ME: "+ contenToSent+"\n");
                    out.println(contenToSent);
                    out.flush();
                    messageinput.setText("");
                    messageinput.requestFocus();
                }
            }
            }

           

        });
}
    private void createGUI(){
        ImageIcon image = new ImageIcon("ico.png");
        this.setIconImage(image.getImage());
        this.setTitle("CLient End");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       heading.setFont(font);
       messageArea.setFont(font);
       messageArea.setEditable(false);
       messageinput.setFont(font);
       heading.setHorizontalAlignment(SwingConstants.CENTER);
       heading.setBorder(BorderFactory.createEmptyBorder(20, 20,20,20));
       this.setLayout(new BorderLayout());
       this.add(heading,BorderLayout.NORTH);
       JScrollPane jScrollPane = new JScrollPane(messageArea);
    

       this.add(jScrollPane,BorderLayout.CENTER);
       this.add(messageinput,BorderLayout.SOUTH);
       
        this.setVisible(true);
    } 

public void close(){
    JOptionPane.showMessageDialog(this, "You terminated chat");
    this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
}

    public void startReading(){
        Runnable r1 =()->{
           
         System.out.println("reader started");
         while(true){
            String msg;
         try {
             msg = br.readLine();
             if(msg.equals("exit")){
             JOptionPane.showMessageDialog(this, "Client terminated chat");
             this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));    
                // messageinput.setEnabled(false);
                
                 break;
             }
             messageArea.append("Client: "+msg+"\n");
         } catch (IOException e) {
                       e.printStackTrace();
         }
         }
        };
 new Thread(r1).start();
    }
    // public void startWriting(){
    //    System.out.println("Writer started...");
    //     Runnable r2 =()->{
    //      while(true){
    //          try{
    //              BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    //              String content = br1.readLine();
    //              if(content == "exit"){
    //                 out.println(content);
    //                  break;
    //              }
            
    //             out.println(content);
    //            out.flush();
    //          }catch(Exception e){
    //              e.printStackTrace();
    //          }
    //      }
    //    };
    //    new Thread(r2).start();;
    // }
    public static void main(String[] args) {
        System.out.println("this  server goin to start ");
        new Server();
    }
}