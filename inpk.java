import java.util.Scanner;


class armstrong{
public static void main(String[] args)
{

int y=0 , rem ,x;

Scanner n = new Scanner(System.in);
x=n.nextInt();
while(x>0)
{
   rem = x%10;
   x = x/10;
   y = y + (rem*rem*rem);
}

if(x==y)
System.out.println("This is Armstrong");
else
System.out.println("This is not an Armstrong");


}
}