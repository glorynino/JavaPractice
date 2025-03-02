public class BankAccount {
    private int currentMoney;
    private final TransactionLog History = new TransactionLog();
    public BankAccount(int currentMoney) {
        this.currentMoney = currentMoney;
    }

    public void deposit(int Money) throws IntPutError{
        if (Money < 0) {
            throw new IntPutError("can't treat negative number");
        }
        this.currentMoney=this.currentMoney+Money;
        History.addTransaction("deposit",Money);
    }
    public void withdraw(int Money) throws InsufficientFundsException{
        if (Money>currentMoney) {

            currentMoney = currentMoney -300;
            throw new InsufficientFundsException("you don't have enough money you will be debited -300$");
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
