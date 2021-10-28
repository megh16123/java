class Stack{
  static  int stack[] = new int[5];
   static int top = -1;
    static void push(int a){
    try{  
      top++;
      stack[top] = a;
    }catch(Exception e){
     System.out.println("Stack is full");
    }
    }
    static void pop(){
    try{    
    top--;
    int data =  stack[top];
    System.out.println(data);
    }catch(Exception e){
     System.out.println("Stack is empty");
    }
    }
    
    static void show(){
        for(int x : stack){
          System.out.println(x + "  ");
        }
    }
 
}



public class StackAssign {
    public static void main(String[] args) {
      Stack.push(3);
      Stack.push(7);
      Stack.push(3);
      Stack.push(2);
      Stack.push(2);
      Stack.push(2);
      Stack.pop();
      Stack.pop();
    

      Stack.show();
    }
}
