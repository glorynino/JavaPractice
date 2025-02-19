import java.io.*;

public class Exercice_2 {
    public static void main(String[] args) {
        File Fichier = new File("index.txt");
        //put all the exception in a "try" and throw it when i found one
        try {
            if (!Fichier.exists()) {
                throw new FileNotFoundException();


            } else {


                BufferedReader F ;
                int line = 0;

                    Fichier.createNewFile();
                    F = new BufferedReader(new FileReader(Fichier));

                    while (F.readLine() != null) {
                        line++;
                    }
                            F.close();

                    if (line == 0) {
                        System.out.println("the file is empty");
                    } else {
                        System.out.println("Number of lines in the file:" + line);
                    }

            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (IOException e) {
            System.out.println("Erreur lors de l'ouverture ou fermeture du fichier.");
        }

    }
}
