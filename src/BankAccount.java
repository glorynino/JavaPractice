public class BankAccount {
    private int currentMoney;
    private TransactionLog History = new TransactionLog();
    public BankAccount(int currentMoney){
        this.currentMoney = currentMoney;
    }
    public void deposit(int Money){
        this.currentMoney=this.currentMoney+Money;
        History.addTransaction("deposit",Money);
    }
    public void withdraw(int Money) throws InsufficientFundsException{
        if (Money>currentMoney) {
            throw new InsufficientFundsException("you don't have enough money");
        }
        this.currentMoney=this.currentMoney-Money;
        History.addTransaction("withdrawal",Money);
    }
    public void getBalance(){
        System.out.println(this.currentMoney);
    }
    public void log()throws Exception{
        History.printTransactionHistory();
    }
}
