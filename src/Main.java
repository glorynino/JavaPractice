import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner intput =new  Scanner(System.in);
        boolean B = true;
        System.out.println("enter the input");
        do {

          try {

              if (intput.hasNextInt()) {
                  B = true;
                  System.out.println("merci.");
              }else{
                  B = false;
                  intput.next();
                  throw new Exception("Invalid input. Please enter a valid integer");

              }


          } catch (Exception e) {
              System.out.println(e.getMessage());
          }





        }while(!B);


    }
}