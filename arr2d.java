import java.util.Scanner;


public class arr2d{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("This code is for Addition of 2 matrices.");
		System.out.println("Enter 2 numbers for the no or rows and columns of 2D array:- ");
		int r=in.nextInt(),c=in.nextInt();
		int arr1[][],arr2[][],sum[][];
		arr1=new int[r][c];
		arr2=new int[r][c];
		sum=new int[r][c];
		System.out.println("\n\nEnter the values in 1st matrix :- ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter "+(i+1)+","+(j+1)+" element :- ");
				arr1[i][j]=in.nextInt();
			}
		}
		System.out.println("\n\nEnter the values in 2nd matrix :- ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter "+(i+1)+","+(j+1)+" element :- ");
				arr2[i][j]=in.nextInt();
			}
		}
		System.out.println("\n\n\t\tYour entered matrices are :- ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.print("      ");
			for(int j=0;j<c;j++)
			{
				System.out.print(arr2[i][j]+" ");	
			}
			System.out.print("\n");
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("\n\n\t\tResult of matrix addition is below :- ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}