package challenge2;

public class TransactionThread extends Thread {
    private String name;
    private double amount;
    private BankAccount from;
    private BankAccount to;

    public TransactionThread(String name, double amount, BankAccount from, BankAccount to) {
        this.name = name;
        this.amount = amount;
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        transfer(from, to, amount);
    }

    public void transfer(BankAccount from, BankAccount to, double amount) {
        try {
            synchronized(from) {
                from.withDraw(amount);
            }
            synchronized(to) {
                to.deposit(amount);
            }
            
        } catch (InsufficientFundsException e) {
            System.out.println(e);
        }
    }
}
