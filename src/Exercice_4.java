import java.util.Scanner;
public class Exercice_4 {
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String CYAN = "\u001B[36m";
    public static void main(String[] args) {
        BankAccount bankAccount =new BankAccount(2000);
      Scanner input = new Scanner(System.in);

          while (true){
              try {

                  System.out.println(CYAN + "╔══════════════════════════════╗");
                  System.out.println("║         🌟 MENU 🌟           ║");
                  System.out.println("╠══════════════════════════════╣");
                  System.out.println("║ " + GREEN + "👉🏽 1 - Dépôt              " + CYAN + "║");
                  System.out.println("║ " + GREEN + "👉🏽 2 - Retrait            " + CYAN + "║");
                  System.out.println("║ " + GREEN + "👉🏽 3 - Mon Portefeuille   " + CYAN + "║");
                  System.out.println("║ " + YELLOW + "🔍  4 - Voir l'historique  " + CYAN + "║");
                  System.out.println("║ " + RED + "❌  5 - Quitter            " + CYAN + "║");
                  System.out.println("╚══════════════════════════════╝" + RESET);
                  System.out.print("💡 Veuillez choisir une option : ");
                  int choix = input.nextInt();
                  switch (choix) {
                      case 1:
                          System.out.println("combien veut tu deposer ");
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
                      case 5:
                          System.out.println(RED + "👋 Au revoir !" + RESET);
                          break;
                      default:
                          throw new IntPutError("Il faut appuiyer sur un chiffre entre 1 et 5");
                  }
                  if (choix == 5) {
                      return;
                  }
              }catch (InsufficientFundsException e){
                  System.out.println(RED+e.getMessage());

              } catch (IntPutError e) {
                  System.out.println(e.getMessage());
              } catch (Exception e) {
                  System.out.println(e.getMessage());
              }

          }

    }

}
