import java.util.Scanner;

public class Exercice_1 {

    public static void main(String[] args) {


        Scanner intput =new  Scanner(System.in);
        boolean B = true;
        System.out.println("enter the input");
        int nombre = 1;
        do {

          try {

              if (intput.hasNextInt()) {
                  B = true;
                  System.out.println("merci,le nombre d'essaie avant la reussite"+ nombre);
              }else{
                  B = false;
                  intput.next();
                  throw new Exception("Invalid input. Please enter a valid integer");

              }


          } catch (Exception e) {
              nombre++;
              System.out.println(e.getMessage());
          }

        }while(!B);


    }
}