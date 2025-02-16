import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
public class Exo2 {
    public static void main(String[] args) {
        File Fichier = new File("index.txt");
        BufferedReader F =null ;
        int line = 0;
        try {
            Fichier.createNewFile();
             F = new BufferedReader(new FileReader(Fichier));


            while (F.readLine()!=null) {
                line++;
            }


        } catch (IOException e) {
            System.out.println("File not found: input.txt");
        }
        finally {
            try {
                if (F != null) {
                    F.close();
                }
            } catch (IOException e) {
                System.out.println("Erreur lors de la fermeture du fichier.");
            }
            if (line == 0) {
                System.out.println("the file is empty");
            }else {
                System.out.println("Number of lines in the file:"+ line);
            }

        }


    }
}
