import java.util.ArrayList;
import java.time.LocalDateTime;
public class TransactionLog {
 private ArrayList<String> Transtype = new ArrayList<>();
 private ArrayList<Integer>  amount = new ArrayList<>();
 private ArrayList<LocalDateTime>  timestamp = new ArrayList<>();
 private LocalDateTime maintenant = LocalDateTime.now(); // c'est une methode statique donc pas besoin de faire new elle est gerer en interne dans "now"
    public void addTransaction(String Type,Integer amount ){
        Transtype.add(Type);
        this.amount.add(amount);
        timestamp.add(maintenant);
    }
    public void printTransactionHistory()throws Exception{
        if(Transtype.isEmpty())
            throw new Exception("aucune transaction n'a encore etais faite ");
        for (int i = 0; i <Transtype.size() ; i++) {
            System.out.println("the Type of transaction : "+Transtype.get(i)+" the amount : "+amount.get(i)+"$"+" the  timestamp "+timestamp.get(i));
        }
    }
}
