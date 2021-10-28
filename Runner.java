import java.util.Scanner;


import p2.*;
import p3.*;

public class Runner {
    public static void main(String[] args) {
      Scanner type = new Scanner(System.in);
      System.out.println("Enter your choice \n 1.circle  2.Rectange");
      int choice = type.nextInt(); 
      type.close();
      switch(choice){
          case 1: Circle s = new Circle(4);
                  s.show();
                  s.area();
                break;
          case 2: Rectangle r = new Rectangle(2,3);
                  r.show();
                  r.area();
                break;
          default: System.out.println("Enter a correct choice");
      }
    }
}
