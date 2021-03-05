package challenge2;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(2000, "ba1");
        BankAccount ba2 = new BankAccount(4000, "ba2");
        BankAccount ba3 = new BankAccount(2500, "ba3");

        TransactionThread tt = new TransactionThread("t1", 2000, ba1, ba2);
        TransactionThread tt2 = new TransactionThread("t2", 1900, ba1, ba3);

        tt.start();
        tt2.start();
    }
}
