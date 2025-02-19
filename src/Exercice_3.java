import java.util.Scanner;

public class Exercice_3 {

    public static int Sum_M(int[][] array) throws InvalidMatrixException{

        if (array.length != array[0].length) {
            throw new InvalidMatrixException("error : the matrix given is not square ");

        }else {
            int SUM =0;
            for (int[] ligne : array) {
                for (int anInt : ligne) {
                    SUM = SUM + anInt;
                }
            }
            return SUM;
        }
    }

    public static void verif(int n) throws IntPutError {
        if (n < 0) {
            throw new IntPutError("enter a positve number !");
        }

    }

    public static void main(String[] args) {
        int n,m;
        System.out.println("create ur matrixe");
        Scanner input = new Scanner(System.in);
       try {
               System.out.println("enter the number of ligne ");
               n = input.nextInt();
               verif(n);
           System.out.println("enter the number of colon ");
               m = input.nextInt();
               verif(m);
               int[][] array = new int[n][m];
               System.out.println("fill the matrix");
           for (int i = 0; i < n ; i++) {
               for (int j = 0; j <m ; j++) {
                   array[i][j] =input.nextInt();
               }
           }
           System.out.println("the sum of the matrix : "+Sum_M(array));


       }catch (InvalidMatrixException e){
           System.out.println(e.getMessage());

       }catch (IntPutError e) {
         System.out.println(e.getMessage());
       }

    }
}
