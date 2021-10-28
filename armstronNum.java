class ArmstrongExample{  
  public static void main(String[] args)  {  
    int num = 100;
    
  while(num<=999){
    int c=0,a,temp;  
    int n= num; 
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
       break;   
   
        num++;
      }
  System.out.print("The armstrong number is " + num);
    }  
}  