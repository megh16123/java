package p2;
import p1.*;
public class Rectangle extends Shape{
    int length,breadth;
    public Rectangle(int length , int breadth){
     this.length = length;
     this.breadth = breadth;
    }
    @Override
    public void area(){
       System.out.println("Area = " +this.length*this.breadth);
    }
   public void show(){
       System.out.println("Length = "+ this.length);
       System.out.println("Breadth = " + this.breadth);
   }
}
