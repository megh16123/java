import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class CopyToFile{
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]+ ".txt");
        // String filename = args[0]+ ".txt";
        // FileWriter fileWriter = new FileWriter(filename);
       
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String content = sc.nextLine();
            System.out.println(content);  
        }
        // System.out.println("Success!!!");
        // fileWriter.close();
    sc.close();
    }
}