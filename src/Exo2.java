import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
public class Exo2 {
    public static void main(String[] args) {
        File Fichier = new File("index.txt");
        int line = 0;
        try {
            Fichier.createNewFile();
            BufferedReader F = new BufferedReader(new FileReader(Fichier));


            while (F.readLine()!=null) {
                line++;
            }


        } catch (IOException e) {
            System.out.println("File not found: input.txt");
        }
        finally {
            if (line == 0) {
                System.out.println("the file is empty");
            }else {
                System.out.println("Number of lines in the file:"+ line);
            }
        }

    }
}
