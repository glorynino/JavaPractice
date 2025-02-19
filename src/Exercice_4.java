import java.util.Scanner;
public class Exercice_4 {
    public static void main(String[] args) {
      BankAccount bankAccount =new BankAccount(2000);
      Scanner input = new Scanner(System.in);
      try {
          while (true){
              System.out.println("=======Menu=======");
              System.out.println("\uD83D\uDC49\uD83C\uDFFD 1 - Dépôt");
              System.out.println("\uD83D\uDC49\uD83C\uDFFD 2 - Retrait");
              System.out.println("\uD83D\uDC49\uD83C\uDFFD 3 - mon Portefeuille");
              System.out.println("\uD83D\uDD0D 4 - Voir l'historique");
              System.out.println("❌ 5 - Quitter");
              System.out.print("Choisissez une option : ");
              int choix = input.nextInt();
              switch (choix){
                  case 1: System.out.println("combien veut tu deposer ");
                        int money = input.nextInt();
                        bankAccount.deposit(money);
                        break;
                  case 2:
                      System.out.println("combien veut tu retirer ");
                       money = input.nextInt();
                       bankAccount.withdraw(money);
                       break;
                  case 3:
                      System.out.println("vous avez acctuellement : ");
                      bankAccount.getBalance();
                      break;
                  case 4:
                      System.out.println("historique des transaction");
                      bankAccount.log();
                      break;
                  case 5: break;
                  default:
                      throw new IntPutError("Il faut appuiyer sur un chiffre entre 1 et 5");
              }
              if (choix == 5) {
                  break;
              }

          }
      }catch (InsufficientFundsException e){
          System.out.println(e.getMessage());

      } catch (IntPutError e) {
          System.out.println(e.getMessage());
      } catch (Exception e) {
          System.out.println(e.getMessage());
      }
    }

}
