public class pallindromeNUM {
    public static void main(String[] args) {
        int a , n = 121,nu = 0,temp;
        temp = n;
        while(n>0)  
        {  
          a = n%10;
          nu = (nu*10) + a;
          n = n/10;
        } 
        
        
    if(temp == nu)    
       System.out.println("Number is pallindrome ");
    else
        System.out.println("Number is not a pallindrome ");
    }
}
