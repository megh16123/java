import java.util.Scanner;
public class Box1 {
    int add(int a ,int b) {
        return a+b;
    }
    public static void main(String[] args) {
       Boxv b1 = new Boxv(6,6, 6);
       System.out.println("The volume of box is " + b1.volume()); 
       Box1 b = new Box1();
      System.out.println(b.add(2,4)); 
   }       
  

}
class Boxv{
    int length,breadth,height;
    public Boxv(int l,int b, int h){
        length = l;
        breadth = b;
        height = h ;
    }
   public int volume(){
    int vol = length*breadth*height;    
    
    return vol;
    }
}