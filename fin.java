class c01{
  final int v01 = 34;
  final void display(){
      System.out.println("vo1= "+ v01);
  }  
}
class co2 extends c01{
    private int b;
    public void init(int b){
           this.b = b;
           System.out.println("bo1 = "+ b);
    }
}
public class fin {
   public static void main(String[] args) {
       co2 varq = new co2();
       varq.init(40);
       varq.display();
   }  
}
