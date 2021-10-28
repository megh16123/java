package com.Company;
import java.util.Scanner;

class Prog {
  public static void main(String[] args) {
    Scanner numbers = new Scanner(System.in);
    Scanner names = new Scanner(System.in);
    int num1 , num2;
    String name; 
    System.out.print("Enter your name  ");
    name = names.nextLine();
    System.out.print("Enter the first number ");
    num1 = numbers.nextInt();
    System.out.print("Enter the second number  ");
    num2  = numbers.nextInt();
    int sum = num1 + num2;
    System.out.println("Welcome "+name +" your sum is = "+sum);    

}
}