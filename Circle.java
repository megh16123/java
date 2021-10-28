package p3;
import p1.*;
public class Circle extends Shape {
    int radius;
    final double pi = 3.14;
  public  Circle(int radius){
      this.radius = radius;
    }
    @Override
    public void area(){
    System.out.println("Area = " + this.pi*this.radius*this.radius);
    }
    public void show(){
        System.out.println("Radius = " + this.radius);
    }

}
