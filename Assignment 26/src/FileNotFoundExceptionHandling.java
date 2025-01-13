import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionHandling {
    public static void main(String[] args) {
        String filename= "example.dox";
        try{
            File file = new File(filename);
            Scanner fileReader = new Scanner (file);
            while (fileReader.hasNextLine()){
                System.out.println(fileReader.nextLine());
            }
        }catch (FileNotFoundException x){
            System.out.println("Error : File does not exist . ");
        }
    }
}
