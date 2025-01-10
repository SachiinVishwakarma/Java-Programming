import java.io.*;
public class FileClass {
    public static void main(String[] args)  throws IOException{
        File file=new File("sachin.dox");
        System.out.println(file.exists());
        file.createNewFile();
        File file2=new File("billa.dox");
        System.out.println(file.exists());
        file2.createNewFile();
        System.out.println(file.exists());
        FileWriter writer = new FileWriter(file2);
        writer.write("billa is not a good  boy . he is always playing games and flirts with other girls");
        writer.close();

    }
}
