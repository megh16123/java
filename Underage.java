import java.util.Scanner;

class first extends Exception{
    
    public String toString() {
        
        return "Under Age";
    }
}
class exceptionDemo{
    void test(int age){
      if (age<19){
          try{
              throw new first();
          }catch(Exception e){
            System.out.println(e.toString()); 
            
          }
      }else{
          System.out.println("Success!");
      }
    }
}

public class Underage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        exceptionDemo Ex = new exceptionDemo();
        Ex.test(age);
        input.close();
    }
}
