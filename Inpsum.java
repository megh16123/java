import java.util.Scanner;

public class Inpsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfInput = Integer.parseInt(args[0]);
        int sum = 0 ;
        for(int i = 0;i<numberOfInput;i++){
            System.out.println("Enter the "+(i+1)+"number to sum");
            sum += input.nextInt();
        }
        input.close();
        System.out.println("The sum of entered numbers is : "+ sum);
    }
}
