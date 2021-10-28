import java.util.Scanner;


public  class binary{
	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number u wanna convert from decimal to binary(upto 255) :- ");
		int temp, n=in.nextInt();
		int[] arr;
		int i=7;
		arr=new int[8];
		while((n/2)!=1)
		{
			arr[i]=n%2;
			n=n/2;
			i--;

		}
System.out.println(i);
		arr[i-1]=1;
		System.out.println("OUTPUT binary is :- ");
		for(i=0;i<8;i++)
		{
			System.out.print(arr[i]);
		}
	}
}
		