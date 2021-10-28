import java.io.File;
import java.io.FileNotFoundException;
// import java.io.FileWriter;
// import java.io.IOException;
import java.util.Scanner;




public class fs {
    public static void main(String[] args) {
        // File fs = new File("textrovert.txt");
        // try {
        //     fs.createNewFile();
        // } catch (IOException e) {
        //     System.out.println("unable to create file ");
        //     e.printStackTrace();
        // }
    // try {
   //     FileWriter fileWriter = new FileWriter("textrovert.txt");
    //     fileWriter.write("this is the first program to write in a file ");
    //     fileWriter.close();
    // } catch (IOException e) {
       //     e.printStackTrace();
    // }
  File file = new File("textrovert.txt");
  Scanner sc;
try {
    sc = new Scanner(file);
    while(sc.hasNextLine()){
        String line = sc.nextLine();
        System.out.println(line);
    }
} catch (FileNotFoundException e) {
   
    e.printStackTrace();
}
    }
}
