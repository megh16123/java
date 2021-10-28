import java.util.Scanner;
public class Dynarr {
    public static void main(String[] args) {
        int [] arr;
        Scanner iAr = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int size = iAr.nextInt();
        arr = new int[size];
        System.out.println("The size of array is "+ arr.length);
    }
}
